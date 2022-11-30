module com.example.tugaspraktisi_javatime {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugaspraktisi_javatime to javafx.fxml;
    exports com.example.tugaspraktisi_javatime;
    exports com.example.tugaspraktisi_javatime.controller;
    opens com.example.tugaspraktisi_javatime.controller to javafx.fxml;
}