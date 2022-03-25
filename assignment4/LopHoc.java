package assignment4;

import java.util.ArrayList;

public class LopHoc {
    String tenLop;
    int siSo;
    ArrayList<String> danhSachLop = new ArrayList<String>();

    public LopHoc(String name, int soluonghocsinh){
        tenLop = name;
        siSo = soluonghocsinh;
    }

    public void themHocSinh(String tenHocSinh, String tenLop){
        for(String ten:danhSachLop){
            if(ten == tenHocSinh){
                System.out.println("Học sinh đã tồn tại");
                return;
            }
        }
        kiemtrasiso(tenHocSinh,tenLop);
    }

    public void kiemtrasiso(String tenHocSinh, String tenLop){
        if(danhSachLop.size()>siSo-1){
            System.out.println("Lớp đã đủ học sinh");
        }else {
            danhSachLop.add(tenHocSinh);
            System.out.println("Thêm thành công\nDanh sách lớp: " + tenLop + " " + danhSachLop);
        }
    }
}
