package com.firstrest.firstrest;
import com.firstrest.firstrest.controller.MessageController;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;

public class MessageControllerTest {
    public void PlusTest() {
        // Arrange
        int num1 = 10;
        int num2 = 20;
        var calculator = new MessageController();
        // Act
        int result = calculator.Plus(num1, num2);
        // Assert
        Assertions.assertEquals(30, result);
    }
    public void MinusTest() {
        // Arrange
        int num1 = 10;
        int num2 = 20;
        var calculator = new MessageController();
        // Act
        int result = calculator.Minus(num1, num2);
        // Assert
        Assertions.assertEquals(10, result);
    }
    public void MultiplyTest() {
        // Arrange
        int num1 = 10;
        int num2 = 20;
        var calculator = new MessageController();
        // Act
        int result = calculator.Multiply(num1, num2);
        // Assert
        Assertions.assertEquals(10, result);
    }
    public void DivideTest() {
        // Arrange
        int num1 = 10;
        int num2 = 20;
        var calculator = new MessageController();
        // Act
        int result = calculator.Divide(num1, num2);
        // Assert
        Assertions.assertEquals(2, result);
    }

}