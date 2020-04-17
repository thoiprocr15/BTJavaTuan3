/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author 张氏红绒
 */
public class HangHoa {
    String tenHH;
    int donGia;
    String desc;

    public HangHoa() {
    }
    
    public HangHoa(String tenHH, int donGia, String desc)
    {
        this.donGia=donGia;
        this.tenHH=tenHH;
        this.desc=desc;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getdonGia() {
        return donGia;
    }

    public void setdonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public void disp(){
        System.out.println("Tên hàng hóa: " + tenHH);
        System.out.println("Giá hàng hóa:" + donGia);
        System.out.println("Hình thức hàng: " + desc);
    }
    
}
