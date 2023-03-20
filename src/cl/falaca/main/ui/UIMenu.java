package cl.falaca.main.ui;

import java.util.Scanner;

public class UIMenu {
	
	public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

	public static void showMenu(){
		System.out.println("Welcome to my Appointments");
		System.out.println("Please, select ");
		
		int response = 0;
		do {
			System.out.println("1. Doctor");
			System.out.println("2. Patient");
			System.out.println("0. Salir");
			
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			switch(response) {
			case 1: 
				System.out.println("Doctor");
				break;
			case 2: 
				response = 0;
				showPatient();
				break;
			case 0:
				System.out.println("Thanks for you visit");
				break;
			default:
				System.out.println("Please select a valid option");
			}
		}while(response != 0);
	}
	
	
	public static void showPatient(){
		int response = 0;
		
		do {
			System.out.println("\n\n");
			System.out.println("Patient");
			System.out.println("1. Book an Appointment");
			System.out.println("2. My Appointments");
			System.out.println("0. Return ");
			
			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());
			
			
			switch(response){
				case 1:
					System.out.println("::Book an Appointment");
					for (int i =1; i<4; i++) {
						System.out.println(i + "." + MONTHS[i-1]);
					}
					break;
				case 2:
					System.out.println("::My Appointments");
					break;
				case 0:
					showMenu();
					break;
			}
			
		}while(response != 0);
	}
}
