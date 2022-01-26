package com.example.friendbook;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    public TextField textgetname;
    public TextField textgetphone;
    public TextField textgetemail;
    public TextField textgetnickname;
    public ListView<friend> friendlist = new ListView<>();
    public Label labelphone;
    public Label labelemail;
    public Label lablenick;
    public Label lablename;
    public Button buttondelete;


    public void addfriend(ActionEvent actionEvent) {
        String name = textgetname.getText();
        String email = textgetemail.getText();
        String phonenum = textgetphone.getText();
        String nickname = textgetnickname.getText();
        friend temp = new friend (name,email,phonenum,nickname);
        friendlist.getItems().add(temp);
        textgetname.clear();
        textgetemail.clear();
        textgetphone.clear();
        textgetnickname.clear();
        buttondelete.setDisable(true);
    }

    public void displayfriend(MouseEvent mouseEvent) {
        friend temp;
        temp = friendlist.getSelectionModel().getSelectedItem();
        lablename.setText(temp.name);
        labelemail.setText(temp.email);
        labelphone.setText(temp.phonenum);
        lablenick.setText(temp.nickname);
        buttondelete.setDisable(false);
    }

    public void deletefriend(ActionEvent actionEvent) {
        friend temp;
        temp = friendlist.getSelectionModel().getSelectedItem();
        friendlist.getItems().remove(temp);
        lablename.setText("");
        labelemail.setText("");
        labelphone.setText("");
        lablenick.setText("");
    }
}