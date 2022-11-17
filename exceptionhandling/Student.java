package com.yash.assignment.exceptionhandling;

public class Student {
	 int rollno;
     String sname;
    String saddress;
    StudentResult srobj;
    



   public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSaddress() {
        return saddress;
    }
    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
    public StudentResult getSrobj() {
        return srobj;
    }
    public void setSrobj(StudentResult srobj) {
        this.srobj = srobj;
    }
    
    
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress +  "]";
    }
    
    public static void main(String[] args) {
        Student s= new Student();
        StudentResult sr= new StudentResult();
        sr.setC(70);
        sr.setEnglish(71);
        sr.setJava(90);
        sr.setMath(89);
        sr.calResult();
        System.out.println("your Result is =" +sr.result+"%");
        s.setRollno(101);
        s.setSaddress("Sambhaji Nagar ");
        s.setSname("Navnath Wagh");
        s.setSrobj(sr);
        System.out.println(s);
    }

}
