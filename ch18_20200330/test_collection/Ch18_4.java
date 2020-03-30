/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20200330.test_collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	List arrayList = new ArrayList();
	arrayList.add(20);
	arrayList.add(10);
	arrayList.add(31);
	arrayList.add(57);
	arrayList.add(83);
	arrayList.add("Howard");
		    int count = 0;
	  for (Object v : arrayList ){
	       //java.lang.ClassCastException  會拋出轉型錯誤
	      Integer intV = (Integer)v;
		count += intV;
	    }
	  System.out.println(count);
    }
    
}
