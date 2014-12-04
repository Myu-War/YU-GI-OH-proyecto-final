import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class VenderCartaControlador extends VenderCartaVista {
	
	public VenderCartaControlador(){
		super();
		regresar.addActionListener(new Escuchador());
		vender.addActionListener(new Escuchador());
	}
	
	private class Escuchador implements ActionListener {
		protected JOptionPane mensajeEmergente= new JOptionPane();
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("Vender")) {
			
				mensajeEmergente.showMessageDialog(vender,"Carta Vendida");
				dispose();
			}
			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
		}
	}
	
	public static void main(String [] args){
			VenderCartaControlador self=new VenderCartaControlador();
		}
	}
