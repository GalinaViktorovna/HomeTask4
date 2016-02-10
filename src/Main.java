/**
 * Created by Галка on 07.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        Teacher serega = new Teacher("Serega", 22, "M", "Computer Science");
        persons[0] = serega;
        Person coach = new Person("Bob Coach", 25, "M");
        persons[1] = coach;
        Student lynne = new Student("Lynne Broke", 16, "F", "HS95129", 2.5);
        persons[2] = lynne;
        Teacher duke = new Teacher("Duke Java", 34, "M", "Chemistry");
        persons[3] = duke;
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        persons[4] = ima;


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }


    }


}