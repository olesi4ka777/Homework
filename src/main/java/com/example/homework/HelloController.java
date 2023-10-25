package com.example.homework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle myCircle;

    @FXML
    private Slider speedslider;

    public HelloController(Circle myCircle, Slider speedslider) {
        this.myCircle = myCircle;
        this.speedslider = speedslider;
    }

    @FXML
    void movedown(ActionEvent event) {
        double y = myCircle.getCenterY();
        y+=speedslider.getValue();
        myCircle.setCenterY(y);
    }

    @FXML
    void moveleft(ActionEvent event) {
        double x = myCircle.getCenterX();
        x-= speedslider.getValue();
        myCircle.setCenterX(x);
    }

    @FXML
    void moveright(ActionEvent event) {
        double x = myCircle.getCenterX();
        x+= speedslider.getValue();
        myCircle.setCenterX(x);
    }

    @FXML
    void moveup(ActionEvent event) {
     double y = myCircle.getCenterY();
            y-= speedslider.getValue();
            myCircle.setCenterY(y);
    }
}
