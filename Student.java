package sk.itsovy.podhajecka.Next;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private ArrayList<String> subjects = new ArrayList<String>();


    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getBirthMonth() {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        return month;
    }
    public int getBirthYear() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }
    public void addSubject(String subject){
        subjects.add(subject);
    }
    public void removeSubject(String subject){
        subjects.remove(subject);
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    public void printSubjects() {
        for (String subject : subjects) {
            System.out.println(subject);

        }
    }
     public boolean hasSubject(String subject){
            return subjects.contains(subject);
        }

    }

