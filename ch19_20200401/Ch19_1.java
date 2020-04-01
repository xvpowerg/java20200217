/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
public class Ch19_1 {

    public static void main(String[] args) {
	/*List<String> list1 = new LinkedList<>();
	list1.add("Howard");
	list1.add("Ken");
	list1.add("Vivin");
	list1.add("Join");
	list1.forEach(System.out::println);*/
	
	Queue<String>queue = new LinkedList<>();
	queue.offer("Vivin");
	queue.offer("Join");
	queue.offer("Howard");
	
	queue.forEach(System.out::println);
	String name1 = queue.poll();
	System.out.println("======poll========");
	System.out.println(name1);
	System.out.println("======poll========");
	
	queue.forEach(System.out::println);
	String name2 = queue.peek();
	System.out.println("======peek========");
	System.out.println(name2);
	System.out.println("======peek========");
	queue.forEach(System.out::println);
	
	
    }
    
}
