package com.company;

public class Student extends Person{
   private int studentId;
   private int admissionDate;

   Student(String name,String dob,String gender,int studentId,int admissionDate){

       super(name,dob,gender);
       this.studentId=studentId;
       this.admissionDate=admissionDate;

   }
   public void studentDetails(){
       System.out.println("This is the Students Details :");
       personDetails();
       System.out.println("Student Id :"+studentId);
       System.out.println( "Student Admission Date :"+admissionDate);
   }

}
