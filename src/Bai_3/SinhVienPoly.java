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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;
//Khởi tạo constructor có tham số
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }
//  abstract method là method trống không có thực thi khi lớp con kế thừa sẽ tự định nghĩa phương thức đó.
//  method thường là method có thực thi.
    public abstract double getDiem();
    
    
    
    public String getHocLuc(){
        if( getDiem() < 5) return "Yếu";
        else if (getDiem() >= 5 && getDiem() < 6.5) return "Trung bình";
        else if (getDiem() >= 6.5 && getDiem() < 7.5) return "Khá";
        else if (getDiem() >= 7.5 && getDiem() < 9) return "Giỏi";
        else if (getDiem() >= 9) return "Xuất sắc";
        return "Điểm không hợp lệ";
    }
    
     public void xuat(){
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngành: " + this.nganh);
    }
}
