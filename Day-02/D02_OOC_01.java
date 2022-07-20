package com.codewithsufyan;

public class D02_OOC_01 {
    public static void main(String[] args) {
        //Student student = new Student();
        //student.setGrade(51);
        //student.display();
        //System.out.println(student.isPassed());

        //UGStudent student1 = new UGStudent("abc",45678,23,71,"ind","degree","stream");
        //student1.display();
        //System.out.println(student1.isPassed());

        PGStudent student2 = new PGStudent("abc",123456,34,72,"ind","AI",1);
        student2.display();
        System.out.println(student2.isPassed());
    }
}

class Student{
    protected String name;
    protected int id;
    protected int age;
    protected int grade;
    protected String address;

    public Student() {
    }

    public Student(String name, int id, int age, int grade, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(address);
    }

    public boolean isPassed() {
        if (grade>50) {
            return true;
        } else {
            return false;
        }
    }
}

class UGStudent extends Student {
    private String degree;
    private String stream;

    public UGStudent() {
    }

    public UGStudent(String name, int id, int age, int grade, String address, String degree, String stream) {
        super(name, id, age, grade, address);
        this.degree = degree;
        this.stream = stream;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void display() {
        super.display();
        System.out.println(degree);
        System.out.println(stream);
    }

    public boolean isPassed() {
        if (grade>70) {
            return true;
        } else {
            return false;
        }
    }
}

class PGStudent extends Student {
    private String specialization;
    private int noOfPapersPublished;

    public PGStudent() {
    }

    public PGStudent(String name, int id, int age, int grade, String address, String specialization, int noOfPapersPublished) {
        super(name, id, age, grade, address);
        this.specialization = specialization;
        this.noOfPapersPublished = noOfPapersPublished;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getNoOfPapersPublished() {
        return noOfPapersPublished;
    }

    public void setNoOfPapersPublished(int noOfPapersPublished) {
        this.noOfPapersPublished = noOfPapersPublished;
    }

    public void display() {
        super.display();
        System.out.println(specialization);
        System.out.println(noOfPapersPublished);
    }

    public boolean isPassed() {
        if (grade>70 && noOfPapersPublished>=2) {
            return true;
        } else {
            return false;
        }
    }
}
