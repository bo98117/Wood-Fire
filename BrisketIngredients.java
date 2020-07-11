package wood.fire;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static wood.fire.WoodFire.buttonEffect;

//Begin Subclass BrisketIngredients
public class BrisketIngredients {
    
    static Stage stage = new Stage();
    
    static Label lblsalt = new Label("Salt");
    static Label lblpepper = new Label("Pepper");
    
    CheckBox saltBox = new CheckBox();
    CheckBox pepperBox = new CheckBox();
    
    
    public void brisketIngredients() {

        //Create a borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20, 20, 20, 20));
        borderPane.setStyle("-fx-border-color: black;\n");
        borderPane.setBackground(new Background(new BackgroundFill(Color.GAINSBORO, new CornerRadii(0), Insets.EMPTY)));

        GridPane gpaneIngredients = new GridPane();
        
        gpaneIngredients.setAlignment(Pos.CENTER_LEFT);  //set the properties
        gpaneIngredients.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gpaneIngredients.setHgap(5.5);
        gpaneIngredients.setVgap(5.5);
        
        gpaneIngredients.add(lblsalt, 1, 0);
        gpaneIngredients.add(saltBox, 2, 0);
        gpaneIngredients.add(lblpepper, 1, 1);
        gpaneIngredients.add(pepperBox, 2, 1);
        
        
        //Set the borderpane
        borderPane.setTop(getVBoxTop());
        borderPane.setCenter(getHBoxImage());
        borderPane.setBottom(getHBox());
        borderPane.setRight(gpaneIngredients);
        
        Scene scene = new Scene(borderPane, 700, 700);

        stage.setTitle("Wood & Fire");
        stage.setScene(scene);
        stage.show();
    }
    
   
     //HBox method for buttons
    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setAlignment(Pos.CENTER);
        
        Button btback = new Button("Back");
        btback.setStyle(buttonEffect.returnButton());
        hBox.getChildren().add(btback);
        btback.setOnAction(e -> {
           stage.close(); 
        });
        
        Button btexit = new Button("Exit");
        btexit.setStyle(buttonEffect.returnButton());
        hBox.getChildren().add(btexit);
        btexit.setOnAction(e -> {
           System.exit(0); 
        });

        return hBox;
    }
    
    //HBox method for the image
    private HBox getHBoxImage() {
        HBox hBox1 = new HBox(15);
        hBox1.setPadding(new Insets(15, 15, 15, 15));
        ImageView imageView = new ImageView(new Image("/ribs.jpg"));
        imageView.setFitHeight(400);
        imageView.setFitWidth(400);
        hBox1.getChildren().add(imageView);

        return hBox1;
    }
    
    //VBox method to set the text on top
    private VBox getVBoxTop() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));

        VBox vBoxT = new VBox();
        Text topText = new Text("Ingredients");

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

} //End Subclass BrisketIngredients