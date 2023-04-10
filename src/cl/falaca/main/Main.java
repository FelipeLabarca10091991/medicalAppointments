package cl.falaca.main;

import static cl.falaca.main.ui.UIMenu.*;

import java.util.Date;

import cl.falaca.model.Doctor;
import cl.falaca.model.Patient;

public class Main {

	public static void main(String[] args) {
		
		Patient patientone = new Patient("Felipe", "felipe@felipe");
		Doctor myDoctor = new Doctor("Felipe","felipe@labarca.cl");
		
		myDoctor.addAvailableAppointment(new Date(), "16:00hrs.");
		myDoctor.addAvailableAppointment(new Date(), "18:00hrs.");
		myDoctor.addAvailableAppointment(new Date(), "20:00hrs.");
		
		for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointment()) {
			System.out.println(aA.getDate() + " " + aA.getTime()); 
		}
		
		
		
		
		System.out.println(myDoctor);
	}
	

}
