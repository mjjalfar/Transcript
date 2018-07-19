package model;

public class Transcript {


    //TODO: Design specification for this method
    //REQUIRES: The course is already part of the list of courses
    //           the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES: this.
    //EFFECTS: Add grades to a course
    public void addGrade(String course, double grade){ }

    //TODO: Design specification for this method
    // This method should return course name and grade in some consistent String format
    //REQUIRES: Course exist, and has a grade already.
    //MODIFIES: nothing.
    //EFFECTS: returns course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course){ return null; }

    //TODO: Design specification for this method
    //REQUIRES: nothing.
    //MODIFIES: nothing.
    //EFFECTS:  Print the transcript.
    //          prints course names with grades earned
    public void printTranscript(){ }

    //TODO: Design specification for this method
    //REQUIRES: nothing.
    //MODIFIES: nothing.
    //EFFECTS: calculate the GPA based on the grades
    public double getGPA(){ return 0.0; }


}
