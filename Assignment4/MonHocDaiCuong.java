package sesstion4.Assignment4;

import sesstion4.lab1.PhoneNumber;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc{
    public ArrayList<DSLH> ClassList = new ArrayList<>();

    @Override
    public void themLopHoc(String name,int siso){
        for(DSLH p:ClassList){
            if(p.name == name){
                for(int s:p.siso){
                    if(s == siso) return;
                }
                p.siso.add(siso);
                return;
            }
        }
        ClassList.add(new DSLH(name,siso));
    }

    @Override
    public void xoaLopHoc(String name){
        for (DSLH p:ClassList){
            if (p.name == name){
                ClassList.remove(p);
                return;
            }
        }
    }

    @Override
    public void sapXep(){
        String []arr = new String[10];
        int []ss = new int[10];
        int i = 0, count = 0;
        for(DSLH p:ClassList){
            arr[i] = p.name;
            for(int s:p.siso){
                ss[i] = s;
            }
            i++;
            count++;
        }
        for (i = 0; i < count; i++){
            for (int j = i+1; j < count; j++){
                if (ss[j] > ss[i]){
                    int a = ss[i];
                    ss[i] = ss[j];
                    ss[j] = a;
                    String c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
        for (i = 0; i < count; i++){
            System.out.println("\t" + arr[i] + "\t" + ss[i]);
        }
    }

    @Override
    public void inDanhSach(){
        for (DSLH p:ClassList){
            System.out.println("\t" + p.name + "\t" + p.siso);
        }
    }
}
