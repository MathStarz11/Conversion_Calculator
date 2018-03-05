/*
 *  Copyright 2017 Christopher Todd
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author christophertodd
 */
public class FXMLDocumentController extends ConversionFunctions implements Initializable {
   
    
    @FXML
    RadioButton radioBinDecCalculate;
    @FXML
    RadioButton radioDecBinCalculate;
    @FXML
    RadioButton radioHexBinCalculate;
    @FXML
    RadioButton radioBinHexCalculate;
    @FXML
    RadioButton radioDecHexCalculate;
    @FXML
    RadioButton radioHexDecCalculate;
    @FXML
    Button button;
    @FXML
    TextField textField;
    @FXML
    Label convertLabel;
    
    @FXML
    private void handleButtonAction (ActionEvent event) {
        //getting textfield text
        String text = textField.getText().toUpperCase();
        
        if(radioBinDecCalculate.isSelected()) {
            convertLabel.setText(binDec(text));
        } else if (radioDecBinCalculate.isSelected()) {
            convertLabel.setText(decBin(text));
        } else if (radioHexBinCalculate.isSelected()) {
            convertLabel.setText(hexBin(text));
        } else if (radioBinHexCalculate.isSelected()) {
            convertLabel.setText(binHex(text));
        } else if (radioDecHexCalculate.isSelected()) {
            convertLabel.setText(decHex(text));
        } else if (radioHexDecCalculate.isSelected()) {
            convertLabel.setText(hexDec(text));
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
