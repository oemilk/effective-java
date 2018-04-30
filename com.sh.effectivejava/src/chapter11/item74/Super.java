package chapter11.item74;

import java.io.InvalidObjectException;
import java.io.Serializable;

class Super implements Serializable {

    String defaultVersion = "1.0.0";

    private void readObjectNoData() throws InvalidObjectException {
        defaultVersion = "1.0.0";
    }

}
