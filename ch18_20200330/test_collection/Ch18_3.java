/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20200330.test_collection;
import java.util.List;
import java.util.ArrayList;
public class Ch18_3 {

    public static void main(String[] args) {
	//List  是一組介面
	//ArrayList
	List arrayList = new ArrayList();
	arrayList.add(20);
	arrayList.add(10);
	arrayList.add(31);
	arrayList.add(57);
	arrayList.add(83);
	//1 
	    for (int i =0; i < arrayList.size();i++){
		System.out.print(arrayList.get(i)+" ");
	    }
	    System.out.println();
	//2
	    for (Object v : arrayList ){
		System.out.print(v+" ");
	    }
	    System.out.println();
	//3 forEach method java 8能用的
	    arrayList.forEach(i->System.out.print(i+" "));
	     System.out.println();
	//4 stream
	arrayList.stream().forEach(i->System.out.print(i+" "));
	//LinkedList
	
    }
    
}
