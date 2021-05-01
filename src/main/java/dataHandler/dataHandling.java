package dataHandler;

import desktop.Enums.*;
import desktop.Main;

import static dataHandler.AddingNewData.addSubject;
import static jsonHandler.WriteJson.*;

public class dataHandling {
    public static State state = State.NORMAL;

    /**
     * Get inside recursif
     */
    public static void whichState() {
//		while (true){
        switch (state) {
            case NORMAL:
                System.out.println("NORMAL");
                // TODO: Check the State
                break;
            case ADDING:
                adding();
                System.out.println(Main.data.get(0));
//					WriteJson.addNewNameObject();
                System.out.println("ADDING");
                break;
            case CHANGING:
                System.out.println("CHANGING");
                break;
            case DELETING:
                System.out.println("DELETING");
                break;
        }
//		}
    }

    public static void adding(){
        //TODO: add an new Data with an new ID

        addSubject();

        addNewArray();
        writing();
    }
    public static void changing(){
        //TODO: Search for the rigth ID then change this data
    }
    public static void deleting(){
        //TODO: Search for the rigth ID then delete this data

    }
}