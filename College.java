package com.siri.onetomany.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "col_id")
	private int collegeId;
	
	@Column(name = "col_name")
	private String collegeName;
	
	@OneToMany(targetEntity=Students.class, mappedBy= "collegedetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Students> studlist = new ArrayList<Students>();

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Students> getStudlist() {
		return studlist;
	}

	public void setStudlist(List<Students> studlist) {
		this.studlist = studlist;
	}	
	
	
}
