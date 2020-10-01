import Main.Main;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;

public class MyFirstTest {
//    @BeforeClass
//    public static void initTest(){
//        //about to launch
//        Thread thread = new Thread("JavaFX Init Thread") {
//            public void run() {
//                Application.launch();
//            }
//        };
//        thread.setDaemon(true);
//        thread.start();
//        System.out.print("JavaFX App Thread started\n");
//        Thread.sleep(5000);
//    }
    @Test
    public void firstTest() throws SQLException {
        //launch the app
        String[] args = {};
        Main.main(args);
        //assertions

    }
}
