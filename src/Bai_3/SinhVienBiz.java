/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_3;

/**
 *
 * @author lieut
 */
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSale;

    public SinhVienBiz(double diemMarketing, double diemSale, String hoTen, String nganh) {
        //super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public SinhVienBiz(double diemMarketing, double diemSale) {
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2*this.diemMarketing + this.diemSale)/3;
    }
    
}
