import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class InicioControlador extends InicioVista {
	
	public InicioControlador(){
		super();
		b.addActionListener(new EscuchadorRes());
		a.addActionListener(new EscuchadorRes());
	}
	
	private class EscuchadorRes implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String carta;

			carta = nombreTxt.getText();
			if (ae.getActionCommand().equals("Buscar")) {
				BusquedaControlador yo = new BusquedaControlador();
			}
			if (ae.getActionCommand().equals("A�adir Carta(s)")) {
				A�adirCartaControlador yo = new A�adirCartaControlador();
			}
		}
	}
	
	public static void main(String [] args){
			InicioControlador self=new InicioControlador();
		}
	}
