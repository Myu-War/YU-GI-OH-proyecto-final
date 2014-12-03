import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	
	public BusquedaControlador(){
		super();
		r.addActionListener(new EscuchadorB());
		auxJB.addActionListener(new EscuchadorB());
	}
	
	private class EscuchadorB implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
			if(ae.getActionCommand().equals("holo")){
				dispose();
			}
		}
	}
	
	public static void main(String [] args){
			InicioControlador self=new InicioControlador();
		}
	}
