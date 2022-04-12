module com.example.messagesystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.messagesystem to javafx.fxml;
    exports com.example.messagesystem;
}