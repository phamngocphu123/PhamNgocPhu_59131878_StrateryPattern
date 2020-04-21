
package BaiTap3;

import java.util.Date;


public class SinhVien {
    protected String hoTen;
    protected Date ngaySinh;
    protected float diemTB;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public void hienThiTTSV(){
        System.out.println("Họ và tên :" +hoTen);
        System.out.println("Ngày Sinh : " +ngaySinh);
        System.out.println("Điểm Trung Bình : "+ diemTB);
    }
}
