public class Car {

	private String make;
	private String model; 
	private String color;
	private double price;
	private double miles;

	//2 overloaded constructors that sets the instance variables to the passed-in values. Same name to class
	public Car () {
		miles = 0;
		make = "Nissan";
		model = "Rouge";
		color = "Black";
		price = 30000;
	}
	
	public Car (String a, String b, String c, double p, double m) {
		m = 0;
		miles = m;
		make = a;
		model = b;
		color = c;
		price = p;	
	}

	public void setPrice(double p) {
		price = p;
	}
	
	public void paint(String c) {
		color = c;
	}

	public void displayCarInfo() {
		System.out.println("Car information:");
		System.out.println("----------------");
		System.out.println("Make and model: " + make + " "  + model);
		System.out.println("Color: " + color);
		System.out.println("Mileage: " + miles + " miles");
		System.out.println("Cost: $" + price);
	}

	public void travel(double distance) {
		System.out.println("The " + make + " " + model + " is traveling for " + distance + " miles.");
		miles += distance;
	}
}

