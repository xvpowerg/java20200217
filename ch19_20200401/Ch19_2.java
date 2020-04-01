/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
import java.util.ArrayList;
import java.util.List;
public class Ch19_2 {

    public static void main(String[] args) {
	Student st1 = new Student("Howard",81,25);
	Student st2 = new Student("Vivin",98,26);
	Student st3 = new Student("Lidny",25,28);
	Student st4 = new Student("Ken",74,21);
	Student delSt = new Student("Lidny",25,28);
	
	List<Student> myList = new ArrayList<>();
	myList.add(st1);
	myList.add(st2);
	myList.add(st3);
	myList.add(st4);
	//list 內的ｒｅｍｏｖｅ是使用equals作物件比較的
	myList.remove(delSt);
	myList.forEach(System.out::println);
    }
    
}
