package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 给定一个ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现
 */
public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<Integer>();

        Class c = array.getClass();//返回的是ArrayList的class文件对象

        Method m = c.getMethod("add",Object.class);


        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");//调用array的add方法，存起来是字符串


        System.out.println(array);
    }
}
