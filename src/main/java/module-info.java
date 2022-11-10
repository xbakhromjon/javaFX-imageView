module uz.bakhromjon.javafximageview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafximageview to javafx.fxml;
    exports uz.bakhromjon.javafximageview;
}