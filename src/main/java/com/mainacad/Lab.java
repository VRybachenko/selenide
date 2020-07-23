package com.mainacad;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Lab {
    public static void main(String[] args) throws InterruptedException {

        open("https://demoqa.com/automation-practice-form");
        ///Заполняем поле firstNameField
        $(byId("firstName")).setValue("Test");
        Thread.sleep(1000);
        //Заполняем поле lastName
        $(byId("lastName")).setValue("TestTestovich");
        Thread.sleep(1000);
        //Заполняем поле Email
        $(byId("userEmail")).setValue("Testtestovich@gmail.com");
        Thread.sleep(1000);
        //Выбираем Checkbox
        $(byXpath("//*[@id='gender-radio-1']/..")).click();
        Thread.sleep(1000);
        //Заполняем поле Mobile
        $(byId("userNumber")).setValue("1234567890");
        Thread.sleep(1000);
        //Открываем календарь
        $(byId("dateOfBirthInput")).click();
        Thread.sleep(1000);
        //Выбираем месяц
        $(byCssSelector(".react-datepicker__tab-loop"));
        $(byCssSelector(".react-datepicker__month-select")).click();
        $(byCssSelector(".react-datepicker__month-select"));
        $(byCssSelector("[value='9']")).click();
        Thread.sleep(1000);
        //Выбираем год
        $(byCssSelector(".react-datepicker__year-select")).click();
        $(byCssSelector(".react-datepicker__year-select"));
        $(byCssSelector("[value='1984']")).click();
        Thread.sleep(1000);
        //Выбираем день
        $(byCssSelector(".react-datepicker__week:nth-child(3) .react-datepicker__day:nth-child(5)")).click();
        Thread.sleep(1000);
        //Выбираем Subjects
        $(byXpath("/html//input[@id='subjectsInput']")).sendKeys("Eng");
        $(byXpath("/html//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //Выбираем хобби спорт
        $(byXpath("//label[contains(.,'Sports')]")).click();
        Thread.sleep(1000);
        //Заполняем адресс
        $(byId("currentAddress")).setValue("4 Privet Drive, Surrey");
        Thread.sleep(1000);
        //Выбираем значение для State
        $(byXpath("/html//input[@id='react-select-3-input']")).sendKeys("Har");
        $(byXpath("/html//input[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //Выбираем значение для CITY
        $(byXpath("/html//input[@id='react-select-4-input']")).sendKeys("Kar");
        $(byXpath("/html//input[@id='react-select-4-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //Нажимаем на кнопку SUBMIT
        $(byId("submit")).click();
        Thread.sleep(1000);
        //Нажимаем на кнопку Close
        $(byId("closeLargeModal")).click();
    }
}
