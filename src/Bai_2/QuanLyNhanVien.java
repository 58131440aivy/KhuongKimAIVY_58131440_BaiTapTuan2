/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_2;

import Bai_1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
//  ArrayList mà đối tượng là kiểu NhanVien
    ArrayList<NhanVien> nhanVien = new ArrayList();
    @Override
    public void them(NhanVien nv) {
//  Thêm 1 đối tượng NhanVien vào ArrayList
        this.nhanVien.add(nv);
    }

    @Override
    public void inDS() {
        int length = nhanVien.size();
        for (int i = 0; i < length; ++i) {
            int stt = i+1;
            System.out.println("Nhân viên thứ : " + stt);
            nhanVien.get(i).getThongTin(nhanVien.get(i));
            System.out.println("\n ***=============================*** ");
        }
    }
}
