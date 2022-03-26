package sesstion4.Assignment4;

public class main {
    public static void main(String args[]){
        MonHocDaiCuong dc = new MonHocDaiCuong();
        dc.themLopHoc("ABCDE", 5);
        dc.themLopHoc("T2103E", 19);
        dc.themLopHoc("T2108M", 18);
        dc.themLopHoc("T2109A", 24);
        dc.themLopHoc("T2109M", 19);
        dc.themLopHoc("T2201E", 25);

        //in
        System.out.println("IN Danh Sách Lớp Học:");
        dc.inDanhSach();

        //xoá
        dc.xoaLopHoc("ABC");
        System.out.println("IN Danh Sách Lớp Học Sau Khi Xoá Lớp: ABC");
        dc.inDanhSach();

        //sắp xếp
        System.out.println("IN Danh Sách Lớp Học Sau Khi Sắp Xếp Theo Sĩ Số:");
        dc.sapXep();
    }
}
