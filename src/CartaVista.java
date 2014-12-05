import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;

public class CartaVista extends JFrame {
	protected JTextArea carta;
	protected JLabel pirata=new JLabel(""),pirata2=new JLabel(""),img;
	protected JButton vender = new JButton("Vender");
	protected JButton regresar = new JButton("Regresar");
	
	public CartaVista(String titulo){
		super(titulo);
		
		//creacion de componentes
		regresar.setBackground(java.awt.Color.cyan);
		vender.setBackground(java.awt.Color.yellow);
		carta= new JTextArea(500,500);
		carta.setText("\nn\nn\nn");
		img= new JLabel("");
		
		//adiciona al contenedor: JPanel
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(0,1));
		Border gap=BorderFactory.createEmptyBorder(10,10,10,10);
		p.setBorder(gap);
	
		
		p.add(img);
		p.add(pirata);		
		p.add(pirata2);
		p.add(carta);
		p.add(vender);
		p.add(regresar);
		
		this.add(p);
		
		//visualizacion
		setBounds(500,50,350,670);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String [] args){
	 CartaVista yo=new CartaVista("titulo");
	}
	
}