package com.example.tugaspraktisi.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField dollarAmount;
    @FXML
    private TextField exCanadian;
    @FXML
    private TextField exGerman;
    @FXML
    private TextField exBritish;
    @FXML
    private TextField canadianConverted;
    @FXML
    private TextField germanConverted;
    @FXML
    private TextField britishConverted;

    @FXML
    private void convertClicked(ActionEvent event){
        System.out.println("Convert Ter-Klik");

        try {
            Integer amountDollar = Integer.valueOf(dollarAmount.getText());
            Float canadian = Float.valueOf(exCanadian.getText());
            Float german = Float.valueOf(exGerman.getText());
            Float british = Float.valueOf(exBritish.getText());

            Float valueOfCanadian = amountDollar * canadian;
            Float valueOfGerman = amountDollar * german;
            Float valueOfBritish = amountDollar * british;
            canadianConverted.setText("$ " + String.valueOf(valueOfCanadian));
            germanConverted.setText("¤ " + String.valueOf(valueOfGerman));
            britishConverted.setText("£ " + String.valueOf(valueOfBritish));


            System.out.println("Value of Canadian Dollars   : " + valueOfCanadian);
            System.out.println("Value of German Marks       : " + valueOfGerman);
            System.out.println("Value of British Pounds     : " + valueOfBritish);

        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
            System.out.println("Error terjadi");
        }
    }



}