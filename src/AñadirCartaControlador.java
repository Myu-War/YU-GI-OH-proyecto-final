import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	public static void main(String [] args){
			AñadirCartaControlador self=new AñadirCartaControlador();
		}
	}
