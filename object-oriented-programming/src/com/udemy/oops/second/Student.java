package com.udemy.oops.second;

public class Student extends Person {
  private String college;
  private int year;

  public Student() {
  }

  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

}
