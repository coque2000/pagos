package mx.com.pagos.util;

import java.io.File;
import java.net.URL;

public class R {
    
    public static URL getFXML(String name) {
        return Thread.currentThread().getContextClassLoader().getResource("templates/" + name + ".fxml");
    }
    
}
