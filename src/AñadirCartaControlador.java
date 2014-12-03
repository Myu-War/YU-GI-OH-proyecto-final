import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class AņadirCartaControlador extends AņadirCartaVista {
	
	public AņadirCartaControlador(){
		super();
		r.addActionListener(new EscuchadorB());
		a.addActionListener(new EscuchadorB());
	}
	
	private class EscuchadorB implements ActionListener {
		protected JOptionPane op= new JOptionPane();
		public void actionPerformed(ActionEvent ae) {
			String nombre, rareza, expansion;
			boolean edition;
			int cantidad;

			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
			if (ae.getActionCommand().equals("Aņadir")) {
				if(nomTxt.getText().equals("") || rarTxt.getText().equals("") || expTxt.getText().equals("") || stTxt.getText().equals("") || canTxt.getText().equals("") ){
					op.showMessageDialog(a,"Llena todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else{
					nombre = nomTxt.getText();
					rareza= rarTxt.getText();
					expansion = expTxt.getText();
					edition = Boolean.parseBoolean(stTxt.getText()); 
					cantidad = Integer.parseInt(canTxt.getText());
					System.out.println("CARTA AŅADIDA");
					System.out.println("Nombre: "+nombre);
					System.out.println("Rareza: "+rareza);
					System.out.println("Expansion: "+expansion);
					System.out.println("1st Edition: "+edition);
					System.out.println("Cantidad: "+cantidad);
					op.showMessageDialog(a,"Carta Aņadida");
					dispose();
					AņadirCartaControlador yo = new AņadirCartaControlador();
				}
			}
		}
	}
	
	public static void main(String [] args){
			AņadirCartaControlador self=new AņadirCartaControlador();
		}
	}
