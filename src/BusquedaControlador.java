import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class BusquedaControlador extends BusquedaVista {
	// private int indiceCarta = 0;
	protected String datosPrueba[] = { "Summon skull", "Giant Rat",
			"Hane-hane", "Dark hole", "Soul charge", "Kuribo", "Dark Bribe" };
	protected int indiceCarta = 0;
	// public static String indicaExp;
	private int ind1 = 0, ind2 = 1, ind3 = 2;

	public BusquedaControlador() {
		super();
		construye();
		while (indiceCarta < MAXCARTAS && indiceCarta < datosPrueba.length) {
			btnsCartas[indiceCarta].setText(datosPrueba[indiceCarta]);
			indiceCarta++;
		}
	}

	public BusquedaControlador(ListadoCartas listadoCartas) {
		super();
		construye();
		while (indiceCarta < MAXCARTAS
				&& indiceCarta < listadoCartas.getNumCartas()) {
			btnsCartas[indiceCarta].setText(listadoCartas
					.getNombreCarta(indiceCarta));
			indiceCarta++;
		}
	}

	private void construye() {
		regresar.addActionListener(new Escuchador());
		btnArriba.addActionListener(new Escuchador());
		btnAbajo.addActionListener(new Escuchador());
		btnsCartas[0].addActionListener(new EscuchadorB1());
		btnsCartas[1].addActionListener(new EscuchadorB2());
		btnsCartas[2].addActionListener(new EscuchadorB3());
	}

	private class EscuchadorB1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (btnsCartas[0].getText() != "---") {
				CartaControlador self = new CartaControlador(
						btnsCartas[0].getText(), ind1);
			}
		}
	}

	private class EscuchadorB2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (btnsCartas[1].getText() != "---") {
				CartaControlador self = new CartaControlador(
						btnsCartas[1].getText(), ind2);
			}
		}
	}

	private class EscuchadorB3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (btnsCartas[2].getText() != "---") {
				CartaControlador self = new CartaControlador(
						btnsCartas[2].getText(), ind3);
			}
		}
	}

	private class Escuchador implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
				InicioControlador self = new InicioControlador();
			}
			if (ae.getActionCommand().equals("▲")) {
				int k = 0, j = indiceCarta - (MAXCARTAS - 1);

				if (indiceCarta >= InicioControlador.listadoCartas.getCartas().size() || btnsCartas[2].getText() == "---") {

				} else {
					ind1 = ind1 + 1;
					ind2 = ind2 + 1;
					ind3 = ind3 + 1;
					while (k < MAXCARTAS
							&& indiceCarta < InicioControlador.listadoCartas
									.getNumCartas()) {
						btnsCartas[k].setText(InicioControlador.listadoCartas
								.getNombreCarta(j));
						j++;
						k++;
					}
					indiceCarta++;
				}
				// System.out.println("j: "+j);
				// System.out.println("indice: "+indiceCarta);
			}
			if (ae.getActionCommand().equals("▼")) {
				int k = 0, j = indiceCarta - (MAXCARTAS + 1);

				if (j < 0 || btnsCartas[2].getText() == "---")  {

				} else {
					// System.out.println("j: "+j);
					// System.out.println("indice: "+indiceCarta);
					ind1 = ind1 - 1;
					ind2 = ind2 - 1;
					ind3 = ind3 - 1;
					while (k < MAXCARTAS && indiceCarta - (MAXCARTAS + 1) >= 0) {
						btnsCartas[k].setText(InicioControlador.listadoCartas
								.getNombreCarta(j));
						j++;
						k++;
					}
					indiceCarta--;
				}
			}
		}
	}

	public static void main(String[] args) {
		BusquedaControlador self = new BusquedaControlador();
	}
}
