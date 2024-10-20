module org.example.calculator3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculator3 to javafx.fxml;
    exports org.example.calculator3;
}