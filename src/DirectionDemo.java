public class DirectionDemo {
    public static void main(String[] args) {
        Direction d = Direction.FRONT;
        System.out.println(d);

        Direction d2 = Direction.FRONT;
        System.out.println(d2.getName());

        Direction d3 =  Direction.FRONT;
        System.out.println(d3.getName());
        d3.show();
    }
}
