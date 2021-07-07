package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    //Test for behavior #9
    @Test
    void addTask() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Check if there is one task in the list.
        assertEquals(1, test.tasks.size());

    }

    //Test for behavior #11-12
    @Test
    void editTask() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Edit the task.
        test.editTask("Test Task || 2021-07-07 || Incomplete", "Test Task 2", "2021-07-08");
        //Make sure that task is in the array with the new information.
        assertEquals("Test Task 2 || 2021-07-08 || Incomplete", test.tasks.get(0).toString());

    }

    //Test for behavior #10
    @Test
    void removeTask() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Remove the task we just added.
        test.removeTask("Test Task || 2021-07-07 || Incomplete");
        //Check if the array is empty.
        assertEquals(0, test.tasks.size());

    }

    //Test for behavior #13
    @Test
    void markTaskCompleted() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markTaskCompleted("Test Task || 2021-07-07 || Incomplete", true);
        //Check is its true
        assertEquals(true, test.tasks.get(0).getCompleted());

    }

    //Test for behavior #16
    @Test
    void showCompleteTasks() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markTaskCompleted("Test Task || 2021-07-07 || Incomplete", true);
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns
        ArrayList<Task> completed = test.showCompleteTasks();
        //Check if there is one task in that list.
        assertEquals(1, completed.size());


    }

    //Test for behavior #15
    @Test
    void showIncompleteTasks() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markTaskCompleted("Test Task || 2021-07-07 || Incomplete", true);
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns
        ArrayList<Task> incomplete = test.showIncompleteTasks();
        //Check if there is one task in that list.
        assertEquals(1, incomplete.size());

    }

    //Test for behavior #14
    @Test
    void showAllTasks() {

        //Create a List class.
        List test = new List("Test List");
        //Create a task to add.
        Task testTask = new Task("Test Task", "2021-07-07", false);
        //Add the task.
        test.addTask(testTask);
        //Set its completed attribute to true.
        test.markTaskCompleted("Test Task || 2021-07-07 || Incomplete", true);
        //Create another task.
        Task testTask2 = new Task("Test Task 2", "2021-07-07", false);
        //Add that task.
        test.addTask(testTask2);
        //Run showCompleteTasks and save the arrayList it returns.
        ArrayList<Task> allTasks = test.showAllTasks();
        //Check if there is two tasks in the list.
        assertEquals(2, allTasks.size());

    }

}