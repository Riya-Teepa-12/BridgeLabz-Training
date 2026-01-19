package com.Day7.eduresults;

public class Student {
     private String name;
     private int score;
     private String district;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getScore() {
		 return score;
	 }
	 public void setScore(int score) {
		 this.score = score;
	 }
	 public Student(String name, int score,String district) {
		this.name = name;
		this.score = score;
		this.district=district;
	 }
	 public String getDistrict() {
		 return district;
	 }
	 public void setDistrict(String district) {
		 this.district = district;
	 }
     
}
