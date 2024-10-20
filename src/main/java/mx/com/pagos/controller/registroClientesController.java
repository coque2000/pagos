package mx.com.pagos.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class registroClientesController {

    @FXML
    private Button btn_agregar_registro;

    @FXML
    private Button btn_guardar_registro;

    @FXML
    private ComboBox<?> cb_empresa;

    @FXML
    private ComboBox<?> cb_plazo_pago;

    @FXML
    private ComboBox<?> cb_producto;

    @FXML
    private DatePicker date_inicio;

    @FXML
    private DatePicker date_pago;

    @FXML
    private TextField txt_amortizacion;

    @FXML
    private TextField txt_cant_otorgada;

    @FXML
    private TextField txt_name_cliente;

    @FXML
    private TextField txt_num_cliente;

    @FXML
    private TextField txt_pagare;

    @FXML
    private TextField txt_plazo;

    @FXML
    private TextField txt_tasa;

}
