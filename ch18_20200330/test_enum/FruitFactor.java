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
    static Fruit createFruit(int type){
	switch(type){
	    case 1:
		return new Apple();
	    case 2:
		return new Banana();
	   case 3:
		return new Charry();	
	    default:
	  throw new IllegalArgumentException();	
	}
	
    }
}
