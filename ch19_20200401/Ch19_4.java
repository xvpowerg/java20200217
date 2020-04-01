/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
import java.util.Set;
import java.util.HashSet;
public class Ch19_4 {

    public static void main(String[] args) {
	Set<Student> stSet = new HashSet<>();
	Student st1 = new Student("Ken",65,15);
	Student st2 = new Student("Vivin",92,16);
	Student st3 = new Student("Lindy",82,13);
	Student st4 = new Student("Lindy",82,13);
	stSet.add(st1);
	stSet.add(st2);
        stSet.add(st3);
	stSet.add(st4);
        stSet.forEach(System.out::println);
	
	
    }
    
}
