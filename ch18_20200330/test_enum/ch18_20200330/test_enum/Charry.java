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
public class Charry implements Fruit{
          @Override
    public String getName() {
	return "櫻桃";
    }

    @Override
    public String getColor() {
	return "紫紅";
    }

    @Override
    public int getPrice() {
	 return 35;
    }
}
