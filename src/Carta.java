/*Mario	
 * 27/11/2014
 */

public class Carta implements Comparable <Carta>{
	private String nombre;
	private String rareza;
	private String expansion;
	private boolean stEdi;
	private int cantidad;

	public Carta(){
		
	}
	
	public Carta(String nombre, String rareza, String expansion, boolean stEdi, int cantidad){
		this.nombre=nombre;
		this.rareza=rareza;
		this.expansion=expansion;
		this.stEdi=stEdi;
		this.cantidad=cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}

	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	public boolean getStEdi() {
		return stEdi;
	}

	public void setStEdi(boolean stEdi) {
		this.stEdi = stEdi;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	
	
	public int compareTo(Carta otro){
		return this.expansion.compareTo(otro.expansion);
	}
	
	public String toString(){
		StringBuilder cad=new StringBuilder();
		
		cad.append("\nNombre de la Carta: "+nombre);
		cad.append("\nRareza: "+rareza);
		cad.append("\nExpansión: "+expansion);
		cad.append("\nCantidad: "+cantidad);
		if(stEdi){
			cad.append("\n1st Edition\n");
		}
		else{
			cad.append("\nUnlimited\n");
		}
		
		return cad.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((expansion == null) ? 0 : expansion.hashCode());
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
		Carta other = (Carta) obj;
		if (expansion == null) {
			if (other.expansion != null)
				return false;
		} else if (!expansion.equals(other.expansion))
			return false;
		return true;
	}
}