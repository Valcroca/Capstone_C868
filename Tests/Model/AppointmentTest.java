package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppointmentTest {

    private Appointment appointment;

    @Before
    public void setUp() throws Exception {
        appointment = new Appointment(1111, 2, 2, "Test", "Test description", "Test Location", "Test Contact", "Test"," Test URL", "2004-10-19 10:23:54", "2004-10-19 11:23:54");
    }


    @Test
    public void setCustomerIdInvalid() {
        try {
            appointment.setCustomerId(-100);
            fail("negative setCustomerId() should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught negative value in setCustomerId()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setCustomerId() with negative argument");
        }
    }

    @Test
    public void setUserId() {
        try {
            appointment.setUserId(-100);
            fail("negative setUserId() should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught negative value in setUserId()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setUserId() with negative argument");
        }
    }

    @Test
    public void setTitle() {
        try {
            appointment.setTitle("");
            fail("empty string should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught empty title in setTitle()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setTitle() with empty string");
        }
    }

    @Test
    public void setType() {
        try {
            appointment.setType("");
            fail("empty string should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught empty type in setType()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setType() with empty string");
        }
    }

    @Test
    public void setStart() {
        try {
            appointment.setStart("");
            fail("empty string should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught empty type in setStart()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setStart() with empty string");
        }
    }

    @Test
    public void setEnd() {
        try {
            appointment.setEnd("");
            fail("empty string should trigger an exception");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Properly caught empty type in setEnd()");
        }
        catch(Exception e) {
            fail("wrong exception thrown for setEnd() with empty string");
        }
    }
}