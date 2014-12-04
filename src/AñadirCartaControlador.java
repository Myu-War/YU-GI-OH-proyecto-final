import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class AñadirCartaControlador extends AñadirCartaVista {
	
	public AñadirCartaControlador(){
		super();
		regresar.addActionListener(new EscuchadorB());
		añadir.addActionListener(new EscuchadorB());
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
			if (ae.getActionCommand().equals("Añadir")) {
				if(nomTxt.getText().equals("") || rarTxt.getText().equals("") || expTxt.getText().equals("") || stTxt.getText().equals("") || canTxt.getText().equals("") ){
					mensajeEmergente.showMessageDialog(añadir,"Llena todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else{
					nombre = nomTxt.getText();
					rareza= rarTxt.getText();
					expansion = expTxt.getText();
					edition = Boolean.parseBoolean(stTxt.getText()); 
					cantidad = Integer.parseInt(canTxt.getText());
					guardaDatos();
					System.out.println("CARTA AÑADIDA");
					System.out.println("Nombre: "+nombre);
					System.out.println("Rareza: "+rareza);
					System.out.println("Expansion: "+expansion);
					System.out.println("1st Edition: "+edition);
					System.out.println("Cantidad: "+cantidad);
					mensajeEmergente.showMessageDialog(añadir,"Carta Añadida");
					
					dispose();
					AñadirCartaControlador yo = new AñadirCartaControlador();
				}
			}
		}
	}
	
	private void guardaDatos(){
		
		try{
			File ent = new File("cartas.txt");
			FileWriter w = new FileWriter(ent);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);  
			wr.write("Esta es una linea de codigo");//escribimos en el archivo
			wr.append(" - y aqui continua"); //concatenamos en el archivo sin borrar lo existente
			wr.close();
			bw.close();
			}catch(IOException e){};
	}
	
	public static void main(String [] args){
			AñadirCartaControlador self=new AñadirCartaControlador();
		}
	}
