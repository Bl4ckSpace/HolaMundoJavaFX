module com.dam.prog.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dam.prog.holamundojavafx to javafx.fxml;
    exports com.dam.prog.holamundojavafx;
}