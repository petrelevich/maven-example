package ru.otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * To start the application:
 * mvn package
 * java -jar ./m1-maven/target/m1-maven-jar-with-dependencies.jar
 * java -cp "./m1-maven/target/m1-maven.jar:${HOME}/.m2/repository/com/google/guava/guava/27.1-jre/guava-27.1-jre.jar" ru.otus.Main
 *
 * To unzip the jar:
 * unzip -l L01-maven.jar
 * unzip -l L01-maven-jar-with-dependencies.jar
 *
 * To build:
 * mvn package
 */
public class Main {

    public static void main(String... args) {
        List<Integer> example = new ArrayList<>();
        int min = 0;
        int max = 100;
        for (int i = min; i < max; i++) {
            example.add(i);
        }

        System.out.println(Lists.reverse(example));
        LibClass.print();
    }
}
