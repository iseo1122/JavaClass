package Day04_4;

public class SmartTV extends Television implements InternetSearch{

    @Override
    public void search(String url) {
        System.out.println(url + "에서 내용을 검색합니다.");
    }

}
