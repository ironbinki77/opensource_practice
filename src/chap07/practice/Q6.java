package chap07.practice;
import java.util.*;

class Location{
    String cityName;
    int lati, longi;

    public Location(String cityName, int lati, int longi){
        this.cityName = cityName;
        this.lati = lati;
        this.longi = longi;
    }
    public void print(){
        System.out.println(cityName + " " + lati + " " + longi);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Location> h = new HashMap<>();
        System.out.println("도시,경도,위도를 입력하세요.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            StringTokenizer st = new StringTokenizer(scanner.nextLine(),", ");
            String cityName = st.nextToken();
            int lati = Integer.parseInt(st.nextToken());
            int longi = Integer.parseInt(st.nextToken());
            Location l = new Location(cityName,lati, longi);
            h.put(cityName,l);
        }
        System.out.println("---------------------------");
        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String cityName = it.next();
            Location l = h.get(cityName);
            l.print();
        }
        System.out.println("---------------------------");
        while(true){
            System.out.print("도시 이름 >> ");
            String findcity = scanner.next();
            if(findcity.equals("그만"))
                break;
            Location l = h.get(findcity);
            if(l == null)
                System.out.println(findcity + "는 없습니다.");
            else
                l.print();
        }
    }
}
