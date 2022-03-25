package assignment4;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong mhdc = new MonHocDaiCuong();

        //Thêm lớp học
        System.out.println("Thêm lớp học thành công");
        mhdc.themLopHoc("A1",2);
        mhdc.themLopHoc("A2",7);
        mhdc.themLopHoc("A3",4);
        mhdc.themLopHoc("A4",5);
        mhdc.themLopHoc("A5",3);
        mhdc.themLopHoc("A6",3);
        mhdc.themLopHoc("A3",1);
        mhdc.themLopHoc("A2",1);
        System.out.println("\nDanh sách các lớp:");
        for(LopHoc lh:mhdc.danhSachLopHoc){
            System.out.println(lh.tenLop + " - " + lh.siSo);
        }

        //Xóa lớp học
        mhdc.xoaLopHoc("A6");
        System.out.println("\nDanh sách các lớp:");
        for(LopHoc lh:mhdc.danhSachLopHoc){
            System.out.println(lh.tenLop + " - " + lh.siSo);
        }

        //Sắp xếp các lớp
        mhdc.sapXep();

        //Thêm học sinh vào các lớp
        LopHoc A1 = new LopHoc("A1",2);
        A1.themHocSinh("Cầm","A1");
        A1.themHocSinh("Linh","A1");
        A1.themHocSinh("Cường","A1");
        A1.themHocSinh("Duy","A1");
        mhdc.danhSachLopHoc.get(0).danhSachLop = A1.danhSachLop;

        LopHoc A3 = new LopHoc("A3",4);
        A3.themHocSinh("Cầm","A3");
        A3.themHocSinh("Linh","A3");
        A3.themHocSinh("Cường","A3");
        A3.themHocSinh("Duy","A3");
        mhdc.danhSachLopHoc.get(2).danhSachLop = A3.danhSachLop;

        LopHoc A5 = new LopHoc("A5",3);
        A5.themHocSinh("Cầm","A5");
        A5.themHocSinh("Linh","A5");
        A5.themHocSinh("Cầm","A5");
        A5.themHocSinh("Cường","A5");
        mhdc.danhSachLopHoc.get(1).danhSachLop = A5.danhSachLop;

        //In danh sách học sinh
        mhdc.inDanhSach();
    }
}
