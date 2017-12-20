package chapter_17;

import javafx.application.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ListViewDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Label response;

    public void start(Stage myStage) {
        myStage.setTitle("ListView Demo");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 200, 120);

        myStage.setScene(myScene);

        response = new Label("Select Computer type");

        ObservableList<String> computerTypes =
                FXCollections.observableArrayList(
                        "Smartphone", "Tablet",
                        "Notebook", "Desktop"
                );

        ListView<String> lvComputers =
                new ListView<>(computerTypes);

        lvComputers.setPrefSize(100, 70);

        MultipleSelectionModel<String> lvSelModel =
                lvComputers.getSelectionModel();

        lvSelModel.selectedItemProperty().addListener(
                (observable, oldValue, newValue) ->
                        response.setText(
                                "Computer selected is " + newValue)
        );

        rootNode.getChildren().addAll(lvComputers, response);
        myStage.show();
    }
}
