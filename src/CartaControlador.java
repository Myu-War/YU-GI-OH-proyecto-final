import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class CartaControlador extends CartaVista {
	
	public CartaControlador(){
		super();
		regresar.addActionListener(new Escuchador());
		vender.addActionListener(new Escuchador());
	}
	
	private class Escuchador implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("Vender")) {
				VenderCartaVista yo = new VenderCartaVista();
			}
			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
		}
	}
	
	public static void main(String [] args){
			CartaControlador self=new CartaControlador();
		}
	}
