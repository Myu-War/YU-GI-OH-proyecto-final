import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class InicioControlador extends InicioVista {
	
	public InicioControlador(){
		super();
		buscar.addActionListener(new EscuchadorRes());
		añadirC.addActionListener(new EscuchadorRes());
	}
	
	private class EscuchadorRes implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String carta;

			carta = nombreTxt.getText();
			if (ae.getActionCommand().equals("Buscar")) {
				BusquedaControlador yo = new BusquedaControlador();
			}
			if (ae.getActionCommand().equals("Añadir Carta(s)")) {
				AñadirCartaControlador yo = new AñadirCartaControlador();
			}
		}
	}
	
	public static void main(String [] args){
			InicioControlador self=new InicioControlador();
		}
	}
