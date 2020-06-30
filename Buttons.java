package wood.fire;

import javafx.scene.control.Button;

/** 
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Bophal Sin
 * @Assignment Name: wood.fire
 * @Date: Jun 27, 2020
 * @Subclass Buttons Description: 
 */
//Imports

//Begin Subclass Buttons
public class Buttons {

    String button = "-fx-background-color: \n"
                + "        #090a0c,\n"
                + "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
                + "        linear-gradient(#20262b, #191d22),\n"
                + "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
                + "    -fx-background-radius: 5,4,3,5;\n"
                + "    -fx-background-insets: 0,1,2,0;\n"
                + "    -fx-text-fill: white;\n"
                + "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
                + "    -fx-font-family: \"Arial\";\n"
                + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
                + "    -fx-font-size: 14px;\n"
                + "    -fx-padding: 10 20 10 20;";
    public String returnButton() {
        return button;
    } 
    
} //End Subclass Buttons