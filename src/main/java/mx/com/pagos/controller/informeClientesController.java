package mx.com.pagos.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mx.com.pagos.util.R;

public class informeClientesController {

    @FXML
    private Button btn_actualizar;

    @FXML
    private Button btn_buscar;

    @FXML
    private Button btn_registro;

    @FXML
    private ComboBox<?> cb_empresa;

    @FXML
    private ComboBox<?> cb_letras_pag;

    @FXML
    private ComboBox<?> cb_pagos_atrasados;

    @FXML
    private ComboBox<?> cb_plazo_pago;

    @FXML
    private ComboBox<?> cb_producto;

    @FXML
    private DatePicker date_inicio;

    @FXML
    private DatePicker date_pago;

    @FXML
    private TableView<?> tb_pagos;

    @FXML
    private TableColumn<?, ?> tc_dias_atrasados;

    @FXML
    private TableColumn<?, ?> tc_estatus_pago;

    @FXML
    private TableColumn<?, ?> tc_fecha_pago;

    @FXML
    private TableColumn<?, ?> tc_mto_pago;

    @FXML
    private TableColumn<?, ?> tc_num_pago;

    @FXML
    private TableColumn<?, ?> tc_situacion_pago;

    @FXML
    private TableColumn<?, ?> tc_tipo_pago;

    @FXML
    private TableColumn<?, ?> tc_vencimiento;

    @FXML
    private TextField txt_amortizacion;

    @FXML
    private TextField txt_cant_otorgada;

    @FXML
    private TextField txt_dias_atrasados;

    @FXML
    private TextField txt_estatus_credito;

    @FXML
    private TextField txt_mto_atrasados;

    @FXML
    private TextField txt_name_cliente;

    @FXML
    private TextField txt_num_cliente;

    @FXML
    private TextField txt_pagare;

    @FXML
    private TextField txt_plazo;

    @FXML
    private TextField txt_restante;

    @FXML
    private TextField txt_tasa;

    @FXML
    private TextField txt_ttl_pagado;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        tb_pagos.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        configurarColumnas();
    }

    public void configurarColumnas() {
        /*
        tc_num_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_vencimiento.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_mto_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_fecha_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_tipo_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_estatus_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_dias_atrasados.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
        tc_situacion_pago.setCellFactory(new PropertyValueFactory<>("nombre_atributo"));
         */
    }

    public void listar() {
        /*
        lista.clear();
        lista.addAll(servicio.obtenerClientes);
        tb_pagos.setItems(ol);
         */
    }

    @FXML
    public void abrir_buscar_registro(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(R.getFXML("registroClientes"));
            Parent root = loader.load();
            registroClientesController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    @FXML
    public void abrir_registrar_pago(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(R.getFXML("registroPagos"));
            Parent root = loader.load();
            registroPagosController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    @FXML
    public void abrir_actualizar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(R.getFXML("reporteClientes"));
            Parent root = loader.load();
            reporteClientesController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

}
