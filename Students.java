package com.siri.onetomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {
	
	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "stud_id")
	private int studId;
	
	@Column(name = "stud_name")
	private String studName;
	
	@ManyToOne
	@JoinColumn(name = "col_id")
	private College collegedetails;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public College getCollegedetails() {
		return collegedetails;
	}

	public void setCollegedetails(College collegedetails) {
		this.collegedetails = collegedetails;
	}
	
	

	
}
