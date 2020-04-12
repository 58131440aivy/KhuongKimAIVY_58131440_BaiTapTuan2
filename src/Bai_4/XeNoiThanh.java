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
public class XeNoiThanh extends ChuyenXe {
    double soTuyen;
    double soKmDiDuoc;

    public XeNoiThanh(double soTuyen, double soKmDiDuoc, String maChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số tuyến: " + this.soTuyen);
        System.out.println("Số KM: " + this.soKmDiDuoc);
    }
    
    
    
}
