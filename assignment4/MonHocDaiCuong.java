package assignment4;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc{
    ArrayList<LopHoc> danhSachLopHoc = new ArrayList<LopHoc>();

    public void themLopHoc(String name,int soluonghocsinh){
        for(LopHoc lh:danhSachLopHoc){
            if(lh.tenLop == name){
                System.out.println("Lớp " + name + " đã tồn tại");
                return;
            }
        }
        danhSachLopHoc.add(new LopHoc(name,soluonghocsinh));
    }

    public void xoaLopHoc(String name){
        for(LopHoc lh:danhSachLopHoc){
            if(lh.tenLop == name){
                danhSachLopHoc.remove(lh);
                System.out.println("Xóa thành công lớp " + name);
                return;
            }
        }
        System.out.println("Lớp học chưa tồn tại");
    }

    public void sapXep(){
        if(danhSachLopHoc.size()==0) System.out.println("Danh sách hiện chưa có lớp học nào");
        else {
            int sstg;
            String tltg;
            for(int i=0;i<danhSachLopHoc.size();i++){
                for(int j=i+1;j<danhSachLopHoc.size();j++){
                    if(danhSachLopHoc.get(i).siSo<danhSachLopHoc.get(j).siSo){
                        sstg = danhSachLopHoc.get(j).siSo;
                        tltg = danhSachLopHoc.get(j).tenLop;
                        danhSachLopHoc.get(j).siSo = danhSachLopHoc.get(i).siSo;
                        danhSachLopHoc.get(j).tenLop = danhSachLopHoc.get(i).tenLop;
                        danhSachLopHoc.get(i).siSo = sstg;
                        danhSachLopHoc.get(i).tenLop = tltg;
                    }
                }
            }
            System.out.println("Danh sách lớp theo thứ tự sĩ số giảm dần: ");
            for(LopHoc lh:danhSachLopHoc){
                System.out.println(lh.tenLop + " - " + lh.siSo);
            }
            for(int i=0;i<danhSachLopHoc.size();i++){
                for(int j=i+1;j<danhSachLopHoc.size();j++){
                    if(danhSachLopHoc.get(i).siSo>danhSachLopHoc.get(j).siSo){
                        sstg = danhSachLopHoc.get(j).siSo;
                        tltg = danhSachLopHoc.get(j).tenLop;
                        danhSachLopHoc.get(j).siSo = danhSachLopHoc.get(i).siSo;
                        danhSachLopHoc.get(j).tenLop = danhSachLopHoc.get(i).tenLop;
                        danhSachLopHoc.get(i).siSo = sstg;
                        danhSachLopHoc.get(i).tenLop = tltg;
                    }
                }
            }
            System.out.println("Danh sách lớp theo thứ tự sĩ số tăng dần: ");
            for(LopHoc lh:danhSachLopHoc){
                System.out.println(lh.tenLop + " - " + lh.siSo);
            }
        }
    }

    public void inDanhSach(){
        for(LopHoc lh:danhSachLopHoc){
            System.out.println("Lớp: " + lh.tenLop);
            System.out.println("Sĩ số: " + lh.siSo);
            System.out.println("Danh sách học sinh: " + lh.danhSachLop);
        }
    }
}
