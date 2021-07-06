package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    //Test for behavior #9
    @Test
    void addTask() {

        //Create an arrayList of tasks with the one task we want added
        //Create a List class
        //Add a task to the arrayList of tasks in the List class
        //Check if both arrayList contain the same

    }

    //Test for behavior #11-12
    @Test
    void editTask() {

        //Save the new description and date we want for the task
        //Create a List class
        //Add a tasks with a description and date that is not the one we want
        //Change the name and date for the one we want
        //Compare the toStrings for each tasks

    }

    //Test for behavior #10
    @Test
    void removeTask() {

        //Create an empty arrayList of tasks
        //Create a List class
        //Add a task to the list of tasks in the List class
        //Remove the task we just added
        //Compare both arrayLists

    }

    //Test for behavior #13
    @Test
    void markTaskCompleted() {

        //Create a List class
        //Add a tasks to the list of tasks in the List class
        //Set its completed attribute to true
        //Check is its true

    }

    //Test for behavior #16
    @Test
    void showCompleteTasks() {

        //Create a List class
        //Add one two tasks to the list of tasks in the list class
        //Mark one of them as complete
        //Run showCompleteTasks and save the arrayList it returns
        //Check if the status of the task in that list is true

    }

    //Test for behavior #15
    @Test
    void showIncompleteTasks() {

        //Create a List class
        //Add one two tasks to the list of tasks in the list class
        //Mark one of them as complete
        //Run showIncompleteTasks and save the arrayList it returns
        //Check if the status of the task in that list is false

    }

    //Test for behavior #14
    @Test
    void showAllTasks() {

        //Create an arrayList with some tasks
        //Create a list class
        //Add the same tasks to it that were on the arrayList we created
        //Run showAllTasks and save the arrayList is returns
        //Compare the arrayLists

    }

    @Test
    void sortByDate(){

        //Create an arrayList with tasks sorted by date
        //Create a list class
        //Add the same tasks we added to the other arrayList but not sorted
        //Run sortByDate and save the arrayList it returns
        //Compare the arrayLists

    }
}