import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;

public class A�adirCartaVista extends JFrame {
	protected JLabel nomLb, rarLb, expLb, stLb, canLb;
	protected JTextField nomTxt, rarTxt, expTxt, stTxt, canTxt;
	protected JButton a�adir = new JButton("A�adir");
	protected JButton regresar = new JButton("Regresar");
	
	public A�adirCartaVista() {
		super("A�adir Carta");

		// creacion de componentes
		nomLb = new JLabel("Nombre:");
		nomTxt = new JTextField(50);
		rarLb = new JLabel("Rareza:");
		rarTxt = new JTextField(20);
		expLb = new JLabel("Expansi�n:");
		expTxt = new JTextField(10);
		stLb = new JLabel("1st Edition:");
		stTxt = new JTextField(5);
		canLb = new JLabel("Cantidad:");
		canTxt = new JTextField(3);
		regresar.setBackground(java.awt.Color.red);
		a�adir.setBackground(java.awt.Color.green);

		// adiciona al contenedor: JPanel
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6, 2));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);

		p.add(nomLb);
		p.add(nomTxt);
		p.add(rarLb);
		p.add(rarTxt);
		p.add(expLb);
		p.add(expTxt);
		p.add(stLb);
		p.add(stTxt);
		p.add(canLb);
		p.add(canTxt);
		p.add(a�adir);
		p.add(regresar);
		this.add(p);

		// visualizacion
		setBounds(450, 400, 350, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		A�adirCartaVista yo = new A�adirCartaVista();
	}
}