package com.example.snakegame;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane root = new GridPane();
        root.setId("pane");

        Circle player1 = new Circle(15);
        Circle player2 = new Circle(15);
        player1.setFill(Color.BLUE);
        player2.setFill(Color.RED);

        // Create StackPane for players
        StackPane playerStack = new StackPane(player1, player2);
        playerStack.setAlignment(Pos.CENTER);
          root.add(playerStack,0,9);
        Scene scene = new Scene(root, 1000, 800);
        FileInputStream input;
        try{
            input = new FileInputStream("C:/Users/Pccoe/Documents/79/snake/snakegame/src/main/resources/image/board_image.jpg");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("File not founf");
            return;
        }
        for (int col = 0; col < 10; col++) {
            for (int row = 0; row < 10; row++) {
                Rectangle tile = new Rectangle(79, 79);
                tile.setFill(Color.TRANSPARENT);
                tile.setStroke(Color.BLACK);
                root.add(tile, col, row);

            }
        }
        // create a image
        Image image = new Image(input);

        // create a background image
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(800,800,false,false,false,false));

        // create Background
        Background background = new Background(backgroundimage);
        root.setBackground(background);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}