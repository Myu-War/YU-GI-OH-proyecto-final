import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	//private int indiceCarta = 0;
	protected String datosPrueba[] = {"Summon skull", "Giant Rat", "Hane-hane", "Dark hole", "Soul charge","Kuribo","Dark Bribe"};
	protected int indiceCarta = 0;

	public BusquedaControlador(){
		super();
		construye();
		while (indiceCarta < MAXCARTAS && indiceCarta < datosPrueba.length){
			btnsCartas[indiceCarta].setText(datosPrueba[indiceCarta]);
			indiceCarta++;
		}
	}

	
	public BusquedaControlador(ListadoCartas listadoCartas){
		super();
		construye();
		while (indiceCarta < MAXCARTAS && indiceCarta < listadoCartas.getNumCartas()){
			btnsCartas[indiceCarta].setText(listadoCartas.getNombreCarta(indiceCarta));
			indiceCarta++;
		}
	}
	
	private void construye(){
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
					while (k < MAXCARTAS && indiceCarta < InicioControlador.listadoCartas.getNumCartas()){
						btnsCartas[k].setText(InicioControlador.listadoCartas.getNombreCarta(j));
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
						btnsCartas[k].setText(InicioControlador.listadoCartas.getNombreCarta(j));
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
