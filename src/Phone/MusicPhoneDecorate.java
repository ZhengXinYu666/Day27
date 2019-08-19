package Phone;

public class MusicPhoneDecorate extends PhoneDecorate {
    public MusicPhoneDecorate(Phone p) {
        super(p);
    }

    @Override
    public void call() {
        System.out.println("手机可以听音乐了");
        super.call();
    }
}
