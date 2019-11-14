package sk.itsovy.podhajecka.Next;
import java.lang.reflect.Array;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nikoleta", "Petrová", new Date(2000,7,20));
        Student student2 = new Student("Jakub", "Vašinský", new Date(1999,5,10));
        Student student3 = new Student("Damián", "Matysko", new Date(2000,10,1));
        Student student4 = new Student("Peter", "Gánoczi", new Date(1998,8,8));
        Student student5 = new Student("Patrik", "Strausz", new Date(2000,2,23));
        Student student6 = new Student("Tibor", "Šesták", new Date(1995,12,31));
        Student student7 = new Student("Monika", "Podhájecká", new Date(2000,5,8));
        Group group1 = new Group("1N", 10);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.printAll();

        group1.deleteStudent(student3);
        group1.printAll();
        group1.sort();

        group1.randomStudent();
        group1.getStudents(5);

        student1.addSubject("Mat");
        student1.addSubject("Sjl");
        student1.removeSubject("Mat");

        student2.addSubject("Mat");
        student3.addSubject("Mat");
        student4.addSubject("Mat");
        student5.addSubject("Mat");

        student1.printSubjects();
        group1.findSubject("Mat");

    }
}
