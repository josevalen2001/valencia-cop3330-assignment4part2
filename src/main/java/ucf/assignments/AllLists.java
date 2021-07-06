package ucf.assignments;

import java.io.File;
import java.util.ArrayList;

public class AllLists {

    //Create attributes for class
    //Only attribute we need for this class is an ArrayList of lists

    //ArrayList<List> listsInProgram;

    public void createAllLists() {

        //Initialize the listsInPrograms here
        //Should initialize it as an empty ArrayList of lists

    }

    public void addList(List list) {

        //Take in a list as a parameter
        //Add it to listsInProgram


    }

    public void removeList(List list) {

        //Take in a list as a parameter
        //Save the name of the list
        //Look for the list in listsInPrograms
        //Remove that list

    }

    public void editList(List list, String name) {

        //Take in a list as a parameter
        //Save the name of the list
        //Look for the list in listsInPrograms
        //Use the setter method for the name of the list in the List class to change the name

    }

    public void importList(File file) {

        //Take in a file as a parameter
        //This file will have the info for the list and its tasks in a specific format
        //Use methods in the List class to create a class with this info
        //Use addList to add the newly imported list to listsInProgram

    }

    public void exportList(File file, List list) {

        //Take in a file and a list as a parameter
        //Write the information from the list taken in into the file in a specific format

    }

}
