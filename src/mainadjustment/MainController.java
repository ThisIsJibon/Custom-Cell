/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainadjustment;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MainController implements Initializable {

    @FXML
    private ListView<postType> listview;
    private ObservableList<postType>studentObservableList;

    public MainController() {
        studentObservableList = FXCollections.observableArrayList();
        studentObservableList.addAll(
                new postType("kalke exam", "3-04-2010", "Mahin", "5:50 PM"),
                new postType("In the second line, the new keyword is used to instantiate (or create) an object of type Integer and the pointer variable num is assigned to that Integer object.\n" +
"\n" +
"The NullPointerException occurs when you declare a variable but did not create an object and assign to the variable before trying to use the contents of the variable (called dereferencing). So you are pointing to something that does not actually exist.", "19-03-2013","Mehedi", "5:10 AM")
        );
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            listview.setItems(studentObservableList);
            listview.setCellFactory(NodeTypeController -> new NodeTypeController());

    }    
    
}
