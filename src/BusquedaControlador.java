import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	
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
				int indiceCarta = 0,k=0;
				indiceCarta++;
				while (k < MAXCARTAS && indiceCarta < datosPrueba.length){
					btnsCartas[k].setText(datosPrueba[indiceCarta]);
					indiceCarta++;
					k++;
				}
				
				p.add(btnArriba);
				for (int i = 0; i<MAXCARTAS; i++)
				{
					p.add(btnsCartas[i]);
				}
				p.add(btnAbajo);
				p.add(fantasma);
				p.add(regresar);
			}
			
		}
	}
	
	public static void main(String [] args){
			BusquedaControlador self=new BusquedaControlador();
		}
	}
