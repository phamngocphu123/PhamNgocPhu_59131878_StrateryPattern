
package BaiTap1;

public class context {
    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    public float tinh (float a, float b){
        return tinhToan.tinh(a, b);
    }    
}
