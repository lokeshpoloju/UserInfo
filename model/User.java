package project.logic.model;

import java.time.*;

public class User {
    private String fName;
    // TODO : RQ - 1
    // Adding code for RQ1
    private LocalDate date;
    private int age;
    private String lName;
    private Address address;
    private Double salary;



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {
        LocalDate currDate = LocalDate.now(); 
	    Period period = Period.between(currDate, this.date); 
        int age  = Math.abs(period.getYears()); 
        this.age=age;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Req-1
    public LocalDate getDateofBirth() {
        return date;
    }

    public void setDateofBirth(LocalDate date) {
        this.date = date;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", lName='" + lName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
