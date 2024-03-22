package Day04_4;

public class Audio implements RemoteControl{

    // 필드 선언
    private int volume;


    // 추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("오디오 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume >= RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            // volume : 우리가 입력한 volume값(main에서)
            // this.volume : 클래스에서 선언해준 필드값(실제 저장될 볼륨값)
        } else if(volume <= RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }
}
