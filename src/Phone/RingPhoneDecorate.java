package Phone;

public class RingPhoneDecorate extends PhoneDecorate {
    public RingPhoneDecorate(Phone p) {
        super(p);
    }


    @Override
    public void call() {
        System.out.println("手机可以听彩铃");
        super.call();
    }
}
