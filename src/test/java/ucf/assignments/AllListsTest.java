package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllListsTest {


    @Test
    void addList() {

        //Create an AllLists class.
        AllLists test  = new AllLists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addList(testList);
        //Check if the list of lists has one list in it.
        assertEquals(1, test.listsInProgram.size());
    }


    @Test
    void removeList() {

        //Create an AllLists class.
        AllLists test  = new AllLists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addList(testList);
        //Remove the list we just added.
        test.removeList("Test List");
        //Check if there are no lists.
        assertEquals(0, test.listsInProgram.size());

    }


    @Test
    void editList() {

        //Create an AllLists class.
        AllLists test  = new AllLists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addList(testList);
        //Change the list's name to the desired new name.
        test.editList("Test List", "Test List 2");
        //Check if the list has the new name.
        assertEquals("Test List 2", test.listsInProgram.get(0).getName());


    }


    @Test
    void importList() {

        //Create an ArrayList of lists with the list we want to import in it
        //Create an AllList class
        //Import a list from a file to the list of list in the AllList class which is the same as created before
        //Check if both arrayList have the same content

    }


    @Test
    void exportList() {

        //Create an AllLists class.
        AllLists test  = new AllLists();
        //Create a list to add.
        List testList = new List("Test List");
        //Add a list like the one in the arrayList to the AllList.
        test.addList(testList);
        //Create tasks.
        Task testTask = new Task("Test Task", "2021-07-07", true);
        Task testTask2 = new Task("Test Task 2", "2021-07-08", false);
        //Add the task.
        test.listsInProgram.get(0).addTask(testTask);
        test.listsInProgram.get(0).addTask(testTask2);
        //Export it and save return statement to know if it was successful.
        String status = test.exportList("Test List");
        //Compare if both files are the same
        assertEquals("Successful", status);

    }
}