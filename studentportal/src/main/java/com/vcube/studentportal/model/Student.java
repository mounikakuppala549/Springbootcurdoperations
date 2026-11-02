package com.vcube.studentportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="student75")
@Setter
@Getter

public class Student {

    
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     
    Integer sid;
    String fname;
    String lname;
    Integer age;
    Double total_marks;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(Double total_marks) {
		this.total_marks = total_marks;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sid=").append(sid).append(", fname=").append(fname).append(", lname=").append(lname)
				.append(", age=").append(age).append(", total_marks=").append(total_marks).append("]");
		return builder.toString();
	}
    
	
    

    
}
