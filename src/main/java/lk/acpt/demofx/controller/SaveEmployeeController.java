package lk.acpt.demofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.acpt.demofx.dto.EmployeeDto;
import lk.acpt.demofx.service.EmployeeService;
import lk.acpt.demofx.service.impl.EmployeeServiceImpl;

public class SaveEmployeeController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPosition;

    @FXML
    void cancle(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        String position = txtPosition.getText();

        EmployeeService service = new EmployeeServiceImpl();
        boolean saved = service.saveEmployee(new EmployeeDto(id, name, address, position));

        if (saved) {
            System.out.println("Saved Success !");
        } else {
            System.out.println("Failed !");
        }
    }
}
