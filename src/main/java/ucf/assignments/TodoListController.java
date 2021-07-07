package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class TodoListController implements Initializable {

    //Create an AllList object which will contain our lists and has functions to modify the lists.
    AllLists lists = new AllLists();

    //Create two ObservableLists for our ViewLists to display (one for the lists and another for the tasks).
    ObservableList listOfLists = FXCollections.observableArrayList();
    ObservableList listOfTasks = FXCollections.observableArrayList();


    //Declare FXML objects to be used in the controller.
    //ListViews:
    @FXML
    private ListView<String> mainListView;
    @FXML
    private ListView<String> taskListView;

    //TextFields:
    @FXML
    private TextField newListName;
    @FXML
    private TextField editListName;
    @FXML
    private TextField newTaskName;
    @FXML
    private TextField editTaskName;

    //DatePickers:
    @FXML
    private DatePicker addDatePicker;
    @FXML
    private DatePicker editTaskDatePicker;

    //Buttons:
    @FXML
    private Button addListBtn;
    @FXML
    private Button addTaskBtn;
    @FXML
    private Button editListBtn;
    @FXML
    private Button editTaskBtn;
    @FXML
    private Button removeListBtn;
    @FXML
    private Button removeTaskBtn;
    @FXML
    private Button markAsCompletedBtn;
    @FXML
    private Button viewAllTasksBtn;
    @FXML
    private Button viewCompletedBtn;
    @FXML
    private Button viewNotCompletedBtn;
    @FXML
    private Button sortByDateBtn;
    @FXML
    private Button exportSelectedBtn;
    @FXML
    private Button importListBtn;


    //Create the initialize class.
    //Add anything that needs to be ran first when the programs starts here.
    @Override
    public void initialize(URL url, ResourceBundle rb){}

    //Create our on action functions for each button.

    //Create a function to update the task ListView everytime a new list is selected or something in the tasks is modified.
    @FXML
    private void updateTaskListView() {
        //Remove all of the items from our ObservableList for tasks and ListView for tasks.
        //This ensures that our updated ListView for tasks does not show any old information.
        listOfTasks.removeAll();
        taskListView.getItems().clear();

        //Save the name for the list selected in the list ListView.
        String listName = mainListView.getSelectionModel().getSelectedItem();

        //Run through the list of lists in the program in our AllList class.
        for(int i = 0; i < lists.listsInProgram.size(); i++)
            //Find the list that is selected by comparing the name of each list to the one we have saved.
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                //Once this list is found run through the tasks in the list of tasks of this list object.
                for (int j = 0; j < lists.listsInProgram.get(i).tasks.size(); j++)
                    //Add all of the information of each tasks to our ObservableList of tasks.
                    listOfTasks.add(lists.listsInProgram.get(i).tasks.get(j).toString());
                //Set the items of our ListView of tasks to the items of the ObservableList for tasks.
                taskListView.setItems(listOfTasks);
            }

        //Enable some buttons that will be disabled in case the list is not updated.
        markAsCompletedBtn.setDisable(false);
        editTaskBtn.setDisable(false);
        removeTaskBtn.setDisable(false);
    }

    //Create a function to add lists to our TO-DO List manager program.
    @FXML
    private void addListBtnClicked(Event e) {
        //Exit the function if the user did not enter a name for the list.
        //This means that the button will be clicked, but nothing will happen.
        if(newListName.getText().isEmpty())
            return;

        //Save the name of the list to be added by reading it from the TextField.
        String name = newListName.getText();

        //Add our list to our ObservableList of lists and update the ViewList so it shows this item.
        listOfLists.add(name);
        mainListView.setItems(listOfLists);

        //Create a list object and add it to our list of list in the AllList object so we can modify it and add tasks later on.
        List temp = new List(name);
        lists.addList(temp);

        //Make the TextField blank again so that it is easy for the user to enter a new list.
        newListName.setText("");

    }

    //Create a function to add tasks to the lists in our programs.
    @FXML
    private void addTaskBtnClicked(Event e) {

        //Exit the function if the user did not enter a name for the task.
        //This means that the button will be clicked, but nothing will happen.
        if(newTaskName.getText().isEmpty())
            return;

        //If the user did not enter a date for the task, make the DatePicker default to today's date. This date can be changed later.
        addDatePicker.setValue(Optional.ofNullable(addDatePicker.getValue()).orElse(LocalDate.now()));

        //Save the name of the list selected.
        String listName = mainListView.getSelectionModel().getSelectedItem();

        //Run through the list of lists in the program in our AllList class.
        for(int i = 0; i < lists.listsInProgram.size(); i++)
            //Find the list that is selected by comparing the name of each list to the one we have saved.
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                //Once the list is found create a task with the information from the TextField and the DatePicker.
                Task temp = new Task(newTaskName.getText(), addDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), false);
                //Add the task to the list of tasks in the list object selected.
                lists.listsInProgram.get(i).addTask(temp);
            }

        //Update the task ViewList with the updateTaskListView function so that it displayed the updated information.
        updateTaskListView();

        //Set the TextField and DatePicker the user just used back to blank to make it easier for the user to enter a new task.
        newTaskName.setText("");
        addDatePicker.setValue(null);

    }

    //Create a function to edit the name of the list selected by the user.
    @FXML
    private void editListBtnClicked(Event e) {

        //Exit the function if the user did not enter a new name for the task.
        //This means that the button will be clicked, but nothing will happen.
        if(editListName.getText().isEmpty())
            return;

        //Save the name of the selected list.
        String listName = mainListView.getSelectionModel().getSelectedItem();

        //Run through the list of lists in the program in our AllList class.
        for(int i = 0; i < lists.listsInProgram.size(); i++)
            //Find the list that is selected by comparing the name of each list to the one we have saved.
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                //Once the list is found we can modify its name with the setName function in the List class.
                lists.listsInProgram.get(i).setName(editListName.getText());
                //Exit the for loop.
                break;
            }

        //Clear the ObservableList of lists.
        listOfLists.clear();
        //Update the ObservableList of lists with each item in the list of lists in the AllLists object.
        for(int i = 0; i < lists.listsInProgram.size(); i++)
            listOfLists.add(lists.listsInProgram.get(i).toString());

        //Set the TextField the user just used back to blank so that it is easier for the user to edit another list.
        editListName.setText("");

    }

    //
    @FXML
    private void editTaskBtnClicked(Event e) {

        if(editTaskName.getText().isEmpty())
            return;

        editTaskDatePicker.setValue(Optional.ofNullable(editTaskDatePicker.getValue()).orElse(LocalDate.now()));

        String taskName = taskListView.getSelectionModel().getSelectedItem();
        String date = editTaskDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List temp = new List("a");

        for(int i = 0; i < lists.listsInProgram.size(); i++) {
            for(int j = 0; j < lists.listsInProgram.get(i).tasks.size(); j++) {
                if(lists.listsInProgram.get(i).tasks.get(j).toString().equals(taskName)) {
                    lists.listsInProgram.get(i).tasks.get(j).setDesc(editTaskName.getText());
                    lists.listsInProgram.get(i).tasks.get(j).setDate(date);
                    temp = lists.listsInProgram.get(i);
                    break;
                }
            }
        }

        listOfTasks.clear();
        for(int i = 0; i < temp.tasks.size(); i++)
            listOfTasks.add(temp.tasks.get(i));

        editTaskName.setText("");
        editTaskDatePicker.setValue(null);

        updateTaskListView();


    }

    @FXML
    private void removeListBtnClicked(Event e) {


        String listName = mainListView.getSelectionModel().getSelectedItem();

        for(int i = 0; i < lists.listsInProgram.size(); i++)
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                lists.listsInProgram.remove(lists.listsInProgram.get(i));
            }

        listOfLists.remove(listName);
        taskListView.getItems().clear();


    }

    @FXML
    private void removeTaskBtnClicked(Event e) {
        String taskName = taskListView.getSelectionModel().getSelectedItem();


        for(int i = 0; i < lists.listsInProgram.size(); i++) {
            for(int j = 0; j < lists.listsInProgram.get(i).tasks.size(); j++) {

                if(lists.listsInProgram.get(i).tasks.get(j).toString().equals(taskName)) {
                    lists.listsInProgram.get(i).tasks.remove(lists.listsInProgram.get(i).tasks.get(j));

                    break;
                }


            }
        }

        listOfTasks.remove(taskName);
    }

    @FXML
    private void markAsCompletedBtnClicked(Event e) {

        String taskName = taskListView.getSelectionModel().getSelectedItem();
        List temp = new List("a");

        for(int i = 0; i < lists.listsInProgram.size(); i++) {
            for(int j = 0; j < lists.listsInProgram.get(i).tasks.size(); j++) {
                if(lists.listsInProgram.get(i).tasks.get(j).toString().equals(taskName)) {
                    if(lists.listsInProgram.get(i).tasks.get(j).getCompleted() == false)
                        lists.listsInProgram.get(i).tasks.get(j).setCompleted(true);
                    else
                        lists.listsInProgram.get(i).tasks.get(j).setCompleted(false);

                    temp = lists.listsInProgram.get(i);
                    break;
                }
            }
        }

        listOfTasks.clear();
        for(int i = 0; i < temp.tasks.size(); i++)
            listOfTasks.add(temp.tasks.get(i));

        updateTaskListView();

    }

    @FXML
    private void viewAllTasksBtnClicked(Event e) {
        updateTaskListView();
    }

    @FXML
    private void viewCompletedBtnClicked(Event e) {

        markAsCompletedBtn.setDisable(true);
        editTaskBtn.setDisable(true);
        removeTaskBtn.setDisable(true);

        String listName = mainListView.getSelectionModel().getSelectedItem();
        List temp = new List("a");

        for(int i = 0; i < lists.listsInProgram.size(); i++)
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                ArrayList<Task> completed = lists.listsInProgram.get(i).showCompleteTasks();
                listOfTasks.clear();
                for(int j = 0; j < completed.size(); j++)
                    listOfTasks.add(completed.get(j));
            }

    }

    @FXML
    private void viewNotCompletedBtnClicked(Event e) {

        markAsCompletedBtn.setDisable(true);
        String listName = mainListView.getSelectionModel().getSelectedItem();
        List temp = new List("a");

        for(int i = 0; i < lists.listsInProgram.size(); i++)
            if(lists.listsInProgram.get(i).getName().equals(listName)) {
                ArrayList<Task> incomplete = lists.listsInProgram.get(i).showIncompleteTasks();
                listOfTasks.clear();
                for(int j = 0; j < incomplete.size(); j++)
                    listOfTasks.add(incomplete.get(j));
            }

    }




    public void exportSelectedBtnClicked(ActionEvent actionEvent) {
        //Call exportList in the AllList class
        //This will export the information of the selected lists to a file
        //The list view remains the same
    }

    public void importListBtnClicked(ActionEvent actionEvent) {
        //Call importList in the AllList class
        //This will import a list from a file into the list of lists in the AllList class
        //This new list will now show in the list view
    }

    public void sortByDateBtnClicked(ActionEvent actionEvent) {
        //Call sortByDate in the List class
        //Display the arrayList this function returns in the list view for tasks
    }
}


