module com.example.kimepanel {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.kimepanel to javafx.fxml;
    exports com.example.kimepanel;
}