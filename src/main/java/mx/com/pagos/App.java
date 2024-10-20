package mx.com.pagos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import mx.com.pagos.util.R;

public class App extends Application {

    private static Scene scene;

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(R.getFXML("informeClientes"));
        Parent root = loader.load();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Informe de clientes");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
