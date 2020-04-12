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
public class MainBai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly svPoLy;
        svPoLy = new SinhVienPoly("PoLy", "PoLy") {
            @Override
            public double getDiem() {
                return 10;
            }
        };

        svPoLy.xuat();
        System.out.println("Điểm: " + svPoLy.getDiem() + "\nHọc lực: " + svPoLy.getHocLuc() + "\n");

        SinhVienPoly svIT = new SinhVienIT(8, 8, 8, "Khương Kim Ái Vy", "CNTT");
        svIT.xuat();
        System.out.println("Điểm: " + svIT.getDiem() + "\nHọc lực: " + svIT.getHocLuc() + "\n");

        SinhVienPoly svBiz = new SinhVienBiz(9, 9, "Bizzz", "Bizzz");
        svBiz.xuat();
        System.out.println("Điểm: " + svBiz.getDiem() + "\nHọc lực: " + svBiz.getHocLuc() + "\n");

    }

}
