package Reflect;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //加载键值对数据
        Properties prop = new Properties();//把文件中的键值对加载
        FileReader fr = new FileReader("class.txt");
        prop.load(fr);
        fr.close();

        //获取数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //反射
        Class c = Class.forName(className);
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        //调用方法
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
