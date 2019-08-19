/**
 * 通过JDK提供的枚举来做枚举类
 */
public enum Direction {
    FRONT("前"){
        @Override
        public void show() {
            System.out.println("前");
        }
    }, BEHIND("后"){
        @Override
        public void show() {
            System.out.println("后");
        }
    },LEFT("左"){
        @Override
        public void show() {
            System.out.println("左");
        }
    },RIGHT("右"){
        @Override
        public void show() {
            System.out.println("右");
        }
    };

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show();
}
