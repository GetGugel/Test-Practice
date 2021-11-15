package com.mycompany.review;

import java.io.IOException;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private TextField textA;
    @FXML
    private TextField textB;
    @FXML
    private Button ComputeGCD;
    @FXML
    private Label OutputLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    
    @FXML
    private void CallGCD(ActionEvent event) {
        
        int a=Integer.parseInt(textA.getText());
        int b=Integer.parseInt(textB.getText());
        
        
       
        int GCD = (int)getGCD(a, b);
        OutputLabel.setText("The GCD is "+GCD);
    }
    
    
    
    int getGCD(int a, int b){
        
        while (a!=b){
            if (a>b) a=a-b;
            else b=b-a;
        } 
        return a;
    }
   

    
    
}
