/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_4;

import java.util.ArrayList;

/**
 *
 * @author lieut
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> dsChuyenXe = new ArrayList();

    public QuanLyChuyenXe() {
    }
    
    public void addChuyenXe(ChuyenXe chuyenXe){
        this.dsChuyenXe.add(chuyenXe);
    }

    public void xuatThongTinDanhSach(){
        int length = dsChuyenXe.size();
        for(int i = 0 ; i< length ; ++i){
            dsChuyenXe.get(i).xuat();
            System.out.println("\n ============================ ");
        }
    }
    public void tongDoanhThuTungLoaiXe(){
        int length = dsChuyenXe.size();
        double tongDoanhThuXeNoiThanh = 0;
        double tongDoanhThuXeNgoaiThanh = 0;
        for(int i= 0 ; i< length ; ++i){    
           //Nếu đối tượng trong mảng này là một thể hiện của kiểu dữ liệu đó thì true
          //instaceof trả về boolean
            if(dsChuyenXe.get(i) instanceof XeNgoaiThanh){
                tongDoanhThuXeNgoaiThanh+=dsChuyenXe.get(i).doanhThu;
            }else if(dsChuyenXe.get(i) instanceof XeNoiThanh){
                tongDoanhThuXeNoiThanh+=dsChuyenXe.get(i).doanhThu;
            }
        }
        System.out.println("Tổng doanh thu xe nội thành là: " + tongDoanhThuXeNoiThanh);
        System.out.println("Tổng doanh thu xe ngoại thành là: " + tongDoanhThuXeNgoaiThanh);
    }
    public void tongDoanhThu(){
        int length = dsChuyenXe.size();
        double tongDoanhThu = 0;
        for(int i= 0; i < length ;++i ){
            tongDoanhThu+=dsChuyenXe.get(i).doanhThu;
        }
        System.out.println("Tổng doanh thu là: "+ tongDoanhThu);
    }
    
}
