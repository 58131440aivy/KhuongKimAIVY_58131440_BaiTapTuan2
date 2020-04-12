package Bai_2;

import Bai_1.NhanVien;

public class MainBai2 {

    public static void main(String[] args) {
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nguyễn Diệp Huyền Trân", "Khánh Hoà", 22, 21000, 212);
        NhanVien nv2 = new NhanVien("Khương Kim Ái Vy","Khánh Hoà", 22, 23000, 212);
        NhanVien nv3 = new NhanVien("Khương Kim Ái Thuỳ", "Khánh Hoà", 22, 23000, 212);
        NhanVien nv4 = new NhanVien("Nguyễn Thành Anh", "Bình Định", 22, 23000, 212);
        NhanVien nv5 = new NhanVien("Nguyễn Tấn Ba", "Bình Thuận", 22, 23000, 212);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }

}
