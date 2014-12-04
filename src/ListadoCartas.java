/*Mario	
 * 28/11/2014
 */

public class ListadoCartas {
	private String titulo;
	private ListaArregloOrdenada<Carta> cartas;

	public ListadoCartas() {
		cartas = new ListaArregloOrdenada<Carta>();
	}

	public ListadoCartas(String titulo) {
		this();
		this.titulo = titulo;
	}

	public int getNumCartas() {
		return cartas.size();
	}

	public String getCartas() {
		return cartas.toString();
	}

	public boolean addCarta(String nombre, String rareza, String expansion,
			boolean stEdi, int cantidad) {
		Carta x;
		int i = 0;
		boolean ans;

		x = new Carta(nombre, rareza, expansion, stEdi, cantidad);
		ans = cartas.add(x);
		
		return ans;
	}

	public String venderCarta(int i, int cantidad) {
		String res = "Carta no encontrada.";
		Carta x = null;

		if (cartas.get(i).getCantidad() - cantidad <= 0) {
			x = cartas.remove(i);
		} else {
			cartas.get(i).setCantidad(cartas.get(i).getCantidad() - cantidad);
			x = cartas.get(i);
		}
		if (x != null) {
			res = x.getExpansion();
		}

		return res;
	}
	
	public ListaArregloOrdenada busqueda(String carta){
		ListaArregloOrdenada<Carta> res=new ListaArregloOrdenada();
		
		if(carta.equals("")){
			res=cartas;
		}
		else{
			for (int i = 0; i < cartas.size(); i++) {
				if (cartas.get(i).getNombre().equals(carta)) {
					res.add(cartas.get(i));
				}
			}
		}
		
		return res;
	}
	
	public String getNombreCarta(int indice){
		
		return this.cartas.get(indice).getNombre();
		
	}

	public int compareTo(ListadoCartas otro) {
		return this.titulo.compareTo(otro.titulo);
	}

	public String toString() {
		StringBuilder cad = new StringBuilder();

		cad.append("\nTitulo: " + titulo);
		cad.append("\nResultado: " + cartas);

		return cad.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListadoCartas other = (ListadoCartas) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}