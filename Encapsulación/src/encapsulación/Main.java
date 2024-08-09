package encapsulación;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automovil auto = new automovil();
		
		auto.setMarca("Ferrari");
		System.out.println("El auto es de marca: " + auto.getMarca());
		
		auto.setPrecio(100000);
		System.out.println("El precio del auto es: " + auto.getPrecio());
	}

}
