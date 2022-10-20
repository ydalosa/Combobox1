module com.example.combobox1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.combobox1 to javafx.fxml;
    exports com.example.combobox1;
}