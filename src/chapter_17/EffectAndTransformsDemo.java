package chapter_17;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.scene.transform.*;
import javafx.stage.*;

public class EffectAndTransformsDemo extends Application {

    private double angle = 0.0;
    private double scaleFactor = 0.4;
    private double blurVal = 1.0;

    private Reflection reflection = new Reflection();
    private BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    private Rotate rotate = new Rotate();
    private Scale scale = new Scale(scaleFactor, scaleFactor);

    private Button btnRotate = new Button("Rotate");
    private Button btnBlur = new Button("Blur");
    private Button btnScale = new Button("Scale");
    private Label reflect = new Label("Reflection Adds Visual Sparkle");

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Effects and Transforms Demo");

        FlowPane rootNode = new FlowPane(20, 20);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 120);

        myStage.setScene(myScene);

        btnRotate.getTransforms().add(rotate);
        btnScale.getTransforms().add(scale);

        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        btnRotate.setOnAction((ae) -> {
            angle += 15.0;

            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth()/2);
            rotate.setPivotY(btnRotate.getHeight()/2);
        });

        btnScale.setOnAction((ae) -> {
            scaleFactor += 0.1;
            if (scaleFactor >= 2) scaleFactor = 0.4;

            scale.setX(scaleFactor);
            scale.setY(scaleFactor);
        });

        btnBlur.setOnAction((ae) -> {
            if (blurVal == 10.0) {
                blurVal = 1.0;
                btnBlur.setEffect(null);
                btnBlur.setText("Blur off");
            }
            else {
                blurVal++;
                btnBlur.setEffect(blur);
                btnBlur.setText("Blur on");
            }
            blur.setWidth(blurVal);
            blur.setHeight(blurVal);
        });

        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);
        myStage.show();
    }
}
