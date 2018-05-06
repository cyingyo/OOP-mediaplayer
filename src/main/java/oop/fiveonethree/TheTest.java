package oop.fiveonethree;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by ZhouYing.
 * www.zhouying.xyz
 */
public class TheTest {
    public static void main(String[] args) {
        StringProperty prop1 = new SimpleStringProperty("qwer");
        StringProperty prop2 = new SimpleStringProperty("");

        prop2.bind(prop1);


        System.out.println("prop1.isBound() = " + prop1.isBound());
        System.out.println("prop2.isBound() = " + prop2.isBound());

        prop1.set("asdf");
        System.out.println(prop2.get());

        prop2.set("blablabla");
        System.out.println(prop1.get());
    }
}
