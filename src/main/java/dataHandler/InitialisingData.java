package dataHandler;

import desktop.Enums;
import desktop.Main;
import jsonHandler.ReadJson;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static dataHandler.AddingNewData.*;
import static dataHandler.ReadingData.readingData;
import static dataHandler.WritingData.*;
import static dataHandler.dataHandling.*;

public class InitialisingData {

    public static long day = 0;
    public static long month = 0;
    public static long year = 0;

    public static long hours = 0;
    public static long minute = 0;
    public static long seconds = 0;

    public static long inputYDataZahl = 0;

    public static String input = "";
    public static int inputState = 0;

//    public static Enums.InputInit inputInit = Enums.InputInit.WRITE_;
//    public static Enums.READ reading = Enums.READ.SHOW_YDATA;
//    public static Enums.WRITE writing = Enums.WRITE.INPUT_OBJECT;
//    public static Enums.Device device = Enums.Device.DESKTOP;
//    public static Enums.Y_DATA yDataInput = Enums.Y_DATA.NORMALE_ZAHL;

    public static Scanner scanner = new Scanner(System.in);

    /**
     * Input method for pc which does not use a gui
     */
    public static void inputTerminal() {

        System.out.println("Write = 0, Read = 1, Delete = 2 :");
        inputState = scanner.nextInt();
        switch (inputState) {
            case 0:
                inputInit = Enums.InputInit.WRITE_;
                break;
            case 1:
                inputInit = Enums.InputInit.READ_;
                break;
            case 3:
                inputInit = Enums.InputInit.DELETE_;
                break;
            default:
                inputTerminal();
                break;
        }

        update();
        inputHandling();
    }

    /**
     * Handling the States which are done now
     */
    public static void inputHandling() {
        switch (inputInit) {
            case READ_:
                readingData();
            case WRITE_:
                writingData();
            case DELETE_:
                deleting();
            default:
                deviceChossing();
                break;
        }
    }

    /**
     * Updating the important stuff
     */
    public static void update() {
        // TODO: Change this to updateSubject(); later

        //Updates the Date
        addXDate();
        // TODO: > Fuege Das in Data hinzu so ungefaehr [ [100, 12.2.2003], [234, 13.2.2003] ]
        // TODO: ODER mache das So [ [100, id1] , [234, id2] ]
        // TODO: ODER mache das so [ [100, 12.2.2003, id1] , [234,13.2.2003, id2] ]

        addSubject();
    }

    /**
     * LOESUNG = ES WERDEN NUR xDATE HINZUGEFUEGT UND NICHT GELOESCHT
     * <p>
     * Sets the xDate Array FERTIG
     */
    public static void addXDate() {
        setDateForToday();

        Main.xDate.add(day);
        Main.xDate.add(month);
        Main.xDate.add(year);

        Main.xDate.add(hours);
        Main.xDate.add(minute);
        Main.xDate.add(seconds);

    }

    /**
     * Sets the Date for Today FERTIG
     */
    public static void setDateForToday() {
        Calendar calendar = new GregorianCalendar();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH) + 1;
        year = calendar.get(Calendar.YEAR);

        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND);
    }
}