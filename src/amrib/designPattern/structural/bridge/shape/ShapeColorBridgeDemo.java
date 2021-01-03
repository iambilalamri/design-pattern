package amrib.designPattern.structural.bridge.shape;

public class ShapeColorBridgeDemo {

	public static void main(String[] args) {
		Shape redTriangle = new Triangle(new RedColor());
		redTriangle.applyColor();

		Shape greenPen = new Pentagon(new GreenColor());
		greenPen.applyColor();
	}

}
