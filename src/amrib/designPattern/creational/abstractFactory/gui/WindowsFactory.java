package amrib.designPattern.creational.abstractFactory.gui;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

	@Override
	public Label createLabel() {
		// TODO Auto-generated method stub
		return new WindowsLabel();
	}
}
