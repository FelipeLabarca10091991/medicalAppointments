package cl.falaca.main;

public class Doctor {

	public static int id = 0;
	String name;
	String speciality;
	
	public Doctor(){
		System.out.println("Doctor creado correctamente");
		id++;
	}
	
	
	public Doctor(String name, String speciality) {
		this.name = name;
		this.speciality = speciality;
	}
	
	
	
	public void showName(){
		System.out.println(name);
	}
	
	public void showId() {
		System.out.println("El ID del Doctor " + name + " es: " + id);
	}
	
}
