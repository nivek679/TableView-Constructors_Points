module projectonstructors {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    opens projectonstructors.App to javafx.fxml;
    
    opens projectonstructors.Controller;
    opens projectonstructors.Model;
    opens projectonstructors.Repo;

    exports projectonstructors.App;
}
