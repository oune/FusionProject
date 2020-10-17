package application;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {
	public void labelClickHandler(MouseEvent event) throws Exception {
		Label clickedLabel = (Label) event.getSource();
		String clickedLabelStr = clickedLabel.getText();
		System.out.println(clickedLabelStr);
	}
}
