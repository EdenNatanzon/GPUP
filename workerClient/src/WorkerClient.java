import components.mainApp.MainAppControllerW;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class WorkerClient extends Application {

    private MainAppControllerW mainAppControllerW;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        // load main fxml
        URL mainFXML = getClass().getResource("components/mainApp/mainApp.fxml");
        loader.setLocation(mainFXML);
        Parent rootContainer = loader.load();
        // wire up controller
        mainAppControllerW = loader.getController();
        mainAppControllerW.setPrimaryStage(primaryStage);



        // set stage
        primaryStage.setTitle("G.P.U.P - Worker Client");
        Scene scene = new Scene(rootContainer);
        //css
        //scene.getStylesheets().add(getClass().getResource("/cssSkins/OldSchoolTheme.css").toExternalForm());
        primaryStage.setMinHeight(400f);
        primaryStage.setMinWidth(600f);
        primaryStage.setHeight(800f);
        primaryStage.setWidth(1500f);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        //mainAppController.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
