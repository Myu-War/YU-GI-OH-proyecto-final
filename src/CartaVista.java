import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;

public class CartaVista extends JFrame {
	protected JTextArea carta,img;
	protected JLabel pirata=new JLabel(""),pirata2=new JLabel(""),pirata3=new JLabel("");
	protected JButton v = new JButton("Vender");
	protected JButton r = new JButton("Regresar");
	
	public CartaVista(){
		super("Carta");
		
		//creacion de componentes
		r.setBackground(java.awt.Color.red);
		v.setBackground(java.awt.Color.yellow);
		carta= new JTextArea(500,500);
		carta.setText("\nn\nn\nn");
		img= new JTextArea(5000,5000);
		img.setText("\nimg\nimg\nimg");
		
		//adiciona al contenedor: JPanel
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(0,1));
		Border gap=BorderFactory.createEmptyBorder(10,10,10,10);
		p.setBorder(gap);
	
		
		p.add(img);
		p.add(pirata);		
		p.add(pirata2);
		p.add(carta);
		p.add(v);
		p.add(r);
		
		this.add(p);
		
		//visualizacion
		setBounds(500,300,250,250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String [] args){
	 CartaVista yo=new CartaVista();
	}
	
}