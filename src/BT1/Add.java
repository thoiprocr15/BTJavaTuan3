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
public class Add implements ICalculate{

    public Add() {
    }

    @Override
    public float calculate(float a, float b) {
        return a+b;
    }

}
