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
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//泛型  generic 有一種限定 的含意
	List<Integer> arrayList = new ArrayList<>();
	arrayList.add(20);
	arrayList.add(10);
	arrayList.add(31);
	arrayList.add(57);
	arrayList.add(83);
	int count = 0;
	  for (int v : arrayList ){      
		count += v;
	    }
	  System.out.println(count);
    }
    
}
