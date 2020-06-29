/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainadjustment;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class NodeTypeController implements Initializable {

    @FXML
    private Text nameText;
    @FXML
    private Text dateText;
    @FXML
    private Text postText;
    @FXML
    private Text timeText;
    @FXML
    private Button saveButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        nameText.setText("Mahinur Alam");
        dateText.setText("1-1-2020");
        postText.setText("hi");
        timeText.setText("7:40 PM");
   }    

    @FXML
    private void saveButtonAction(ActionEvent event) {
    }
    
}
