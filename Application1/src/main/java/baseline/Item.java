/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Quinn Gilbert
 */
package baseline;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;


public class Item {
    //store data for each row in table
    private final SimpleStringProperty description;
    private final SimpleStringProperty dueDate;
    private CheckBox completed;

    //Create new Item
    Item(String desc, String due){

    }
    //Load Item with properly checked list
    Item(String desc, String due,boolean checked){

    }

    //need to implement getters and setters for CellValueFactory to work
    public String getDescription(){

    }
    public void setDescription(String desc){

    }

    public String getDueDate(){

    }
    public void setDueDate(String due){

    }

    public CheckBox getCompleted(){

    }
    public void setCompleted(CheckBox checkbox){

    }

}
