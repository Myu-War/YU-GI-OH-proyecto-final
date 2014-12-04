import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	private int indiceCarta = 0;
	
	public BusquedaControlador(){
		super();
		regresar.addActionListener(new Escuchador());
		btnArriba.addActionListener(new Escuchador());
		btnAbajo.addActionListener(new Escuchador());
	}
		
	private class Escuchador implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
			if(ae.getActionCommand().equals("▲")){
				int k=0,j=indiceCarta+1;
				
				if(indiceCarta >= datosPrueba.length-3){
					
				}
				else{
					while (k < MAXCARTAS && indiceCarta < datosPrueba.length){
						btnsCartas[k].setText(datosPrueba[j]);
						j++;
						k++;
					}
					indiceCarta++;
				}
			}
			if(ae.getActionCommand().equals("▼")){
				
			}
		}
	}
	
	public static void main(String [] args){
			BusquedaControlador self=new BusquedaControlador();
		}
	}
