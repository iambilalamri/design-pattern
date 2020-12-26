package amrib.designPattern.abstractFactory;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

	@Override
	public Label createLabel() {
		// TODO Auto-generated method stub
		return new MacOSLabel();
	}
}
