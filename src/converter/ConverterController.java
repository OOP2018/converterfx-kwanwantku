package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ConverterController {
	@FXML
	TextField textfield;
	@FXML
	TextField textfield2;
	
	public void handleConvert(ActionEvent event) throws Exception{
		//read values from textfield(s)
		String text = textfield.getText().trim();
		String text2 = textfield2.getText().trim();
		//This is for testing 
		System.out.println("handleConverting "+text);
		System.out.println("handleConverting2 "+text2);
		//perform the conversion and output result from miles to kilometer
		if(text.length() > 0) {
			//if user did not type something then show an error message
			if ( !(text.matches("//d+")) ) {
				textfield2.setText("Please input number!!");
				textfield2.setStyle("-fx-text-inner-color: red;");
			}
			Double result = Double.parseDouble(text)*2.609344;
			textfield2.setText(String.format("%.4g",result));
		}
		
		///perform the conversion and output result from kilometer to miles
		if(text2.length() >0) {
			//if user did not type something then show an error message
			 if (!(text2.matches("//d+")) ) {
					textfield.setText("Please input number!!");
					textfield.setStyle("-fx-text-inner-color: red;");
			}
			Double result2 = Double.parseDouble(text2)/2.609344;
			textfield.setText(String.format("%.4g",result2));
		}
		
	}
	
	public void handleClear(ActionEvent event) {
		textfield.clear();
		textfield2.clear();
	}
}
