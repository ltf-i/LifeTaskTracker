package dataHandler;

import desktop.Enums.*;
import desktop.Main;
import jsonHandler.WriteJson;

import static jsonHandler.WriteJson.addingJson;

/**
 * TODO: Count the ID so you can know how many subjects you have
 *
 * TODO:  Add the right adding subject and try to organize update();
 *
 */

public class AddingNewData {

    public static NewObject newObject = NewObject.NORMAL;
    public static boolean typeSet = false;
    private static long previousSubjectId = 0;

    public static void init() {

        // Adds an new Object which has the [id, type, date, data]
        switch (newObject) {
            case ADDING:
                break;
            case CHANGING:
                WriteJson.changing();
                break;
            case DELETING:
                WriteJson.deleting();
                break;
        }
    }

//    public static void addNewDataPoint() {
//        Main.data.add(Main.name);
//
//        //TODO: initilize the new data ?
//    }

    /**
     * Adds an new Object to the data sheet.
     * An Object is an array of [ID,type,Date,Data]
     * Previous addName
     */
    public static void addSubject() {
        //TODO: add an new Object on next id point

//        if (Main.subjectId <= previousSubjectId) {
//
//        } else {

            Main.subject.add(0, Main.subjectId);
            Main.subject.add(1, Main.type);
            Main.subject.add(2, Main.xDate);
            Main.subject.add(3, Main.yDataPoint);

//            Main.subject.add(4,Main.subjectName);

            previousSubjectId = Main.subjectId;
            Main.subjectId++;
//        }

        // Adds it to json file
        addingJson();
    }

    public static void addNewYData (){
        Main.yDataPoint.add(0, Main.yData);
        Main.yDataPoint.add(1, Main.xDate);
    }

    /**
     * Looks if the Datapoint is an int or bool and then adds it
     *
     * @param value
     * @param normalNumber
     */
    public static void addNewYDataPoint(long value, boolean normalNumber) {
        if (normalNumber == true) {
            Main.yData.add(value);
        } else {
            long ergebnis = Main.type ? 1 : 0;
            Main.yData.add(ergebnis);
        }
    }
}