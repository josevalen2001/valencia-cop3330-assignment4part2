package ucf.assignments;


/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AllLists {

    //Create attributes for class
    //Only attribute we need for this class is an ArrayList of lists
    ArrayList<List> listsInProgram;

    public AllLists() {

        //Initialize the attributes of the class
        listsInProgram = new ArrayList<List>();

    }

    public void addList(List list) {

        //Take in a list as a parameter
        //Add it to listsInProgram
        listsInProgram.add(list);


    }

    public void removeList(String list) {

        //Look for the list
        for(int i = 0; i < listsInProgram.size(); i++)
            //List is found
            if(listsInProgram.get(i).toString().equals(list))
                //Remove the list
                listsInProgram.remove(i);

        //If there is no list equal to the one passed nothing will happen

    }

    public void editList(String list, String name) {

        //Look for the list
        for(int i = 0; i < listsInProgram.size(); i++)
            //List is found
            if(listsInProgram.get(i).toString().equals(list))
                //Use the setter method in the list class to change its name
                listsInProgram.get(i).setName(name);

    }

    public void importList(File file) {

        //Take in a file as a parameter
        //This file will have the info for the list and its tasks in a specific format
        //Use methods in the List class to create a class with this info
        //Use addList to add the newly imported list to listsInProgram

    }

    public String exportList(String list) {

        //Run through all the lists in the list of lists.
        for(int i = 0; i < listsInProgram.size(); i++) {
            //Find the list that has been passed by name.
            if (listsInProgram.get(i).toString().equals(list)) {
                try {
                    //Create a writer and file.
                    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"\\Desktop\\" + listsInProgram.get(i).toString() + ".txt"));
                    //Write the name of the list in the first line.
                    bw.write(listsInProgram.get(i).toString() + "\n");
                    //Write the tasks of that list in the other lines.
                    for(int j = 0; j < listsInProgram.get(i).tasks.size(); j++)
                        bw.write(listsInProgram.get(i).tasks.get(j).toString() + "\n");
                    bw.close();
                    return "Successful";
                } catch (IOException e){

                    return "Failure";
                }

            }
        }

        return "failure";
    }

}
