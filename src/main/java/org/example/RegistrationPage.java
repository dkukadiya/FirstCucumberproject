package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends Utils
    {
        LoadProp loadProp=new LoadProp();
        By _firstNamefiled=By.id("FirstName");
        By _lastNamefiled=By.id("LastName");
        By _email=By.id("Email");
        By _password=By.id("Password");
        By _Confirmpassword=By.id("ConfirmPassword");
        //click on register button
        By _register=By.name("register-button");
        By _selectDateOfBirthDay=By.name("DateOfBirthDay");
        By _selectDateOfBirthMonth=By.name("DateOfBirthMonth");
        By _selectDateOfBirthYear=By.name("DateOfBirthYear");

        public void usercanAddRegistrationDetails(){
            //Type Firstname
            typetext(_firstNamefiled,loadProp.getProperty("firstname"));
            // Type last name
            typetext(_lastNamefiled,loadProp.getProperty("lastname"));
            //select day from dropdown
            selectByVisibletext(_selectDateOfBirthDay,loadProp.getProperty("DOBDate"));
            //select month from dropdown
            selectByFromValue(_selectDateOfBirthMonth,loadProp.getProperty("DOBMonth"));
            //select year from dropdown
            selectByVisibletext(_selectDateOfBirthYear,loadProp.getProperty("DOBYear"));
            //Type email address
            typetext(_email,"dkukadiya+"+ currentTimestamp() +"@gmail.com");
            //Type Password
            typetext(_password,loadProp.getProperty("password"));
            //Type Confirm Password
            typetext(_Confirmpassword,loadProp.getProperty("confirmPassword"));
            //Click on register button
            waitForClickable(By.name("register-button"), 10);
            clickOnElement(_register);
        }
    }


