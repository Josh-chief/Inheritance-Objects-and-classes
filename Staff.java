package com.company;

public class Staff extends Person {
    private int staffId;
    private String jobTitle;

    Staff(String name,String dob,String gender,int staffId,String jobTitle) {
        super(name, dob, gender);
        this.jobTitle = jobTitle;
        this.staffId = staffId;
    }
    public void staffDetails(){
        System.out.println("This the Staff Details :");
        personDetails();
        System.out.println("Staff Id :"+staffId);
        System.out.println("Staff Job Details :"+jobTitle);

    }
}
