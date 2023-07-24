package org.example;

import java.util.ArrayList;

public class CustomArrayList {

    int size = 5;

    class Student
    {
        int stuId;
        String stuName;
        char stuAttendance;
        double stuFee;

        //constructor of the student class that contains types of data required
        Student(int stuId, String stuName, char stuAttendance, double stuFee)
        {
            //initializing the variables from main
            this.stuId = stuId;
            this.stuName = stuName;
            this.stuAttendance = stuAttendance;
            this.stuFee = stuFee;
        }
    }

    public static void main(String[] args) {
        //data to input
        int stuId[]={101,102,103,104,105};
        String stuName[]={"Rabin", "Vamos","Kabir", "Harry", "Vicky"};
        char stuAttendance[] = {'P', 'P', 'A','P','A'};
        double stuFee[] ={14000,22000,14000,25000,19000};
        //creating object of class CustomArraylist
        CustomArrayList customObj = new CustomArrayList();
        //invoking the addElements() method to add elements in the ArrayList
        customObj.addElements(stuId,stuName, stuAttendance,stuFee);
    }

    public void addElements(int[] stuId, String[] stuName, char[] stuAttendance, double[] stuFee) {
        ArrayList <Student> arrayList = new ArrayList<>();
        for (int i = 0; i< size; i++)
        {
            arrayList.add(new Student(stuId[i],stuName[i],stuAttendance[i],stuFee[i]));
        }
        //calls the method to print or display elements of the ArrayList
        displayElements(arrayList);
    }

    public void displayElements(ArrayList<Student> arrayList)
    {
        System.out.println("ID"+"   " + "   Name" + "   "+ "  Attendance" +"    "+ "     Fee");
        System.out.println("---------------------------------------------------------------------------------");
        //iteration over ArrayList for accessing the elements
        for (int i = 0; i< size; i++)
        {
            //invoking get() method of ArrayList to get elements
            Student student = arrayList.get(i);
            //print the elements to console
            System.out.println(    student.stuId+"  " + "   " + student.stuName +"  " + "  " +"  " + student.stuAttendance+"    " + "   "+ "     "
                    + student.stuFee+"     ");
        }
    }
}
