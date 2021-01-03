package amrib.designPattern.creational.abstractFactory.furniture;

/**
 * Abstract Factory
 * 
 * @author bilal
 *
 */
public interface FurnitureFactory {
	Chair createChair();

	CoffeTable createCoffeTable();

	Sofa createSofa();
}
