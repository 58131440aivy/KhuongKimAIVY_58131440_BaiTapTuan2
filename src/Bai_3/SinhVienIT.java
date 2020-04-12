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
// SinhVien IT kế thừa từ SinhVienPoLy
// Mục đích duy nhất của abstract class là để các lớp khác thừa kế nó
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemHTML;
    double diemCSS;

    public SinhVienIT(double diemJava, double diemHTML, double diemCSS, String hoTen, String nganh) {
        //super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    

    @Override
    public double getDiem() {
       return (2*this.diemJava + this.diemHTML + this.diemCSS)/4;
    }
}
