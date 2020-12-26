package amrib.designPattern.abstractFactory.gui;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
	private Button button;
	private Checkbox checkbox;
	private Label label;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
		label = factory.createLabel();
	}

	public void paint() {
		label.write();
		button.paint();
		checkbox.paint();
	}
}
