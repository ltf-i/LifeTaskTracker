package jsonHandler;

import dataHandler.InitialisingData;
import desktop.Main;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;


/**
 * TODO: Aender das hier so das mehr als eine Sache gelesen kann
 *
 */

public class ReadJson {

    public static String pathToJsonFile = "/home/t450/Documents/Development/JavaProjects/LifeTask/src/main/java/OwnData";
    public static String inputName = "lolyou";

    private static JSONObject jsonObject = null;
    private static JSONObject object = new JSONObject();

    private static Reader reader;
    private static JSONParser parser = new JSONParser();

    /**
     * //Speichert den ganzen json als string
     * //            Main.subjectName = jsonObject.toString();
     * //            System.out.println(Main.subjectName);
     */
    public static void readingJson(String input) {
        try {
            reader = new FileReader(pathToJsonFile);
            try {
                jsonObject = (JSONObject) parser.parse(reader);
            } catch (
                    IOException ioException) {
                ioException.printStackTrace();
            } catch (
                    ParseException parseException) {
                parseException.printStackTrace();
            }
            readingData(input);
//            debugMode();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reading the Data which is specified as the subjectName
     * <p>
     * Example: data{
     * Liegestuetze [id0, ...], Plank[id1, ...], Handstand[id2, ...]
     * <p>
     * }
     * <p>
     * input = Plank
     * <p>
     * output = [id1, ...]
     *
     * @param input
     */
    public static void readingData(String input) {
        object = (JSONObject) jsonObject.get(input);
        System.out.println(object);

        Main.subjectName = (String) object.get("Name");
        Main.type = (boolean) object.get("Type");
        Main.subjectId = (long) object.get("ID");
        Main.xDate = (ArrayList<Long>) object.get("Date");
        Main.yData = (ArrayList<Long>) object.get("Data");

        xDateReading();
    }

    /**Used for debugging purpose*/
    public static void debugMode() {
        System.out.println();
        System.out.print("SubjectName : ");
        System.out.println(Main.subjectName);

        System.out.print("Type : ");
        System.out.println(Main.type);

        System.out.print("yData : ");
        System.out.println(Main.yData);

        System.out.print("ID : ");
        System.out.println(Main.subjectId);

        System.out.print("Datum : ");
        System.out.print(InitialisingData.day);
        System.out.print(".");
        System.out.print(InitialisingData.month);
        System.out.print(".");
        System.out.println(InitialisingData.year);

        System.out.print("Uhrzeit : ");
        System.out.print(InitialisingData.hours);
        System.out.print(":");
        System.out.print(InitialisingData.minute);
        System.out.print(":");
        System.out.println(InitialisingData.seconds);
        System.out.println();
    }

    /**Initialises the xDate Variables*/
    public static void xDateReading() {
        InitialisingData.day = Main.xDate.get(0);
        InitialisingData.month = Main.xDate.get(1);
        InitialisingData.year = Main.xDate.get(2);

        InitialisingData.hours = Main.xDate.get(3);
        InitialisingData.minute = Main.xDate.get(4);
        InitialisingData.seconds = Main.xDate.get(5);
    }
}