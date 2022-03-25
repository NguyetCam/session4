package assignment4;

public abstract class MonHoc {
    public abstract void themLopHoc(String name,int soluonghocsinh);
    public abstract void xoaLopHoc(String name);
    public abstract void sapXep(); // sắp xếp các lớp theo số lượng học sinh tham gia
    public abstract void inDanhSach(); // in ra danh sách các lớp đang học môn này và danh sách học sinh tham gia
}
