package com.company;
import  java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
	Student studentOne=new Student("Josh","18_04_1887","male",1657,1_08_19 );
	studentOne.studentDetails();

	Staff staffOne = new Staff("Kamau","1_08_9","male",85278,"Marketing Director");
	staffOne.staffDetails();
    }
}
