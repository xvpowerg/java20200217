/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20200330.test_enum;

/**
 *
 * @author xvpow
 */
public class Ch18_2{
    
    //所有的列舉 都是一個 Enum的類別
    //不可手動繼承Enum
    //Enum的內容都是物件
    //Enum的內容 20~30 或以上算多，就不要使用enum
    //可用常數取代列舉
    enum Animal{
	Dog,Cat,Pig
    }
    public static void main(String[] args) {
	// TODO code application logic here
	System.out.println(Animal.Dog.name());
		
    }
    
}
