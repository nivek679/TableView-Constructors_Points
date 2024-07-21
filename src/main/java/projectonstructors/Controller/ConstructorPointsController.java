package projectonstructors.Controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import projectonstructors.Model.ConstructoresPoints;
import projectonstructors.Repo.RepoConstructoresPoints;

public class ConstructorPointsController implements Initializable{
    
    @FXML
    private TableColumn<ConstructoresPoints, String> clmCostructores;

    @FXML
    private TableColumn<ConstructoresPoints, Float> clmPoints;

    @FXML
    private TableView<ConstructoresPoints> tblConstructors;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        // Usar setCellValueFactory en lugar de setCellFactory

        clmCostructores.setCellValueFactory(new PropertyValueFactory<>("nameConstructors"));
        clmPoints.setCellValueFactory(new PropertyValueFactory<>("pointsConstructors"));
        
        cargarConstructorPoints();
    }
    
    private void cargarConstructorPoints() {
        RepoConstructoresPoints objConstructoresPoints = new RepoConstructoresPoints();
		List<ConstructoresPoints> ls_C = objConstructoresPoints.getDriversPoints();
        tblConstructors.getItems().addAll(ls_C);
    }
}
