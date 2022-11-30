module com.example.tugaspraktisi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugaspraktisi to javafx.fxml;
    exports com.example.tugaspraktisi;
    exports com.example.tugaspraktisi.controller;
    opens com.example.tugaspraktisi.controller to javafx.fxml;
}