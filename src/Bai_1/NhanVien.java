
package Bai_1;

public class NhanVien {
    String ten;
    String diaChi;
    int tuoi;
    double tienLuong;
    int soGioLam;
//Hàm khởi tạo không có tham số truyền vào
    public NhanVien() {
    }
//Hàm khởi tạo có tham số truyền vào
        public NhanVien(String ten, String diaChi, int tuoi, double tienLuong, int soGioLam) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.tienLuong = tienLuong;
        this.soGioLam = soGioLam;
    }
    public String getThongTin(NhanVien nv){
        System.out.println("Tên của nhân viên : " + nv.ten);
        System.out.println("Tuổi của nhân viên : " + nv.tuoi);
        System.out.println("Địa chỉ của nhân viên : " + nv.diaChi);
        System.out.println("Tiền lương của nhân viên : " + nv.tienLuong);
        System.out.println("Số giờ làm của nhân viên : " + nv.soGioLam);
        return null;
    }
    public double tinhThuong(NhanVien nv){
        if(nv.soGioLam >= 200){
            return nv.tienLuong*0.2;
        }else if(nv.soGioLam < 200 && nv.soGioLam >=100){
            return nv.tienLuong*0.1;
        }return 0;
    }
}

