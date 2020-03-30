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
public class Ch18_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//List 常用方法
	List<Integer> arrayList = new ArrayList<>();
	arrayList.add(25);
	arrayList.add(71);
	arrayList.add(36);
	arrayList.add(15);
	arrayList.add(1, 96);//插入	
	System.out.println(arrayList);
	//合併
	List<Integer> arrayList2 = new ArrayList<>();
	arrayList2.add(42);
	arrayList2.add(71);
	arrayList2.add(16);
	arrayList2.add(78);
	arrayList.addAll(arrayList2);//將arrayList2合併到arrayList	
	System.out.println(arrayList);
	System.out.println(arrayList.contains(16));//詢問List是否有16這個數值
	System.out.println(arrayList.contains(785));//詢問List是否有785這個數值
	
	//由左往右找 找到就停止
	int index1 = arrayList.indexOf(71);
	//由右往左找 找到就停止
	int index2 = arrayList.lastIndexOf(71);
	System.out.println(index1+":"+index2);
	//找不到就-1
	int index3 = arrayList.indexOf(51);
	System.out.println(index3);
	arrayList.remove(index1);//移除某個指定List的 index 內容
	System.out.println(arrayList);	
	//arrayList.remove(36);//會拋出錯誤
	arrayList.remove(Integer.valueOf(36));//移除某個List的物件
	System.out.println(arrayList);
	
	
	
    }
    
}
