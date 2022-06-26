module com.ege.instagramtool {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;
    opens com.ege.instagramtool to javafx.fxml;
    exports com.ege.instagramtool;
}