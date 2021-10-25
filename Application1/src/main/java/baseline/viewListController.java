package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class viewListController {

    @FXML
    private Button AddTaskButton;

    @FXML
    private TextField TaskItemName;

    @FXML
    private DatePicker datePicker;

    @FXML
    void AddTask(ActionEvent event) {
        //Adds new task to current List
    }

    public void initialize(){
        //loads tasks 
    }

}
