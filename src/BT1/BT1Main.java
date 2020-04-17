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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ct = new context();
        
        ct.setTinhToan(new Add());
        System.out.println("75 + 12 =" + ct.calculate(75,12));
        
        ct.setTinhToan(new Subtract());
        System.out.println("54 - 78" + ct.calculate(54, 78));
    }
    
}
