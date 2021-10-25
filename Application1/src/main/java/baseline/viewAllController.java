package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class viewAllController {

    @FXML
    private Button NewListButton;

    @FXML
    private TextField NewListName;

    @FXML
    private ListView<?> list;

    @FXML
    void addList(ActionEvent event) {
        //checks NewListName text to verify list name
        //creates new list and adds to list
    }

    @FXML
    void goToList(MouseEvent event) {
        //switches view to selected ToDo list
    }

}
