/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
//Java Bean
public class Student {
    private String name;
    private int score;
    private int age;  

    public Student(String name, int score, int age) {
	this.name = name;
	this.score = score;
	this.age = age;
    }

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

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    
    public String toString(){
	return this.getName()+":"+this.getScore()+":"+this.getAge();
    }
    public boolean equals(Object obj){
	  if (obj == null | obj instanceof Student == false){
	      return false;
	  }
	  Student tmpSt  = (Student)obj;
	  return this.getAge() == tmpSt.getAge() && 
		  this.getScore() == tmpSt.getScore() && 
		  this.getName().equals(tmpSt.getName());
    }
    //hashCode 不同一定不是相同物件
    public int hashCode(){
       return this.getName().hashCode() + this.getScore()+this.getAge();
    }
    
}
