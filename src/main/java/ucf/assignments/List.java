package ucf.assignments;

import java.util.ArrayList;

public class List {

    //Create the attributes for list
    //We need an attribute for the name of the list and its tasks
    //String name;
    //ArrayList<Task> tasks;

    public void createList(String name) {

        //Initialize the name attribute with the string taken is as a parameter with the setName func
        //Initialize the ArrayList parameter as an empty ArrayList of Task

    }

    public void setName(String name) {

        //Take in a string as a parameter
        //Change the name attribute to whatever the string we took in as a parameter is

    }

    public String getName() {

        //Return the attribute name
        return null;
    }

    public ArrayList<Task> getTasks() {

        //Return the attribute tasks
        return null;

    }

    public void addTask(Task task) {

        //Take in a task as a parameter
        //Add the task to the tasks ArrayList

    }

    public void editTask(Task task, String name, String date) {

        //Take in a task as a parameter
        //Save the task name
        //Look through tasks arrayList until we find the desired task
        //Modify the name and date of the task with the setter methods in the Task class

    }

    public void removeTask(Task task) {

        //Take in a task as a parameter
        //Save the task name
        //Look through tasks arrayList until we find the desired task
        //Remove that task

    }

    public void markTaskCompleted(Boolean completed) {

        //Take in a task as a parameter
        //Save the task name
        //Look through tasks arrayList until we find the desired task
        //Use the setter method in Task class to modify the attribute

    }

    public ArrayList<Task> showCompleteTasks() {

        //Create an ArrayList for the completed tasks
        //Go through the tasks ArrayList and see which ones are completed
        //Save the completed ones to the new ArrayList
        //Return this array

        return null;
    }
    public ArrayList<Task> showIncompleteTasks(){

        //Create an ArrayList for the incomplete tasks
        //Go through the tasks ArrayList and see which ones are not completed
        //Save the not completed ones to the new ArrayList
        //Return this array

        return null;

    }

    public ArrayList<Task> showAllTasks(){

        //Uses getTasks to return the arrayList with all the tasks

        return null;

    }

    public ArrayList<Task> sortByDate() {

        //Create a new arrayList
        //Copy all the tasks into it
        //Sort this arrayList by date
        //Return it

        return null;

    }

    @Override
    public String toString(){

        //Returns a string with the name of the List

        return null;
    }

}
