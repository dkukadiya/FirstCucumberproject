package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends RegistrationPage
{
    public void verifyUserShouldbeabletoRegisterSuccesfully()
    {

        String actualRegisterSuccessmessage = getTextFromElement(org.openqa.selenium.By.xpath("//div[@class='result']"));
        String expectedRegisterSuccessmessge = "Your registration completed";
        Assert.assertEquals(actualRegisterSuccessmessage,expectedRegisterSuccessmessge);
    }}
