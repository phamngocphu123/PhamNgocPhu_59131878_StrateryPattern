
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;

public class QLSV  {
    ISoSanh soSanh;
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    private SinhVien e;

    public QLSV() {
    }

    public ISoSanh getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    
    public void sapXep(){
        for (int i = 0;i<dsSV.size()-1;i++){
            for(int j = i+1; j<dsSV.size();j++){
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0)
                    Collections.swap(dsSV, i, j);
        }
    }
}
    public void inDS(){
        for (int i = 0;i<dsSV.size();i++){
                dsSV.get(i).hienThiTTSV();
        }
    }
    public void themSV(){
        dsSV.add(e);
    }
}