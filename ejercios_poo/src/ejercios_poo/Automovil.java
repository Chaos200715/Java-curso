package ejercios_poo;

public class Automovil {

	String marca;
	int modelo;
	int precios;
	
	boolean estado = false;
	
	public Automovil() {
		System.out.println("se creo el obgeto de  tipo automvil");
	}
	
	public void encender(){
		
		if(estado == true) {
			System.out.println("el automovil ya esta encendido");
		}else {
			System.out.println("el automovil ha encendido");
			estado = true;
		}
		
	}
	
	public void apagar(){
		if(estado == false) {
			System.out.println("el automovil se apago");
			estado= false;
			
		}else {
			System.out.println("El automovil ya esta apagado");
		}
		
	}
	
	public void anvazar() {
		if(estado == true) {
			System.out.println("el automovil esta anavazado");
		}else {
			System.out.println("el automovil no puede avanzar apagado.");
		}
		
	}
}
