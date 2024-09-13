package com.example.demo;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
 
import java.io.IOException;
 
public class HelloApplication extends Application {
    poly p1=new poly();
    @Override
    public void start(Stage stage) throws IOException {
        Label nameofapp=new Label("Shapes");
 
        Button rectanglebutton=new Button("Rectangle");
        Button Circle=new Button("Circle");
        HBox h1=new HBox(rectanglebutton,Circle);
        VBox grdi=new VBox(nameofapp,h1);
 
        Scene scene = new Scene(grdi, 300, 150);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch();
    }
 
    public void showcircle(){
        Popup shr=new Popup();
        Label l1s=new Label("Enter Radius");
        TextField text=new TextField();
        Button submit=new Button("Submit");
 
        Label showres=new Label();
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                double Area;
                Area=Integer.parseInt(text.getText());
                Area=p1.Area(Area);
 
                showres.setText(String.valueOf(Area));
            }
        };
        VBox forcircle=new VBox(l1s,text,submit,showres);
        shr.
        }
    }
 
 
class poly{
    public double Area(double a1,double a2){
        return a1*a2;
    }
    public double Area(double r){
        return 3.14*r*r;
    }
}
