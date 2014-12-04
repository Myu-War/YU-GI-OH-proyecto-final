import java.awt.event.ActionEvent;

import javax.swing.*;

import java.awt.event.ActionListener;

public class CartaControlador extends CartaVista {
	
	public CartaControlador(String titulo,int indicador){
		super(titulo);
		regresar.addActionListener(new Escuchador());
		vender.addActionListener(new Escuchador());
		carta.setText(InicioControlador.listadoCartas.getCartas().get(indicador).toString());

	}
	
	private class Escuchador implements ActionListener {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getActionCommand().equals("Vender")) {
				//indicadorCarta=InicioControlador.listadoCartas.getNombreCarta(indice)
				VenderCartaControlador yo = new VenderCartaControlador();
			}
			if (ae.getActionCommand().equals("Regresar")) {
				dispose();
			}
		}
	}
}
