package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
/**
 * The controller for converter UI to control function.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.03.09
 */
public class ConverterController {
	@FXML
	TextField textfield;
	@FXML
	TextField textfield2;
	@FXML
	ComboBox<Length> combobox;
	@FXML
	ComboBox<Length> combobox2;	
	
	/**
	 * The initialize for the combo box.
	 */
	@FXML
	public void initialize() {
		if (combobox != null) {
			combobox.getItems().addAll(Length.values());
			combobox.getSelectionModel().select(0);
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1);
		}
	}
	
	/**
	 * The handle convert event for input the value to convert.
	 * It also convert length from left to right and right to left too.
	 * @param event is the event to convert the length value to another length.
	 * @throws Exception for the error.
	 */
	public void handleConvert(ActionEvent event) throws Exception{
		//read values from textfield(s)
		String text = textfield.getText().trim();
		//read values from textfield2(s)
		String text2 = textfield2.getText().trim();
		//read the length from combobox
		Length unit1 = combobox.getValue();
		//read the length from combobox2
		Length unit2 = combobox2.getValue();
		//perform the conversion and output result from unit 1 to unit 2
		if(text.length() > 0) {
			//if user did not type something then show an error message
			if ( !(text.matches("\\d+")) ) {
				textfield2.setText("Please input number!!");
				textfield2.setStyle("-fx-text-inner-color: red;");
			}
			Double result = Double.parseDouble(text)*(unit1.getValue()/unit2.getValue());
			textfield2.setText(String.format("%.4g",result));
		}
		
		///perform the conversion and output result from kilometer to miles
		if(text2.length() >0) {
			//if user did not type something then show an error message
			 if (!(text2.matches("\\d+")) ) {
					textfield.setText("Please input number!!");
					textfield.setStyle("-fx-text-inner-color: red;");
			}
			Double result2 = Double.parseDouble(text2)*(unit2.getValue())/unit1.getValue();
			textfield.setText(String.format("%.4g",result2));
		}
		
	}
	
	/**
	 * Clear the finish converter from any textfield.
	 * @param event that clear value in every textfield.
	 */
	public void handleClear(ActionEvent event) {
		textfield.clear();
		textfield2.clear();
	}
}
