package com.codegym.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Pruebas pruebas = new Pruebas();

        Method[] methods = Pruebas.class.getMethods();

        for(Method method: methods){
            //System.out.println(method.getName());
            Test testAnnotation = method.getAnnotation(Test.class);
            if(testAnnotation != null){
                method.invoke(pruebas);
            }
        }

    }
}
