package cl.falaca.model;

public class Patient extends User{
	
	String birthday;
	double weight;
	double height;
	String blood;
	
	public Patient(String name, String email) {
		super(name,email);	
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getWeight() {
		return weight + "kg";
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return height + "m";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Age : "+birthday + "\n Weight: "+getWeight()+"\n Height: "+getHeight()+"\n Blood :" + blood;
	}

}
