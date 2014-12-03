/*12/11/2014
 * Mario
 * 
 */
public class ListaArregloOrdenada<T extends Comparable<T>> {
	private T[] datos;
	private int n;
	private final int MAX = 1000;

	public ListaArregloOrdenada() {
		datos = (T[]) new Comparable[MAX];
		n = 0;
	}

	public ListaArregloOrdenada(int max) {
		datos = (T[]) new Comparable[max];
		n = 0;
	}

	public ListaArregloOrdenada(T[] arr) {
		int tam;

		if (arr.length > MAX) {
			tam = arr.length * 2;
		} else {
			tam = MAX;
		}
		datos = (T[]) new Comparable[tam];
		n = arr.length;
		for (int i = 0; i < n; i++) {
			datos[i] = arr[i];
		}
		ManArrT.seleccionDirecta(datos, n);
	}

	public boolean add(T x) {
		boolean res = false;
		int pos;

		if (n == datos.length) {
			expandCapacity();
		}
		pos = ManArrT.buscaSecuencialOrdenada(datos, n, x);
		if (pos < 0) {
			pos = -pos - 1;
			ManArrT.elementsToRight(datos, n, pos);
			datos[pos] = x;
			n++;
			res = true;
		}

		return res;
	}

	public void expandCapacity() {
		T[] datosMasGrandes = (T[]) new Object[datos.length * 2];

		for (int i = 0; i < n; i++) {
			datosMasGrandes[i] = datos[i];
		}
		datos = datosMasGrandes;
	}

	public boolean addR(T x, int pos) {
		boolean res = false;

		if (n == datos.length) {
			expandCapacity();
		}
		if (pos >= 0) {
			ManArrT.elementsToRight(datos, n, pos);
			datos[pos] = x;
			n++;
			res = true;
		}

		return res;
	}

	public T remove(T x) {
		int pos;

		pos = indexOf(x);

		return remove(pos);
	}

	public T remove(int pos) {
		T aux = null;

		if (pos < n) {
			if (pos >= 0 && pos < n) {
				aux = datos[pos];
				ManArrT.elementsToLeft(datos, n, pos);
				n--;
				datos[n] = null;
			}
		}

		return aux;
	}

	public int indexOf(T x) {
		return ManArrT.buscaSecuencialOrdenada(datos, n, x);
	}

	public int size() {
		return n;
	}

	public void clear() {
		datos = (T[]) new Comparable[MAX];
		n = 0;
	}

	public T get(int i) {
		T x = null;

		if (i >= 0 && i < n) {
			x = datos[i];
		}

		return x;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public boolean contains(T x) {
		boolean res = false;

		if (ManArrT.buscaSecuencialOrdenada(datos, n, x) >= 0) {
			res = true;
		}

		return res;
	}

	public String toString() {
		StringBuilder cad = new StringBuilder();

		cad.append("\nTamaño de la lista: " + n + "\n" + "\n");
		cad.append("[  ");
		for (int i = 0; i < n; i++) {
			cad.append(datos[i].toString() + "  ");
		}
		cad.append("]");
		return cad.toString();
	}
}