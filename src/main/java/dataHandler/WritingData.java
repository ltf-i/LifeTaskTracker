package dataHandler;

import desktop.Enums;

import java.util.Scanner;

import static dataHandler.AddingNewData.addNewYDataPoint;
import static dataHandler.InitialisingData.*;
import static desktop.Main.*;

/**
 * TODO: add Object adding
 */

public class WritingData {

    public static Enums.WRITE writing = Enums.WRITE.INPUT_YDATA;
    public static Enums.InputInit inputInit = Enums.InputInit.WRITE_;
    public static Enums.READ reading = Enums.READ.SHOW_YDATA;
    public static Enums.Device device = Enums.Device.DESKTOP;
    public static Enums.Y_DATA yDataInput = Enums.Y_DATA.NORMALE_ZAHL;

    public static Scanner scanner = new Scanner(System.in);

    public static int inputZahl = 0;

    /**
     * Handling which Data Point is written
     */
    public static void writingData() {
        //TODO: INPUT SYS.out for later

        switch (writing) {
            case INPUT_YDATA:
                //TODO: input the type ?
                System.out.println("Which type do you want ? 1 = NormaleZahl, 0 = BoolZahl");
                inputZahl = scanner.nextInt();

                //Aender auf type
                yDataInput = inputZahl == 0 ? Enums.Y_DATA.BOOL_ZAHL : Enums.Y_DATA.NORMALE_ZAHL;
                yDataInput();
                break;
            case INPUT_OBJECT:
                System.out.println("Object eingeben");
                //TODO: input object
                deviceChossing();
                break;
            default:
                deviceChossing();
                break;
        }
    }

    /** Handling which Device is used FERTIG */
    public static void deviceChossing() {
        //TODO: AENDERN nach input methode zb Desktop, android, ios
        if (device == Enums.Device.MOBILE) {
            //Debug
            System.out.println("MOBILE");
        } else {
            inputTerminal();
        }

//
//
//        System.out.println("Welche datei moechtest du eingeben: [object, yDataPoint]");
//        if (scanner.nextBoolean() == true) {
//            //TODO : Add an new Object
//            System.out.println("Object eingegeben");
//
//            System.out.println("Gib Namen ein: ");
//            Main.subjectName = scanner.next();
//
//            // addSubject();
//            System.out.println("Gib typen ein [0-1 , normaleZahl]");
//            Main.type = scanner.nextBoolean();
//
//            update();
//        }
//
    }

    /**
     * Chooses the Right Data type to input
     *
     * TODO: Vereinfache das so das es ohne inputTerminal funkt
     */
    public static void yDataInput() {
        switch (yDataInput) {
            case NORMALE_ZAHL:
                System.out.print("Gib Zahl ein : ");
                inputYDataZahl = scanner.nextLong();
                //TODO: Bei erster initialisierung InitData machen
                addNewYDataPoint(inputYDataZahl, true);
                System.out.println("ZAHL EINGEBEN");
                deviceChossing();
                break;

            case BOOL_ZAHL:
                //TODO: 0 1 eingabe
                System.out.print("Gib Zahl ein : ");
                inputYDataZahl = scanner.nextLong();
                addNewYDataPoint(inputYDataZahl, false);
                System.out.println("0 1 EINGEBEN");
                deviceChossing();
                break;
            default:
                deviceChossing();
                break;
        }
    }

    public static void setYData() {
        try {
            yData.set((int) yDataId, (long) yDataValue);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        yDataId++;
    }

    public static void writeData(String subject, int value) {
        try {

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        data.set(dataId, subject);

        dataId++;
    }

    /**
     * Sets Name tag
     */
    public static void setName(int value) {
        setYData();

        subject.set(0, subjectId);
        subject.set(1, xDate);
        subject.set(2, yData);
        subject.set(3, type);
        subject.set(4, nameName); // TODO: Brauchst du das ? teste
    }
}