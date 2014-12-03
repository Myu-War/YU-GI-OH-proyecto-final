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
	protected JButton r=new JButton("Regresar"), auxJB= new JButton("holo");
	protected JLabel t=new JLabel("");
	protected JComboBox c=new JComboBox(new Object[] {auxJB, auxJB});
	protected ListadoCartas l= new ListadoCartas();
	protected int n;
	protected String a="S";
	
	public BusquedaVista() {
		super("Busqueda");

		// creacion de componentes
		for (int i=0; i<5; i++){
			auxJB= new JButton(a);
			c.add(auxJB);
		}
		getContentPane().add(c);
	      c.setRenderer(new ButtonComboBoxRenderer());
	     r.setBackground(java.awt.Color.red);

		// adiciona al contenedor: JPanel
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,1));
		Border gap = BorderFactory.createEmptyBorder(10, 10, 10, 10);
		p.setBorder(gap);

		p.add(c);
		p.add(t);
		p.add(r);
		this.add(p);

		// visualizacion
		setBounds(300, 300, 350, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		BusquedaVista yo = new BusquedaVista();
	}
	
	class ButtonComboBoxRenderer extends BasicComboBoxRenderer implements ListCellRenderer
	{
	   public ButtonComboBoxRenderer() {
	      super();
	   }
	    
	   public Component getListCellRendererComponent( JList list,
	           Object value, int index, boolean isSelected, boolean cellHasFocus) {
	      if (isSelected) {
	          setBackground(list.getSelectionBackground());
	          setForeground(list.getSelectionForeground());
	      }
	      else {
	          setBackground(list.getBackground());
	          setForeground(list.getForeground());
	      }
	  
	      setFont(list.getFont());
	      if (value instanceof Icon) {
	         setIcon((Icon)value);
	      }
	      if (value instanceof JButton) {
	         return (Component) value;
	      }
	      else {
	         setText((value == null) ? "" : value.toString());
	      }
	  
	      return this;
	  } 
	}
}
