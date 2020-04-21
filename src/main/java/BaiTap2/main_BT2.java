
package BaiTap2;


public class main_BT2 {

    public static void main(String[] args) {
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        GH1.setHinhThucTT(new ThanhToanOnline());
        GH1.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa HH1 = new HangHoa("Laptop DELL",300000,"Core i5");
        HangHoa HH2 = new HangHoa("Laptop Acer", 600000,"Core i5");
        HangHoa HH3 = new HangHoa("Laptop Asus", 900000,"Core i3");
        HangHoa HH4 = new HangHoa("Laptop Lenovo", 1500000,"Core i7");
        
        GH1.themHangHoa(HH1);
        GH1.themHangHoa(HH2);
        
        GH2.themHangHoa(HH3);
        GH2.themHangHoa(HH4);
        
        GH1.hienThi();
        System.out.println("Giõ hàng 1 | Tổng tiền hàng :   " + GH1.tinhTien());
        System.out.println("Giõ hàng 1 | Tiền Khách phải trả : "+ GH1.soTienKhachTra());
        
        GH2.hienThi();
        System.out.println("Giõ hàng 2 | Tổng tiền hàng :   " + GH2.tinhTien());
        System.out.println("Giõ hàng 2 | Tiền Khách phải trả : "+ GH2.soTienKhachTra());
    }
    
}
