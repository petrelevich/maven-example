package ru.otus;

/**
 * @author sergey
 * created on 01.07.18.
 */

/*
Useful link:
https://maven.apache.org/plugins/maven-shade-plugin/index.html
 */

public class MainSh {
    public static void main(String[] args) {
        System.out.println("Hello, World. Shade test!");

        LibClass.print();
    }
}
