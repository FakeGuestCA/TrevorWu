package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class HelloController {
    public Button buttonseven;
    public Button buttoneight;
    public Button buttonnine;
    public Button buttonfour;
    public Button buttonfive;
    public Button buttonsix;
    public Button buttonone;
    public Button buttontwo;
    public Button buttonthree;
    public Button buttonzero;
    public Button buttonadd;
    public Button buttonsubtract;
    public Button buttonmultiply;
    public Button buttondivide;
    public Button buttondelete;
    public double total = 0;
    public String num1 = "";

    @FXML
    private Label showtotal;
    public Label current;

    public void add(ActionEvent actionEvent) {
        total = Double.parseDouble(num1) + total;
        showtotal.setText(Double.toString(total));
        num1 = "";
        current.setText(num1);
    }

    public void sub(ActionEvent actionEvent) {
        total = total - Double.parseDouble(num1);
        showtotal.setText(Double.toString(total));
        num1 = "";
        current.setText(num1);
    }

    public void multi(ActionEvent actionEvent) {
        total = total * Double.parseDouble(num1);
        showtotal.setText(Double.toString(total));
        num1 = "";
        current.setText(num1);
    }

    public void div(ActionEvent actionEvent) {
        total = total / Double.parseDouble(num1);
        showtotal.setText(Double.toString(total));
        num1 = "";
        current.setText(num1);
    }

    public void del(ActionEvent actionEvent) {
        num1 = "";
        total = 0;
        showtotal.setText(Double.toString(total));
        current.setText(num1);
    }

    public void setseven(ActionEvent actionEvent) {
        num1 += 7;
        current.setText(num1);
    }


    public void seteight(ActionEvent actionEvent) {
        num1 += 8;
        current.setText(num1);
    }

    public void setnine(ActionEvent actionEvent) {
        num1 += 9;
        current.setText(num1);
    }

    public void setfour(ActionEvent actionEvent) {
        num1 += 4;
        current.setText(num1);
    }

    public void setfive(ActionEvent actionEvent) {
        num1 += 5;
        current.setText(num1);
    }

    public void setsix(ActionEvent actionEvent) {
        num1 += 6;
        current.setText(num1);
    }

    public void setone(ActionEvent actionEvent) {
        num1 += 1;
        current.setText(num1);
    }

    public void settwo(ActionEvent actionEvent) {
        num1 += 2;
        current.setText(num1);
    }

    public void setthree(ActionEvent actionEvent) {
        num1 += 3;
        current.setText(num1);
    }

    public void setzero(ActionEvent actionEvent) {
        num1 += 0;
        current.setText(num1);
    }
}