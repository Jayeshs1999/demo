module com.example.myjavaf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myjavaf to javafx.fxml;
    exports com.example.myjavaf;
}