package chapter01.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Person person = new Person("엄");
        System.out.println(person);

        Class c = Class.forName("chapter01.ch04.Person");

        Class[] parameterTypes = {String.class};
        Constructor cons = c.getConstructor(parameterTypes);

        Object[] objects = {"엄준식"};
        Person um = (Person) cons.newInstance(objects);
        System.out.println(um);
    }
}
