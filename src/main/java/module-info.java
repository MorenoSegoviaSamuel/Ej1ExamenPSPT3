module org.example.ej1examenpspt3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ej1examenpspt3 to javafx.fxml;
    exports org.example.ej1examenpspt3;
}