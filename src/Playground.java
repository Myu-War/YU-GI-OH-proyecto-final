import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxRenderer;


public class Playground extends JFrame {
	//protected JButton r = new JButton("Regresar"), auxJB= new JButton("holo");
	//protected JLabel t = new JLabel("");
	//protected JComboBox c = new JComboBox(new Object[] {auxJB, auxJB});
	protected JButton btnArriba = new JButton("▲");
	protected JButton btnAbajo = new JButton("▼");
	private final int MAXCARTAS = 3;
	protected JButton[] btnsCartas = new JButton[MAXCARTAS];
	private String datosPrueba[] = {"Summon skull", "Giant Rat", "Hane-hane", "Dark hole", "Soul charge"};
	//protected ListadoCartas l = new ListadoCartas();
	//protected int n;
	//protected String a="S";
	
	public Playground() {
		super("Busqueda");

		JButton carta;
		for (int i = 0; i<MAXCARTAS; i++)
		{
			carta = new JButton("--");
			btnsCartas[i] = carta;
		}
		// creacion de componentes
		//for (int i=0; i<5; i++){
		//	auxJB= new JButton(a);
		//	c.add(auxJB);
		//}
		//getContentPane().add(c);
	     //c.setRenderer(new ButtonComboBoxRenderer());
	     //r.setBackground(java.awt.Color.red);

		// adiciona al contenedor: JPanel
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);
		
		int indiceCarta = 0;
		while (indiceCarta < MAXCARTAS && indiceCarta < datosPrueba.length){
			btnsCartas[indiceCarta].setText(datosPrueba[indiceCarta]);
			indiceCarta++;
		}
		
		p.add(btnArriba);
		for (int i = 0; i<MAXCARTAS; i++)
		{
			p.add(btnsCartas[i]);
		}
		p.add(btnAbajo);
		//p.add(c);
		//p.add(t);
		//p.add(r);
		this.add(p);

		// visualizacion
		setBounds(300, 300, 350, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Playground yo = new Playground();
	}
	
	private class EscuchadorAbajo implements ActionListener {
		//protected JOptionPane op= new JOptionPane();
		public void actionPerformed(ActionEvent ae) {

		}
	}
}