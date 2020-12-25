package amrib.designPattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();

		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		Shape pentagon = shapeFactory.getShape("PENTAGON");
		pentagon.draw();
	}

}
