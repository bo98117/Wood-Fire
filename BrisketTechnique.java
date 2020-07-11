package wood.fire;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
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

//Begin Subclass BrisketTechnique
public class BrisketTechnique {
    
    static Stage stage = new Stage();
    
    public void brisketTechnique() {

        //Create a borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20, 20, 20, 20));
        borderPane.setStyle("-fx-border-color: black;\n");
        borderPane.setBackground(new Background(new BackgroundFill(Color.GAINSBORO, new CornerRadii(0), Insets.EMPTY)));

        //Set the borderpane
        borderPane.setTop(getVBoxTop());
        borderPane.setBottom(getHBox());
        
        //StackPane secondaryLayout = new StackPane();
        Scene scene = new Scene(borderPane, 700, 700);

        stage.setTitle("Wood & Fire");
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    //VBox method to set the text on top
    private VBox getVBoxTop() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));

        VBox vBoxT = new VBox();
        Text topText = new Text("Technique");

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

} //End Subclass BrisketTechnique