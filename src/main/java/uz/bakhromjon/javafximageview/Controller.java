package uz.bakhromjon.javafximageview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;
import java.nio.file.Files;

public class Controller {
    @FXML
    private ImageView myImageView;
    @FXML
    private Button myButton;

//    private Image myImage = new Image(getClass().getResourceAsStream("photo1.jpg"));

    public void displayImage(ActionEvent event) throws IOException {
        File file = new File("/home/xbakhromjon/Downloads/Ex_Files_Web_Apps_Spring_Boot_WebSockets/Exercise Files/Ch04/04_01/JavaFX-imageView/src/main/resources/photos/photo2.jpg");
        InputStream inputStream = Files.newInputStream(file.toPath());
        Image image = new Image(inputStream);
        myImageView.setImage(image);
    }
}

