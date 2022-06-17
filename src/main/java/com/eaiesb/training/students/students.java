package com.eaiesb.training.students;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



public class students {
	
	@Id
	public ObjectId _id;

	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	private String firstName;
	private String lastName;
	private String studentNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
