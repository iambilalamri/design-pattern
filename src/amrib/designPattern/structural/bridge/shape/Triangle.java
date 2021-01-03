package amrib.designPattern.structural.bridge.shape;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Triangle filled with the color");
		color.applyColor();
	}

}
