package projectonstructors.App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage Scenario) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/projectonstructors/View/resources/fxml/ConstructorPointsView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Scenario.setTitle("Constructor POINTS");
        Scenario.setScene(scene);
        Scenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
