/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewListController implements Initializable {


    @FXML
    private TableView<Item> table;
    @FXML
    private TextField addDescription;
    @FXML
    private DatePicker addDate;


    private ObservableList<Item> data;

    @FXML
    //Uses description text and date (if chosen) to create new Item and add it to the list
    void addItem(ActionEvent event) {

    }

    @FXML
    //Clears both viewed list and backend list
    void clearAll(ActionEvent event){

    }

    @FXML
    //Creates new file with all data as a .todo file
    void save(ActionEvent e){

    }

    @FXML
    //loads data into backend list from a .todo file
    void load(ActionEvent e){

    }

    @FXML
    //changes table to only display checked items (unchecked items remain in backend)
    void showComplete(ActionEvent e){

    }

    @FXML
    //changes table to only display unchecked items (checked items remain in backend)
    void showIncomplete(ActionEvent e){

    }

    @FXML
    //removes the item that is highlighted by tableview
    void remove(ActionEvent e){

    }

    @FXML
    void showAll(ActionEvent e){

    }

    @Override
    //initializes tableview with correct columns
    public void initialize(URL url, ResourceBundle rb){

    }

}

