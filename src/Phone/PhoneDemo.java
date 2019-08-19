package Phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new IPhone();
        p.call();
        System.out.println("----------");

        //需求：在接电话前听彩铃
        PhoneDecorate pd = new RingPhoneDecorate(p);
        pd.call();

        pd = new MusicPhoneDecorate(p);
        pd.call();


        pd = new RingPhoneDecorate(new MusicPhoneDecorate(p));
        pd.call();
    }
}
