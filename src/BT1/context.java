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
public class context {
    ICalculate tinhToan;
    
    public void setTinhToan(ICalculate tinhToan)
    {
        this.tinhToan= tinhToan;
    }
    
    public float calculate(float a, float b)
    {
        return this.tinhToan.calculate(a,b);
    }
    
}
