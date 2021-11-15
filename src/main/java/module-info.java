module com.mycompany.review {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.review to javafx.fxml;
    exports com.mycompany.review;
}
