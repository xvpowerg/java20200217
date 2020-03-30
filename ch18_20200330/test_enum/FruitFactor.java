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
