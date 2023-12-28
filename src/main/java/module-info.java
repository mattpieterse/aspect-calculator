module com.mp.aspectcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.mp.aspectcalculator to javafx.fxml;
    exports com.mp.aspectcalculator;
}