package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppointmentTest {

    private Appointment appointment;

    @Before
    public void setUp() throws Exception {
        appointment = new Appointment();
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
    public void setCustomerIdValid() {
        appointment.setCustomerId(44);
        int expected = 44;
        assertEquals(expected, appointment.getCustomerId());
    }

    @Test
    public void setUserIdInvalid() {
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
    public void setUserIdValid() {
        appointment.setUserId(22);
        int expected = 22;
        assertEquals(expected, appointment.getUserId());
    }

    @Test
    public void setTitleInvalid() {
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
    public void setTitleValid() {
        appointment.setTitle("Test");
        String expected = "Test";
        assertEquals(expected, appointment.getTitle());
    }

    @Test
    public void setTypeInvalid() {
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
    public void setTypeValid() {
        appointment.setType("Test");
        String expected = "Test";
        assertEquals(expected, appointment.getType());
    }

    @Test
    public void setStartInvalid() {
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
    public void setStartValid() {
        appointment.setStart("2020-10-10 9:00:00");
        String expected = "2020-10-10 9:00:00";
        assertEquals(expected, appointment.getStart());
    }

    @Test
    public void setEndInvalid() {
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

    @Test
    public void setEndValid() {
        appointment.setEnd("2020-10-10 10:00:00");
        String expected = "2020-10-10 10:00:00";
        assertEquals(expected, appointment.getEnd());
    }
}