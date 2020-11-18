package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public TextArea Textarea;
    @FXML
    public TextField Textfield;
    @FXML
    public Button sendBtm;

    public void onClickBt(ActionEvent actionEvent) {
        Textarea.appendText(Textfield.getText() + " \n");
        Textfield.clear();
        Textfield.requestFocus();
    }

    public void onKeyBt(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.ENTER){
            Textarea.appendText(Textfield.getText() + " \n");
            Textfield.clear();
            Textfield.requestFocus();
        }
    }
}
