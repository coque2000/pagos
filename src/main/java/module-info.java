module mx.com.pagos {
    requires javafx.controls;
    requires javafx.fxml;

    //opens mx.com.pagos to javafx.fxml;
    
    // Permite acceder a campos privados
    opens mx.com.pagos.controller to javafx.fxml;

    exports mx.com.pagos.controller to javafx.fxml;
    exports mx.com.pagos;
    
}
