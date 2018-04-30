package chapter11.item74;

import java.io.Serializable;

class Sub extends Super implements Serializable {

    String version;

    Sub() {
        super();
        version = "3.0.2";
    }

}
