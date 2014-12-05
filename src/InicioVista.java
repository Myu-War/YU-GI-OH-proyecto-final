import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class InicioVista extends JFrame {
	protected JLabel nombreLb;
	protected JTextField nombreTxt;
	protected JButton buscar = new JButton("Buscar");
	protected JButton añadirC = new JButton("Añadir Carta(s)");

	public InicioVista() {
		super("Inicio");

		// creacion de componentes
		nombreLb = new JLabel("Nombre:");
		nombreTxt = new JTextField(50);
		buscar.setBackground(java.awt.Color.yellow);
		añadirC.setBackground(java.awt.Color.green);

		// adiciona al contenedor: JPanel
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 4));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);

		p.add(nombreLb);
		p.add(nombreTxt);
		p.add(buscar);
		p.add(añadirC);
		this.add(p);

		// visualizacion
		setBounds(500, 300, 250, 120);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		InicioVista yo = new InicioVista();
	}

}