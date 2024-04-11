package controller;

import domain.Customer;
import domain.SinglyLinkedList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class AddCustomerController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField ageTextField;
    @javafx.fxml.FXML
    private BorderPane bp;
    private SinglyLinkedList customerList;
    Alert alert;

    @javafx.fxml.FXML
    public void initialize() {
        this.alert = util.UtilityFX.alert("Adding Customers", "");
        //cargamos la lista global
        this.customerList = util.Utility.getCustomerList();
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
        if(isValid()){
            Customer newCustomer = new Customer(
                    Integer.parseInt(this.idTextField.getText()),
                    this.nameTextField.getText(),
                    Integer.parseInt(this.ageTextField.getText()),
                    this.phoneTextField.getText(),
                    this.emailTextField.getText()
                    );
            this.customerList.add(newCustomer);
            //tambien se debe settear la lista global
            util.Utility.setCustomerList(this.customerList);

            alert.setAlertType(Alert.AlertType.INFORMATION);
            alert.setContentText("The customer was added");
        }else{
            //mensaje de alert de q falta info
        }
        alert.showAndWait();
    }

    private boolean isValid() {
        return !this.idTextField.getText().isEmpty();
    }

    @javafx.fxml.FXML
    public void cleanOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeOnAction(ActionEvent actionEvent) {
        util.UtilityFX.loadPage("ucr.lab.HelloApplication", "customer.fxml", bp);
    }
}