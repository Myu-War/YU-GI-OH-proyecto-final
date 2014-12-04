import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	//private int indiceCarta = 0;
	
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
				int k=0,j=indiceCarta-(MAXCARTAS-1);
				
				if(indiceCarta >= datosPrueba.length){
					
				}
				else{
					while (k < MAXCARTAS && indiceCarta < datosPrueba.length){
						btnsCartas[k].setText(datosPrueba[j]);
						j++;
						k++;
					}
					indiceCarta++;
				}
				//System.out.println("j: "+j);
				//System.out.println("indice: "+indiceCarta);
			}
			if(ae.getActionCommand().equals("▼")){
				int k=0,j=indiceCarta-(MAXCARTAS+1);
				
				if(j < 0){
					
				}
				else{
					//System.out.println("j: "+j);
					//System.out.println("indice: "+indiceCarta);
					while (k < MAXCARTAS && indiceCarta-(MAXCARTAS+1) >= 0){
						btnsCartas[k].setText(datosPrueba[j]);
						j++;
						k++;
					}
					indiceCarta--;
				}
			}
		}
	}
	
	public static void main(String [] args){
			BusquedaControlador self=new BusquedaControlador();
		}
	}
