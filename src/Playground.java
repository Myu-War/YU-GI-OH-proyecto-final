import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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


public class Playground {
	
	public static void main(String[] args) {
		ListadoCartas l;
		String linea, nombre, rareza, expansion, auxS;
		int cantidad, cant;
		boolean stEdi;
		Scanner lec = null;
		File ent = new File("cartas.txt");
		l = new ListadoCartas("Busqueda");
		String datosCarta[];

		try {
			lec = new Scanner(ent);
		} catch (FileNotFoundException fnfe) {	
			System.err.println("ERROR" + fnfe);
			System.exit(-1);
		}
		
		linea = "";
		while(lec.hasNextLine()) {
			linea = lec.nextLine();
			System.out.println(linea);
		}
		datosCarta = linea.split("*-*");
		//nombre = lec.nextLine();
		//rareza = lec.next();
		//expansion = lec.next();
		//cantidad = lec.nextInt();
		//stEdi = lec.nextBoolean();
		lec.close();
	}
	
}