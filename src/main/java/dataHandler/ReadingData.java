package dataHandler;

import jsonHandler.ReadJson;

import java.util.Scanner;

import static dataHandler.WritingData.deviceChossing;

public class ReadingData {
    public static Scanner scanner = new Scanner(System.in);

    /** Reading the Data point on the choosing point */
    public static void readingData() {
        switch (WritingData.reading) {
            case SHOW_YDATA:
                System.out.println("Gib namen ein des Subjectes welches du lesen moechtest");
                InitialisingData.input = scanner.next();
                //TODO: Handle the null pointer if wrong name is given --> watch inside the saved ids and names if there is the same name you want
                ReadJson.readingJson(InitialisingData.input);
            default:
                deviceChossing();
                break;
        }
        deviceChossing();
    }
}