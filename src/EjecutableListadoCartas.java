import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Mario
 * 28/11/2014
 */
public class EjecutableListadoCartas {
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
			//System.out.println(linea);
			//ver http://stackoverflow.com/questions/917822/tokenizing-error-java-util-regex-patternsyntaxexception-dangling-metacharacter
			datosCarta = linea.split("\\+");
			if (datosCarta.length == 5)
			{
				nombre = datosCarta[0];
				rareza = datosCarta[1];
				expansion = datosCarta[2];
				cantidad = Integer.parseInt(datosCarta[3]);
				stEdi = datosCarta[4].equals("true");
				l.addCarta(nombre, rareza, expansion, stEdi, cantidad);
			}
		}
		System.out.print(l.toString());
		System.out.print("\n\nVendiste: "+l.venderCarta(1, 3));
		System.out.print(l.toString());
		System.out.print(l.busqueda("summon skull"));
		lec.close();
	}
}
