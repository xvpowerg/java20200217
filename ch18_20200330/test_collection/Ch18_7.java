/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20200330.test_collection;

import java.util.ArrayList;
import java.util.List;

public class Ch18_7 {

    public static void main(String[] args) {
	List<Integer> arrayList = new ArrayList<>();
	arrayList.add(25);
	arrayList.add(71);
	arrayList.add(36);
	arrayList.add(15);
	
	arrayList.removeIf(v->v < 30);
	System.out.println(arrayList);
	arrayList.replaceAll(v->v+10);
	System.out.println(arrayList);
	
    }
    
}
