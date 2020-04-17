/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author 张氏红绒
 */
public class Divide implements ICalculate{

    public Divide() {
    }

    @Override
    public float calculate(float a, float b) {
        if (b==0) return -1;
        else return a/b;
    }
    
    
}
