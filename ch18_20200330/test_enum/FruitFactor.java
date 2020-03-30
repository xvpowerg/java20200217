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
public interface FruitFactor {
    int APPLE = 1212312;
    int BANANA = 344534;
    int CHARRY = 353466;
   //限定某傳入數值的範疇
    enum FruitType{
	APPLE,
	BANANA,
	CHARRY
    }
    
    
    static Fruit createFruitByEnum(FruitType type){
		switch(type){
		    case APPLE:
			return new Apple();
		    case BANANA:
			return new Banana();
		    case CHARRY:
			return new Charry();
		    default:
		 throw new IllegalArgumentException();		
		}
	}
    
    static Fruit createFruit(int type){
	switch(type){
	    case 1212312:
		return new Apple();
	    case 344534:
		return new Banana();
	   case 353466:
		return new Charry();	
	    default:
	  throw new IllegalArgumentException();	
	}
   }  
    
    
}
