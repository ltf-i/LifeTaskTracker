package desktop;

import java.util.ArrayList;
import java.util.HashMap;

import static dataHandler.InitialisingData.inputTerminal;

public class Main {

    public static void main(String[] args) {
        init();
    }

    public static ArrayList<Object> data = new ArrayList<Object>();
    public static ArrayList<Object> subject = new ArrayList<Object>();

    public static ArrayList<Long> xDate = new ArrayList<Long>();

    public static ArrayList<Object> yDataPoint = new ArrayList<>();
    public static ArrayList<Long> yData = new ArrayList<Long>();

    public static HashMap<Integer, String> yDataOh = new HashMap<Integer, String>();


    // MAKE AN ARRAY ???
    public static long subjectId = 0;
    public static int dataId = 0;
    public static long yDataId = 0;

    public static boolean type = false;

    public static String nameName = "apfel";
    public static String subjectName = "Sport";
    public static int yDataValue = 0;

    /**
     * Initializing the important things
     */
    public static void init() {
        data.add(subject);

		inputTerminal();
    }

    /**
     * TODO: Gucke ob die Reihenfolge gebrochen wird ?
     *
     * @param id
     */
    public static void deleteName(int id) {
        data.remove(id);
        dataId--;
    }

    public static void readData() {
        data.get(dataId);
    }
}