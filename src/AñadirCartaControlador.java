import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class A�adirCartaControlador extends A�adirCartaVista {
	
	public A�adirCartaControlador(){
		super();
		regresar.addActionListener(new EscuchadorB());
		a�adir.addActionListener(new EscuchadorB());
	}
	
	private class EscuchadorB implements ActionListener {
		protected JOptionPane mensajeEmergente= new JOptionPane();
		
		public void actionPerformed(ActionEvent ae) {
			String nombre, rareza, expansion;
			boolean edition;
			int cantidad;

			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
			if (ae.getActionCommand().equals("A�adir")) {
				if(nomTxt.getText().equals("") || rarTxt.getText().equals("") || expTxt.getText().equals("") || stTxt.getText().equals("") || canTxt.getText().equals("") ){
					mensajeEmergente.showMessageDialog(a�adir,"Llena todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else{
					nombre = nomTxt.getText();
					rareza= rarTxt.getText();
					expansion = expTxt.getText();
					edition = Boolean.parseBoolean(stTxt.getText()); 
					if(edition || stTxt.getText().equals("si") ||  stTxt.getText().equals("SI")){
						edition = true;
					}
					cantidad = Integer.parseInt(canTxt.getText());
					guardaDatos(nombre, rareza, expansion, edition ,cantidad);
					System.out.println("CARTA A�ADIDA");
					System.out.println("Nombre: "+nombre);
					System.out.println("Rareza: "+rareza);
					System.out.println("Expansion: "+expansion);
					System.out.println("1st Edition: "+edition);
					System.out.println("Cantidad: "+cantidad);
					mensajeEmergente.showMessageDialog(a�adir,"Carta A�adida");
					
					dispose();
					A�adirCartaControlador yo = new A�adirCartaControlador();
					InicioControlador.cargaDatos();
				}
			}
		}
	}
	
	private void guardaDatos(String nombre, String rareza, String expansion, boolean st, int cantidad){
		
		try{
			File ent = new File("cartas.txt");
			FileWriter TextOut = new FileWriter(ent, true);
			TextOut.write("\n"+nombre+"+"+rareza+"+"+expansion+"+"+cantidad+"+"+st);
			TextOut.close();
			}catch(IOException e){};
	}
	
	public static void main(String [] args){
			A�adirCartaControlador self=new A�adirCartaControlador();
		}
	}
