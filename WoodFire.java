package wood.fire;

/**
 * @Course: SDEV 450 ~ Enterprise Java Programming
 * @Author Name: Bophal Sin
 * @Assignment Name: wood.fire
 * @Date: Jun 18, 2020
 * @Description:
 */
//Imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
//Begin Class WoodFire

public class WoodFire extends Application {

    static DinoNextWindow dino = new DinoNextWindow();
    static DinoIngredients ingredients = new DinoIngredients();
    static Buttons buttonEffect = new Buttons();

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Create a borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20, 20, 20, 20));
        borderPane.setStyle("-fx-border-color: black;\n");
        borderPane.setBackground(new Background(new BackgroundFill(Color.GAINSBORO, new CornerRadii(0), Insets.EMPTY)));

        //Set the borderpane
        borderPane.setTop(getVBoxTop());
        borderPane.setBottom(getHBoxImage());
        //borderPane.setLeft(grid);
        borderPane.setCenter(getHBox());
        //borderPane.setRight(getVoxTextArea());

        //Create a scene and place it into the stage
        Scene scene = new Scene(borderPane, 700, 700);
        primaryStage.setTitle("Wood & Fire");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    //Main method
    public static void main(String[] args) {
        launch(args);
    }

    //HBox method for buttons
    private HBox getHBox() {
        HBox hBox = new HBox(35);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setAlignment(Pos.CENTER);

//        Button bthome = new Button("Home");
//        bthome.setStyle(buttonEffect.returnButton());
//        
//        hBox.getChildren().add(bthome);
        
        Button btdinoRibs = new Button("Dino Ribs");
        btdinoRibs.setStyle(buttonEffect.returnButton());
        hBox.getChildren().add(btdinoRibs);
        btdinoRibs.setOnAction(e -> {

            dino.dino();
        });

        Button btbabyBackRibs = new Button("Baby Back Ribs");
        btbabyBackRibs.setStyle(buttonEffect.returnButton());
        hBox.getChildren().add(btbabyBackRibs);

        Button btbrisket = new Button("Brisket");
        btbrisket.setStyle(buttonEffect.returnButton());
        hBox.getChildren().add(btbrisket);

        return hBox;
    }

    //HBox method for the image
    private HBox getHBoxImage() {
        HBox hBox1 = new HBox(15);
        hBox1.setPadding(new Insets(15, 15, 15, 15));
        ImageView imageView = new ImageView(new Image("/ribs4.jpg"));
        hBox1.getChildren().add(imageView);

        return hBox1;
    }

    //VBox method to set the text on top
    private VBox getVBoxTop() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));

        VBox vBoxT = new VBox();
        Text topText = new Text("Wood & Fire");

        topText.setEffect(ds);
        topText.setCache(true);
        topText.setX(10.0f);
        topText.setY(270.0f);
        topText.setFill(Color.RED);
        topText.setFont(Font.font(null, FontWeight.BOLD, 90));
        vBoxT.setAlignment(Pos.CENTER);
        VBox.setMargin(topText, new Insets(10, 10, 0, 10));
        topText.setFill(Color.BURLYWOOD);
        topText.setStroke(Color.DARKRED);
        topText.setStrokeWidth(2);
        vBoxT.getChildren().addAll(topText);
        return vBoxT;
    }

} //End Class WoodFire
