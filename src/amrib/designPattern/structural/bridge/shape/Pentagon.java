package amrib.designPattern.structural.bridge.shape;

public class Pentagon extends Shape {

	public Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Pentagon filled with the color");
		color.applyColor();
	}

	
}
