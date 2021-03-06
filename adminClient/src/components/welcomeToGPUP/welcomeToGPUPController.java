package components.welcomeToGPUP;

import components.mainApp.Controller;
import components.mainApp.MainAppController;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class welcomeToGPUPController implements Controller {

    @FXML private MainAppController mainAppController;
    private Node nodeController;

    @Override
    public void setMainAppController(MainAppController newMainAppController) {
        this.mainAppController = newMainAppController;
    }

    @Override
    public Node getNodeController(){
        return this.nodeController;
    }

    @Override
    public void setNodeController(Node node){
        this.nodeController = node;
    }





}
