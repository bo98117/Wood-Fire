package wood.fire;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static wood.fire.WoodFire.buttonEffect;

//Begin Subclass DinoRibs
public class DinoRibs {

    static DinoIngredients ingredients = new DinoIngredients();
    static DinoTechnique technique = new DinoTechnique();
    static Stage stage = new Stage();

    public void dino() {

        //Create a borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20, 20, 20, 20));
        borderPane.setStyle("-fx-border-color: black;\n");
        borderPane.setBackground(new Background(new BackgroundFill(Color.GAINSBORO, new CornerRadii(0), Insets.EMPTY)));

        //Set the borderpane
        borderPane.setTop(getVBoxTop());
        borderPane.setCenter(getHBoxImage());
        borderPane.setRight(getVBox());

        Scene scene = new Scene(borderPane, 700, 700);

        stage.setTitle("Wood & Fire");
        stage.setScene(scene);
        stage.show();
    }

    //HBox method for buttons
    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 15, 15, 15));
        vBox.setAlignment(Pos.CENTER);
        
        Button btingredients = new Button("Ingredients");
        btingredients.setStyle(buttonEffect.returnButton());
        vBox.getChildren().add(btingredients);
        btingredients.setOnAction(e -> {
            ingredients.dinoIngredients();
        });

        Button bttechnique = new Button("Technique");
        bttechnique.setStyle(buttonEffect.returnButton());
        vBox.getChildren().add(bttechnique);
        bttechnique.setOnAction(e -> {
            technique.dinoTechnique();
        });
        
        Button btback = new Button("Back");
        btback.setStyle(buttonEffect.returnButton());
        vBox.getChildren().add(btback);
        btback.setOnAction(e -> {
           stage.close(); 
        });
        

        return vBox;
    }

    //HBox method for the image
    private HBox getHBoxImage() {
        HBox hBox1 = new HBox(15);
        hBox1.setPadding(new Insets(15, 15, 15, 15));
        ImageView imageView = new ImageView(new Image("/beef ribs.jpg"));
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        hBox1.getChildren().add(imageView);

        return hBox1;
    }

    //VBox method to set the text on top
    private VBox getVBoxTop() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));

        VBox vBoxT = new VBox();
        Text topText = new Text("Dino Ribs");

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

} //End Subclass DinoRibs
