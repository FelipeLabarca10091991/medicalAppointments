package cl.falaca.main;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

	private String speciality;
	
	public Doctor(String name, String email) {
		super(name,email);
		this.speciality = speciality;
	}
	
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public void setAvailableAppointment(ArrayList<AvailableAppointment> availableAppointment) {
		this.availableAppointment = availableAppointment;
	}

	

	//coleccion 
	ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
	
	
	//metodo que añade una cita a la coleccion
	public void addAvailableAppointment (Date date, String time) {
		availableAppointment.add(new AvailableAppointment(date,time));
	}
	
	//metodo que devuelve el arrayList creado con las citas
	public ArrayList<AvailableAppointment> getAvailableAppointment() {	
		return availableAppointment; 
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nSpeciality" + speciality +"\n Available" + availableAppointment.toString();
	}
	
	public static class AvailableAppointment{
		

		private int id;
		private Date date;
		private String time;
		
		public AvailableAppointment(Date date, String time) {
			
			this.date = date;
			this.time = time;
		}
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}
		
		@Override
		public String toString() {

			return "Avalilable Appointments \nDate: "+date+"\nTime: "+ time;
		}
	}
	
	
}
