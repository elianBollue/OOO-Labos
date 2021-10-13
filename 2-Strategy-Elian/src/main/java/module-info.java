module com.example.a2strategyelian {
    requires javafx.controls;
    requires javafx.fxml;
    requires rt;
    requires jfxrt;


    opens com.example.a2strategyelian to javafx.fxml;
    exports com.example.a2strategyelian;
    exports;
    opens to
}