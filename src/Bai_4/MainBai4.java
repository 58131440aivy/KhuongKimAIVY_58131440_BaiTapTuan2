/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4;

/**
 *
 * @author lieut
 */
public class MainBai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          XeNoiThanh noiThah1 = new XeNoiThanh(3, 3, "1", "Nguyễn A", "78G1-123", 500);
          XeNoiThanh noiThah2 = new XeNoiThanh(3, 3, "1", "Nguyễn B", "78G1-123", 500);
          XeNoiThanh noiThah3 = new XeNoiThanh(3, 3, "1", "Nguyễn C", "78G1-123", 500);
          XeNgoaiThanh ngoaiThanh1 = new XeNgoaiThanh(12,"A", "123", "123", "123", 2);
          XeNgoaiThanh ngoaiThanh2 = new XeNgoaiThanh(12,"B", "123", "123", "123", 2);
          XeNgoaiThanh ngoaiThanh3 = new XeNgoaiThanh(12,"C", "123", "123", "123", 2);
          QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
          qlcx.addChuyenXe(noiThah1);
          qlcx.addChuyenXe(noiThah2);
          qlcx.addChuyenXe(noiThah3);
          qlcx.addChuyenXe(ngoaiThanh1);
          qlcx.addChuyenXe(ngoaiThanh2);
          qlcx.addChuyenXe(ngoaiThanh3);
          qlcx.xuatThongTinDanhSach();
          qlcx.tongDoanhThuTungLoaiXe();
          qlcx.tongDoanhThu();
        
    }

}
