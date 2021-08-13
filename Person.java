package com.company;

public class Person {

    public String name;
    public String dob;
    public String gender;

    Person(String name,String dob,String gender){
        this.name=name;
        this.dob=dob;
        this.gender=gender;
    }
    public void personDetails(){

        System.out.println("Person Name :"+name);
        System.out.println("Person Date of Birth :"+dob);
        System.out.println("Person Gender is :"+gender);
    }

}
