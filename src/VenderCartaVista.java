import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;

public class VenderCartaVista extends JFrame {
	protected JLabel cantidadLb;
	protected JTextField cantidadTxt;
	protected JButton vender = new JButton("Vender");
	protected JButton regresar = new JButton("Regresar");

	public VenderCartaVista() {
		super("Vender");

		// creacion de componentes
		cantidadLb = new JLabel("Cantidad:");
		cantidadTxt = new JTextField(3);
		regresar.setBackground(java.awt.Color.cyan);
		vender.setBackground(java.awt.Color.yellow);

		// adiciona al contenedor: JPanel
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2, 2));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);

		p.add(cantidadLb);
		p.add(cantidadTxt);
		p.add(vender);
		p.add(regresar);
		this.add(p);

		// visualizacion
		setBounds(500, 300, 250, 120);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}