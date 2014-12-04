import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicComboBoxRenderer;


public class BusquedaVista extends JFrame {
	protected JButton regresar=new JButton("Regresar");
	protected JButton btnArriba = new JButton("▲");
	protected JButton btnAbajo = new JButton("▼");
	protected JLabel fantasma = new JLabel("");
	protected final int MAXCARTAS = 3;
	protected JPanel p = new JPanel();
	protected JButton[] btnsCartas = new JButton[MAXCARTAS];
	protected String datosPrueba[] = {"Summon skull", "Giant Rat", "Hane-hane", "Dark hole", "Soul charge","Kuribo","Dark Bribe"};
	protected int indiceCarta = 0;
	
	public BusquedaVista() {
		super("Busqueda");

		// creacion de componentes
		JButton carta;
		for (int i = 0; i<MAXCARTAS; i++)
		{
			carta = new JButton("--");
			btnsCartas[i] = carta;
		}
	     regresar.setBackground(java.awt.Color.cyan);

		// adiciona al contenedor: JPanel
		p.setLayout(new GridLayout(7,1));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);
		
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
		p.add(fantasma);
		p.add(regresar);
		this.add(p);

		// visualizacion
		setBounds(300, 300, 350, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		BusquedaVista yo = new BusquedaVista();
	}
}
