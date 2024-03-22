package Day04_4;

public class RemoteMain {

    public static void main(String[] args) {

        // 2. 타입변환(오디오)
        RemoteControl audio = new Audio();
        audio.turnOn();
        audio.setVolume(50);
        audio.setMute(true);
        audio.setMute(false);
        audio.turnOff();

        RemoteControl.changeBattery();
        System.out.println();

        // 1. 객체생성(SmartTV)
        SmartTV smart = new SmartTV();

        smart.turnOn();
        smart.setVolume(-3);
        smart.setMute(true);
        smart.setMute(false);
        smart.search("네이버");
        smart.turnOff();
    }
}
