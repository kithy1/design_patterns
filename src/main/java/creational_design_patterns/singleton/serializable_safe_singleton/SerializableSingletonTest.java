package creational_design_patterns.singleton.serializable_safe_singleton;

import java.io.*;

public class SerializableSingletonTest {
    public static void main(String[] args) throws Throwable {

        SerializableSingleton s = SerializableSingleton.getInstance();
        s.i = 5;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(s);
        oos.close();

        s.i = 7;
        System.out.println(s.i); // 7

        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(is);
        SerializableSingleton deserialized = (SerializableSingleton) ois.readObject();
        System.out.println(s.i == deserialized.i); // true
        System.out.println(s.i); // 7
        System.out.println(deserialized.i); // 7
    }
}
