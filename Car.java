package M2_ACTIVITY3;

public class Car {
	private String model;
	private String color;
	private String brand;
	
	public Car() {}
	
	String getCarInfo()
	{
		return "Car model: " + this.getModel() + " color: " + this.getColor() + " brand: " + this.getBrand();
	}
	
	public Car(String model, String color, String brand)
	{
		this.model = model;
		this.color = color;
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
