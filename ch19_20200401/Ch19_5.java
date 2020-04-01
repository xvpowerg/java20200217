/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20200401;
import java.util.Set;
import java.util.TreeSet;
public class Ch19_5 {
       //20 30 18 15 19 35 28 
    public static void main(String[] args) {
	//TreeSet
	TreeSet<Integer> treeSet = new TreeSet();
	treeSet.add(20);
	treeSet.add(30);
	treeSet.add(18);
	treeSet.add(15);
	treeSet.add(19);
	treeSet.add(35);
	treeSet.add(28);
	//treeSet.forEach(System.out::println);
	
	System.out.println(treeSet.first());//取得第一筆
	System.out.println(treeSet.last());////取得最後一筆
	
	System.out.println(treeSet.floor(16));//取得ｔｒｅｅ內　小於等於16的
	System.out.println(treeSet.lower(16));//取的tree 內的 小於16的
	System.out.println(treeSet.floor(15));//取得ｔｒｅｅ內　小於等於15的
	System.out.println(treeSet.lower(15));//取的tree 內的 小於15的
	
	
 //作業 使用 LinkedList 中的 poll方法 輪巡所有數值
    
    }
    
}
