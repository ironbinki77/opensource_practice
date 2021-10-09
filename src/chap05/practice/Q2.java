package chap05.practice;

class TV{
    private int size;
    public TV(int size){ this.size = size; }
    protected int getSize(){ return size; }
}
class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public void printProperty(){
        System.out.println(getSize() + "인치 " + color + "컬러");
    }
    protected int getColor(){ return color; }
}
class IPTV extends ColorTV{
    private String adress;
    public IPTV(String adress, int size, int color){
        super(size,color);
        this.adress = adress;
    }
    public void printProperty(){
        System.out.println("나의 IPTV는 " + adress + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }
}
public class Q2 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048 컬러

        iptv.printProperty();
    }
}
