package dataHandler;

import desktop.Enums.*;

import static desktop.Main.subjectName;
//import static jsonHandler.WriteJson.change;


public class ChangingData {
    public static DataTypes dataTypes = DataTypes.ID;

    public static void init() {
        switch (dataTypes){
            case ID:
                break;
            case DATA:
                break;
            case DATE:
                break;
            case TYPES:
                break;
            case NAME:
                break;

        }
    }

    public static void changeName(String input){
        //TODO : get ID

       subjectName = input;

       //TODO: Update Json
//        change();

    }

}
