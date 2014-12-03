import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Mario
 * 28/11/2014
 */
public class EjecutableListadoCartas {
	public static void main(String[] args) {
		ListadoCartas l;
		String nombre, rareza, expansion, auxS;
		int auxN, cantidad, cant;
		boolean stEdi;
		Scanner lec = null;
		File ent = new File("cartas.txt");
		l = new ListadoCartas("Busqueda");

		try {
			lec = new Scanner(ent);
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERROR" + fnfe);
			System.exit(-1);
		}
		auxN = lec.nextInt();
		System.out.println(auxN);
		for (int i = 1; i <= auxN; i++) {
			nombre = lec.next();
			rareza = lec.next();
			expansion = lec.next();
			cantidad = lec.nextInt();
			stEdi = lec.nextBoolean();
			l.addCarta(nombre, rareza, expansion, stEdi, cantidad);
		}
		System.out.println(l.getCartas());
		auxN = lec.nextInt();
		cant = lec.nextInt();
		System.out.println("\nVendiste:");
		System.out.println(cant + " " + l.venderCarta(auxN, cant));
		System.out.println(l.getCartas());
		nombre = lec.next();
		rareza = lec.next();
		expansion = lec.next();
		cantidad = lec.nextInt();
		stEdi = lec.nextBoolean();
		l.addCarta(nombre, rareza, expansion, stEdi, cantidad);
		System.out.println(l.getCartas());
		System.out.println(l.busqueda("giant-rat"));
		lec.close();
	}
}
