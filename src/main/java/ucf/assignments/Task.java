package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Valencia
 */

public class Task {

    //Create the attributes for a task
    //We need attributes for its description, date and status
    String desc;
    String date;
    Boolean completed;

    public Task(String desc, String date, Boolean completed) {

        //Sets the attributes of the object
        this.desc = desc;
        this.date = date;
        this.completed = completed;

    }

    public void setDesc(String desc) {

        //Sets the desc attribute to whatever its passed
        this.desc = desc;

    }

    public void setDate(String date) {

        //Sets the date attribute to whatever its passed
        this.date = date;

    }

    public void setCompleted(Boolean completed) {

        //Sets the completed attribute to whatever its passed
        this.completed = completed;

    }

    public String getDesc() {

        //Returns the desc attribute
        return desc;

    }

    public String getDate() {

        //Returns the date attribute
        return date;

    }

    public Boolean getCompleted() {

        //Return the completed attribute
        return completed;

    }

    @Override
    public String toString() {

        //Create a string to print which changes depending on if the task is or is not finished.
        String completed;
        if(getCompleted() == true)
            completed = "Complete";
        else
            completed = "Incomplete";

        //Returns a string with the name, date and status of the task
        return getDesc() + " || " + getDate() + " || " + completed;

    }

}
