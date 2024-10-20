package mx.com.pagos.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class registroPagosController {

    @FXML
    private Button btn_agregar_registro;

    @FXML
    private Button btn_buscar;

    @FXML
    private Button btn_guardar_registro;

    @FXML
    private ComboBox<?> cb_estatus_pago;

    @FXML
    private ComboBox<?> cb_tipo_banco;

    @FXML
    private DatePicker date_pago;

    @FXML
    private TextField txt_mto_pago;

    @FXML
    private TextField txt_num_credito;

    @FXML
    private TextField txt_num_pago;

}
