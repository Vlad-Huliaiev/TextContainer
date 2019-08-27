package com.gmail.gulyaev4420;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Container con = new Container();
        Class<?> cls = con.getClass();

        if(!cls.isAnnotationPresent(SaveTo.class)){
            System.out.println("Error");
            return;
        }

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method [] methods = cls.getDeclaredMethods();
        try {
            for (Method method : methods) {
                if (method.isAnnotationPresent(saver.class)) {
                    method.invoke(con, path);
                    System.out.println("Done");
                    break;
                } else {
                    System.out.println("Error");
                }
            }
        }catch (InvocationTargetException | IllegalAccessException tr) {
            tr.printStackTrace();
        }
    }
}
