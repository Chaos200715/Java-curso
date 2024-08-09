package encapsulación;

public class automovil {
	private int precio;
	private String marca;
	
	public static  void Automobil() {
		System.out.println("Hey");
		
	}

	public int getPrecio() {
		return this.precio;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
}
