package org.mylearnings.serialization;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {

    private Person p;
    private Address a;
    private Employee e;

    @Before
    public void setUp() {
        p = new Person(22, "Saka");
        a = new Address();
        a.setHouseNumber(49);
        e = new Employee();
        e.setPerson(p);
        e.setAddress(a);
    }

    @Test
    public void whenCustomSerializingAndDeserialzing_ThenTheObjectIsSame() throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("newtest.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("newtest.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e2 = (Employee) ois.readObject();
        ois.close();

        assertEquals(e.getPerson().getAge(), e2.getPerson().getAge());
        assertTrue(e.getAddress().getHouseNumber() == e2.getAddress().getHouseNumber());

    }

    @After
    public void tearDown() {
        p = null;
        a = null;
        e = null;
    }
}
