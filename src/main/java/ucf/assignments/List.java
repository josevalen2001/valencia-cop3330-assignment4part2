package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

import java.util.ArrayList;

public class List {

    //Create the attributes for list
    //We need an attribute for the name of the list and its tasks
    String name;
    ArrayList<Task> tasks;

    public List(String name) {

        //Initialize the attributes for the class
        this.name = name;
        tasks = new ArrayList<Task>();

    }

    public void setName(String name) {

        //Change the name attribute to whatever the string we took in as a parameter is
        this.name = name;

    }

    public String getName() {

        //Return the attribute name
        return name;
    }

    public ArrayList<Task> getTasks() {

        //Return the attribute tasks
        return tasks;

    }

    public void addTask(Task task) {

        //Add the task to the tasks ArrayList
        tasks.add(task);

    }

    public void editTask(String task, String name, String date) {

        //Look for the task
        for(int i = 0; i < tasks.size(); i++)
            //Find the task
            if(tasks.get(i).toString().equals(task)) {
                //Modify attributes for the task
                tasks.get(i).setDesc(name);
                tasks.get(i).setDate(date);
            }


    }

    public void removeTask(String task) {

        //Look for task
        for(int i = 0; i < tasks.size(); i++)
            //Find the task
            if(tasks.get(i).toString().equals(task))
                //Remove the task
                tasks.remove(i);

    }

    public void markTaskCompleted(String task, Boolean completed) {

        //Look for task
        for(int i = 0; i < tasks.size(); i++)
            //Find the task
            if(tasks.get(i).toString().equals(task))
                //Modify the task
                tasks.get(i).setCompleted(true);

    }

    public ArrayList<Task> showCompleteTasks() {

        //Create an ArrayList for the completed tasks
        ArrayList<Task> completedTasks = new ArrayList<Task>();

        //Go through the tasks ArrayList and look for completed tasks
        for(int i = 0; i < tasks.size(); i++)
            //Find completed tasks
            if(tasks.get(i).getCompleted() == true)
                //Save the completed ones to the new ArrayList
                completedTasks.add(tasks.get(i));

        //Return this array
        return completedTasks;
    }
    public ArrayList<Task> showIncompleteTasks(){

        //Create an ArrayList for the incomplete tasks
        ArrayList<Task> incompleteTasks = new ArrayList<Task>();

        //Go through the tasks ArrayList and look for incomplete tasks
        for(int i = 0; i < tasks.size(); i++)
            //Find incomplete tasks
            if(tasks.get(i).getCompleted() == false)
                //Save the incomplete ones to the new ArrayList
                incompleteTasks.add(tasks.get(i));

        //Return this array
        return incompleteTasks;

    }

    public ArrayList<Task> showAllTasks(){

        //Uses getTasks to return the arrayList with all the tasks
        return getTasks();

    }


    @Override
    public String toString(){

        //Returns a string with the name of the List
        return getName();
    }

}
