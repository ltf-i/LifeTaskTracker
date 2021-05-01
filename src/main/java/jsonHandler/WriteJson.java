package jsonHandler;

import desktop.Main;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * TODO: yData Richtig schreiben {Vielleicht in initTerminal()}
 *
 */
public class WriteJson {
    private static JSONObject subject = new JSONObject();
    private static JSONObject x = new JSONObject();

    private static JSONObject dataObject = new JSONObject();
    private static JSONArray list = new JSONArray();

    /**
     * TODO: Schreibe den Code so das man das wie in x hat damit die einen namen haben
     */
    public static void addNewArray(){
//        subject.put(Main.subjectName, Main.subject);
//        x.put(Main.subjectName, x);

        x.put("ID", Main.subjectId);
        x.put("Date", Main.xDate);
        x.put("Data", Main.yData);
        x.put("Type", Main.type);
        x.put("Name", Main.subjectName);

        dataObject.put(Main.subjectName, x);

        // TODO: 1. GUCKE WARUM ES Verdoppelt wird
//        list.add(dataObject);
//        list.add(subject);
    }

//    public static void change(){
//        subject.put(Main.subjectName, subject);
//
//        x.put("ID", Main.subjectId);
//        x.put("Date", Main.xDate);
//        x.put("Data", Main.yData);
//        x.put("Type", Main.type);
//
//        list.add(subject);
//    }

    public static void addingJson(){
        //TODO: add an new Data with an new ID
        addNewArray();
        writing();
    }

    /**
     * TODO: Search for the rigth ID then change this data
     */
    public static void changing(){
//        change();
        writing();
    }

    /**
     * TODO: Search for the rigth ID then delete this data
     */
    public static void deleting(){

    }

    /**
     * Writes the Json file
     * FERTIG
     */
    public static void writing(){
        //TODO: Change the path for the final version
        try (FileWriter file = new FileWriter("/home/t450/Documents/Development/JavaProjects/LifeTask/src/main/java/OwnData")){
            file.write(dataObject.toJSONString());
        }catch (IOException e){
            e.printStackTrace();
        }

        //DEBUGING
        System.out.println();
        System.out.println(dataObject);
        System.out.println();
    }
}