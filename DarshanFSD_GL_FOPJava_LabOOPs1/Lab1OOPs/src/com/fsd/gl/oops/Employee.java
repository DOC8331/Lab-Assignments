package com.fsd.gl.oops;

public class Employee {
	private String fName;
    private String lName;

    public Employee(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }
}
