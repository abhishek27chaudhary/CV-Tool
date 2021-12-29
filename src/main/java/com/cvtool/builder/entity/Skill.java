package com.cvtool.builder.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long skillID;
	private String skillType;
	private ArrayList<String> listOfSkills;
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public ArrayList<String> getListOfSkills() {
		return listOfSkills;
	}
	public void setListOfSkills(ArrayList<String> listOfSkills) {
		this.listOfSkills = listOfSkills;
	}
	
	
	

}
