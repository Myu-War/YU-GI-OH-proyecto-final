import java.util.ArrayList;

/*12/10/2014
 * Mario
 * Manejador de Arreglos generico
 */
public class ManArrT {

	public static <T extends Comparable<T>> int elementoMayor(T[] arr, int n) {
		int max = 0;

		for (int i = 1; i < n; i++) {
			if (arr[max].compareTo(arr[i]) < 0)
				max = i;
		}

		return max;
	}

	public static <T extends Comparable<T>> int elementoMenor(T[] arr, int n) {
		int min = 0;

		for (int i = 1; i < n; i++)
			if (arr[min].compareTo(arr[i]) > 0)
				min = i;

		return min;
	}

	public static <T extends Comparable<T>> int nElementosMayor(T[] arr, int n,
			T p) {
		int z = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i].compareTo(p) > 0) {
				z++;
			}
		}

		return z;
	}

	public static <T extends Comparable<T>> int nElementosMenor(T[] arr, int n,
			T p) {
		int z = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i].compareTo(p) < 0) {
				z++;
			}
		}

		return z;
	}

	public static ArrayList<Integer> elementosMayores(double[] arr, int n,
			double p) {
		ArrayList<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (arr[i] > p) {
				index.add(i);
			}
		}

		return index;
	}

	public static ArrayList<Integer> elementosMenores(double[] arr, int n,
			double p) {
		ArrayList<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (arr[i] < p) {
				index.add(i);
			}
		}

		return index;
	}

	public static <T> void kcorrerderecha(T[] arr, int n, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = null;
		}
	}

	public static <T> void kcorrerizquierda(T[] arr, int n, int k) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n - 1] = null;
		}
	}

	public static <T> void kcorrerderechaC(T[] arr, int n, int k) {
		T aux;

		for (int i = 0; i < k; i++) {
			aux = arr[n - 1];
			for (int j = n - 1; j > 0; j--)
				arr[j] = arr[j - 1];
			arr[0] = aux;
		}
	}

	public static <T> void kcorrerizquierdaC(T[] arr, int n, int k) {
		T aux;

		for (int i = 0; i < k; i++) {
			aux = arr[0];
			for (int j = 0; j < n - 1; j++)
				arr[j] = arr[j + 1];
			arr[n - 1] = aux;
		}
	}

	public static <T> void swap(T[] arr, int posX, int posY) {
		T aux;

		aux = arr[posX];
		arr[posX] = arr[posY];
		arr[posY] = aux;
	}

	public static <T> void invierte(T[] arr, int n) {
		for (int j = 0; j < n / 2; j++)
			swap(arr, j, n - j - 1);
	}

	public static <T extends Comparable<T>> int posMenor(T[] arr, int n,
			int inicio) {
		int min = inicio;

		for (int i = inicio; i < n; i++) {
			if (arr[min].compareTo(arr[i]) < 0)
				min = i;
		}

		return min;
	}

	public static <T extends Comparable<T>> int posMayor(T[] arr, int n,
			int inicio) {
		int max = inicio;

		for (int i = inicio; i < n; i++) {
			if (arr[max].compareTo(arr[i]) > 0)
				max = i;
		}

		return max;
	}

	public static <T extends Comparable<T>> void seleccionDirecta(T[] arr, int n) {
		int menor;

		for (int i = 0; i < n - 1; i++) {
			menor = posMenor(arr, n, i);
			swap(arr, i, menor);
		}
	}

	public static <T extends Comparable<T>> int buscaSecuencialOrdenada(
			T[] arr, int n, T x) {
		int i = 0;

		while (i < n && arr[i].compareTo(x) < 0) {
			i++;
		}
		if (i >= n || !arr[i].equals(x)) {
			i = -i - 1;
		}
		return i;
	}

	public static <T extends Comparable<T>> void corrimientosDerecha(T[] arr,
			int pos, int n) {

		for (int i = n; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos] = null;
	}

	public static <T> void elementsToRight(T[] arr, int n, int index) {
		for (int j = n; j > index; j--) {
			arr[j] = arr[j - 1];
		}
	}

	public static <T> void elementsToLeft(T[] arr, int n, int index) {
		for (int j = index; j < n - 1; j++) {
			arr[j] = arr[j + 1];
		}
	}

	public static <T> int buscaBinaria(T[] arr, int n, T x) {
		int pos;
		int inicio = 0;
		int fin = n - 1;
		int mitad = (inicio + fin) / 2;

		while (inicio <= fin && arr[mitad] != x) {
			if (((Integer) x).compareTo((Integer) arr[mitad]) < 0) {
				fin = mitad - 1;
			} else {
				inicio = mitad + 1;
			}
			mitad = (inicio + fin) / 2;
		}
		if (inicio < fin) {
			pos = -inicio - 1;
		} else {
			pos = mitad;
		}
		return pos;
	}

	public static <T> int buscaSecuencialDesordenada(T[] a, int n, T x) {
		int i = 0;

		while (i < n && a[i] != x) {
			i++;
		}
		if (i == n) {
			i = -1;
		}
		return i;
	}
}