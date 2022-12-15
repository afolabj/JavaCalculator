package com.example.javacalculator;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private Text savedNumbers;
    private String firstNumber = "";
    private String secondNumber = "";
    private String operator;

    public void calculationSetup(String operator){
        this.operator = operator;
        firstNumber = secondNumber;
        secondNumber = "";
        savedNumbers.setText(firstNumber + " " + operator);
    }

    @FXML
    void calculate(ActionEvent event) {
        int operand1 = Integer.parseInt(firstNumber);
        int operand2 = Integer.parseInt(secondNumber);

        switch (operator) {
            case "+" -> {
                int Result = operand1 + operand2;
                savedNumbers.setText(firstNumber + " + " + secondNumber + " = " + Result);
                textField.setText(String.valueOf(Result));
            }
            case "-" -> {
                int Result = operand1 - operand2;
                savedNumbers.setText(firstNumber + " - " + secondNumber + " = " + Result);
                textField.setText(String.valueOf(Result));
            }
            case "*" -> {
                int Result = operand1 * operand2;
                savedNumbers.setText(firstNumber + " * " + secondNumber + " = " + Result);
                textField.setText(String.valueOf(Result));
            }
            case "/" -> {
                double Result = operand1 / (double)operand2;
                savedNumbers.setText(firstNumber + " / " + secondNumber + " = " + Result);
                textField.setText(String.valueOf(Result));
            }

        }
    }

    @FXML
    public void clearTextField(ActionEvent event) {
        secondNumber = "";
        textField.setText("");
        savedNumbers.setText("");
    }

    @FXML
    protected void button0Click(ActionEvent event) {
        if(!secondNumber.equals("")){
            addNumber("0");
        }
    }
    @FXML
    protected void button1Click(ActionEvent event) {
        addNumber("1");
    }
    @FXML
    protected void button2Click(ActionEvent event) {
        addNumber("2");
    }
    @FXML
    protected void button3Click(ActionEvent event) {
        addNumber("3");
    }
    @FXML
    protected void button4Click(ActionEvent event) {
        addNumber("4");
    }
    @FXML
    protected void button5Click(ActionEvent event) {
        addNumber("5");
    }
    @FXML
    protected void button6Click(ActionEvent event) {
        addNumber("6");
    }
    @FXML
    protected void button7Click(ActionEvent event) {
        addNumber("7");
    }
    @FXML
    protected void button8Click(ActionEvent event) {
        addNumber("8");
    }
    @FXML
    protected void button9Click(ActionEvent event) {
        addNumber("9");
    }
    @FXML
    protected void addButton(ActionEvent event) { calculationSetup("+");}
    @FXML
    protected void subtractButton(ActionEvent event) { calculationSetup("-"); }
    @FXML
    protected void multiplyButton(ActionEvent event) { calculationSetup("*");}
    @FXML
    protected void divideButton(ActionEvent event) { calculationSetup("/");}




    public void updateTextField(){
        textField.setText(secondNumber);
    }

    public void addNumber(String number){
        secondNumber += number;
        updateTextField();
    }
}