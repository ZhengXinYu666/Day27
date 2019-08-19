package Reflect;

public class TooleDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();

        Tool t = new Tool();
        t.setProperty(p,"name","林青霞");
    }
}

class Person{
    private String name;
    public int age;

    public String toString(){
        return name+"---"+age;
    }
}
