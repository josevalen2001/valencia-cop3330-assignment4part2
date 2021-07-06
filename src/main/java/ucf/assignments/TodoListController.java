package ucf.assignments;

import javafx.event.ActionEvent;

public class TodoListController {

    //First we have to create a AllList object and set the listViews to be visible and display
    //The list view for the lists will always display the ArrayList of lists in our AllList object
    //The list view for the tasks will change depending on what list is selected

    public void addListBtnClicked(ActionEvent actionEvent) {
        //Call addList function in the AllList class
        //This will add the list
        //List will show on list view
        //The information for the name of the list will be taken from the text field
    }

    public void editListBtnClicked(ActionEvent actionEvent) {
        //Call editList function in AllList class
        //The list edited will be the one selected in the list view
        //This will change the name of the list
        //New name will show on list view
        //The information for the new name of the list will be taken from text field
    }

    public void removeListBtnClicked(ActionEvent actionEvent) {
        //Call removeList in AllList class
        //This will remove the list selected in the list view
        //It does this by removing it from the list of lists in the AllList class
        //This list will no longer show on list view
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

    public void addTaskBtnClicked(ActionEvent actionEvent) {
        //Call addTask in the List class
        //This will add a task in the list of tasks in the List class
        //The new task will show in the list view
        //The information for the class will be taken from text field and date picker
    }

    public void editTaskBtnClicked(ActionEvent actionEvent) {
        //Call editTask in the List class
        //The task edited will be the one selected in the list view
        //This will edit the name and date of the task
        //Information to edit will be taken from text field and date picker
        //New name and date will show for this task in the listView
    }

    public void viewAllTasksBtnClicked(ActionEvent actionEvent) {
        //Call showAllTasks in the List class
        //Display the arrayList this function returns in the list view for tasks
    }

    public void viewCompletedBtnClicked(ActionEvent actionEvent) {
        //Call showCompleteTasks in the List class
        //Display the arrayList this function returns in the list view for tasks
    }

    public void viewNotCompletedBtnClicked(ActionEvent actionEvent) {
        //Call showIncompleteTasks in the List class
        //Display the arrayList this function returns in the list view for tasks
    }

    public void markAsCompletedBtnClicked(ActionEvent actionEvent) {
        //Call markTaskCompleted in the List class
        //Pass it the value true for completed
        //This will modify the completed attribute of a class
        //List view information will change for this task
        //The task edited will be the one selected in the list view
    }


    public void removeTaskBtnClicked(ActionEvent actionEvent) {
        //Call removeTask in List class
        //This will remove this task from the list of tasks in the List class
        //This task will no longer show in the list view
        //The task deleted will be the one selected in the list view
    }

    public void sortByDateBtnClicked(ActionEvent actionEvent) {
        //Call sortByDate in the List class
        //Display the arrayList this function returns in the list view for tasks
    }
}
