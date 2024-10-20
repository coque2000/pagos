package mx.com.pagos.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class reporteClientesController {

    @FXML
    private Button btn_bucar;

    @FXML
    private Button btn_imprimir;

    @FXML
    private Button btn_xlsx;

    @FXML
    private TableView<?> tb_clientes;

    @FXML
    private TableColumn<?, ?> tc_cliente;

    @FXML
    private TableColumn<?, ?> tc_credito;

    @FXML
    private TableColumn<?, ?> tc_dias;

    @FXML
    private TableColumn<?, ?> tc_monto;

    @FXML
    private TableColumn<?, ?> tc_monto_atrasado;

    @FXML
    private TableColumn<?, ?> tc_pagos_atrasados;

    @FXML
    private TableColumn<?, ?> tc_ultima_fecha;

    @FXML
    private TextField txt_buscar;

}
