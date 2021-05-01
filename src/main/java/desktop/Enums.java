package desktop;

public class Enums {

    public enum Device {
        DESKTOP,
        IOS,
        ANDROID,
        MOBILE
    }


    public enum State {
        DELETING,
        ADDING,
        CHANGING,
        NORMAL
    }

    public enum NewObject {
        ADDING,
        DELETING,
        CHANGING,
        NORMAL
    }

    public enum DataTypes {
        ID,
        NAME,
        DATA,
        DATE,
        TYPES
    }

    //TODO: Setup the State right
    public enum InputInit {
        WRITE_,
        READ_,
        DELETE_

    }

    public enum READ {
        SHOW_YDATA,
    }

    public enum WRITE {
        INPUT_YDATA, INPUT_OBJECT
    }

    public enum Y_DATA {
        NORMALE_ZAHL,
        BOOL_ZAHL
    }
}