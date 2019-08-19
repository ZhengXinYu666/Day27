public class GetTime {
    public long getTime(){
        long start = System.currentTimeMillis();
        for(int x =0; x<10000;x++){
            System.out.println(x);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
}
