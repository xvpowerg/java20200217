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
public class Apple implements Fruit {
    //Test
    @Override
    public String getName() {
	return "Apple";
    }

    @Override
    public String getColor() {
	return "紅";
    }

    @Override
    public int getPrice() {
	 return 25;
    }
    
}
