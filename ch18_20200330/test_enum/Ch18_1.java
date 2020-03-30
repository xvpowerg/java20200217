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
public class Ch18_1 {
    
    public static void main(String[] args) {
         Fruit f1 = FruitFactor.createFruit(FruitFactor.CHARRY);
	System.out.println(f1.getName()+":"+ f1.getPrice());
	
	FruitFactor.createFruitByEnum(FruitFactor.FruitType.CHARRY);

    }
    
}
