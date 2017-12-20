package chapter_17;

import javafx.application.*;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private CheckBox cbSmartphone;
    private CheckBox cbTablet;
    private CheckBox cbNotebook;
    private CheckBox cbDesktop;

    private Label response;
    private Label selected;

    public void start(Stage myStage) {
        myStage.setTitle("CheckBox");

        FlowPane rootNode = new FlowPane(Orientation.VERTICAL,
                10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode,
                230, 200);
        myStage.setScene(myScene);

        Label heading = new Label("What computers Do" +
                "You own?");

        response = new Label("");
        selected = new Label("");

        cbSmartphone = new CheckBox("Smartphone");
        cbSmartphone.setAllowIndeterminate(true);
        cbTablet = new CheckBox("Tablet");
        cbNotebook = new CheckBox("Notebook");
        cbDesktop = new CheckBox("Desktop");

        //Actions
        cbSmartphone.setOnAction(event -> {
            if (cbSmartphone.isIndeterminate())
                response.setText("Smartphone state is indeterminate");
            else if (cbSmartphone.isSelected())
                response.setText("Smartphone was just selected");
            else response.setText("Smartphone was just cleared");
            showAll();
        });

        cbTablet.setOnAction(event -> {
            if (cbTablet.isSelected())
                response.setText("Tablet was just selected");
            else response.setText("Tablet was just cleared");
            showAll();
        });

        cbNotebook.setOnAction(event -> {
            if (cbNotebook.isSelected())
                response.setText("Notebook was just selected");
            else response.setText("Notebook  was just cleared");
            showAll();
        });

        cbDesktop.setOnAction(event -> {
            if (cbDesktop.isSelected())
                response.setText("Desktop was just selected");
            else response.setText("Desktop was just cleared");
            showAll();
        });

        rootNode.getChildren().addAll(heading,cbSmartphone,
                cbTablet,cbNotebook,cbDesktop,
                response,selected);

        myStage.show();
    }

    private void showAll() {
        String computers = "";
        if (cbSmartphone.isSelected()) computers += "Smartphone ";
        if (cbTablet.isSelected()) computers += "Tablet ";
        if (cbNotebook.isSelected()) computers += "Notebook ";
        if (cbDesktop.isSelected()) computers += "Desktop";
        selected.setText(computers);
    }
}
