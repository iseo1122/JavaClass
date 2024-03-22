package Day03;

public class airConMain2 {

    public static void main(String[] args) {
    
        // 필드에 접근하는 방법2 : 매개변수를 사용해서 작성
        airCon aircon2 = new airCon("Samsung", "black", 200, 34, 21);

        System.out.println("제조회사 : " + aircon2.company);

        airCon aircon3 = new airCon("LG", 300);

        // aircon3에 색상, 온도, 크기를 지정하시오.
        aircon3.color = "white";
        aircon3.temp = 23;
        aircon3.size = 30;
        
        
    }
    
    
}
