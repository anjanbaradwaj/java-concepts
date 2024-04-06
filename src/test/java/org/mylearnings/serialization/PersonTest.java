package org.mylearnings.serialization;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void whenSerializingAndDeserializing_ThenObjectIsSame() throws IOException, ClassNotFoundException {
        Person p1 = new Person(22,"Bukayo Saka");

        FileOutputStream fileOutputStream = new FileOutputStream("testfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p1);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("testfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        assertEquals(p2.getAge(), p1.getAge());
        assertTrue(p2.getName().equals(p1.getName()));
    }
}
