package ui;

import model.Transcript;

public class Main {

    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Mohamed", 86152);
        //TODO: create another Transcript object

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        t2.addGrade("Math", 4);
        t2.addGrade("Physics", 4);

        t3.addGrade("Programming",4);

        //TODO: add grades to the other Transcript objects

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(t1.getGPA());

        System.out.print(t2.getStudentName() + ": ");
        t2.printTranscript();

        System.out.println(t2.getGPA());

        System.out.print(t3.getStudentName() + ": ");
        t3.printTranscript();

        System.out.println(t3.getGPA());

        //TODO: add more use cases here

    }

}
