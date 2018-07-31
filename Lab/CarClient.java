public class CarClient {
	public static void main(String[] args) {
		Car c = new Car("Porsche", "Cayman S", "black", 67700, 0);
		Car l = new Car("Nissan", "Leaf", "blue", 29990, 0);

		c.paint("purple");
		l.paint("green");

		c.travel(12000);
		l.travel(8000);

		c.setPrice(50000);
		l.setPrice(24500);

		c.displayCarInfo();
		l.displayCarInfo();
	}
}