/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
import java.util.Set;
import java.util.HashSet;
public class Ch19_3 {
    public static void main(String[] args) {
	//Hash 通常都快
	//Set 結構　也是一種集合
	//Set 無順序　不重複
	Set<Integer> mySet = new HashSet<>();
	mySet.add(100);
	mySet.add(25);
	mySet.add(51);
	mySet.add(83);
	mySet.add(51);
	mySet.forEach(System.out::println);
    }
    
}
