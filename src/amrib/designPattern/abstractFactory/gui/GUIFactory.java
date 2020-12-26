package amrib.designPattern.abstractFactory.gui;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    Label createLabel();
}
