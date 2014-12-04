import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InicioControlador extends InicioVista {
	private static ListadoCartas listadoCartas;
	
	public InicioControlador(){
		super();
		buscar.addActionListener(new EscuchadorRes());
		añadirC.addActionListener(new EscuchadorRes());
		cargaDatos();
	}
	
	private class EscuchadorRes implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String carta;

			carta = nombreTxt.getText();
			if (ae.getActionCommand().equals("Buscar")) {
				BusquedaControlador yo = new BusquedaControlador(listadoCartas);
			}
			if (ae.getActionCommand().equals("Añadir Carta(s)")) {
				AñadirCartaControlador yo = new AñadirCartaControlador();
			}
		}
	}
	
	private void cargaDatos()
	{

		String linea, nombre, rareza, expansion, auxS;
		int cantidad, cant;
		boolean stEdi;
		Scanner lec = null;
		File ent = new File("cartas.txt");
		listadoCartas = new ListadoCartas("Busqueda");
		String datosCarta[];

		try {
			lec = new Scanner(ent);
		} catch (FileNotFoundException fnfe) {	
			System.err.println("ERROR" + fnfe);
			System.exit(-1);
		}
		
		linea = "";
		while(lec.hasNextLine()) {
			linea = lec.nextLine();
			System.out.println(linea);
			//ver http://stackoverflow.com/questions/917822/tokenizing-error-java-util-regex-patternsyntaxexception-dangling-metacharacter
			datosCarta = linea.split("\\+");
			if (datosCarta.length == 5)
			{
				nombre = datosCarta[0];
				rareza = datosCarta[1];
				expansion = datosCarta[2];
				cantidad = Integer.parseInt(datosCarta[3]);
				stEdi = datosCarta[4].equals("true");
				listadoCartas.addCarta(nombre, rareza, expansion, stEdi, cantidad);
			}
		}
		System.out.print(listadoCartas.toString());
		lec.close();
	}
	
	public static void main(String [] args){
			InicioControlador self=new InicioControlador();
		}
	}
