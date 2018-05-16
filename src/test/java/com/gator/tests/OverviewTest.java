package com.gator.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gator.pages.OverviewPage;

import webdriver.webdriver;

import java.util.concurrent.TimeUnit;


public class OverviewTest {
    static WebDriver d;
    OverviewPage op = new OverviewPage();
    @BeforeTest
    public void beforeTest(){
        d = webdriver.openApp();
        webdriver.VPLogin();
    }
    @Test
    public void overview_test(){

        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String name = op.table(d).getText();
        System.out.println(name);
    }
    @Test
    public void click_names(){
        op.names(d).click();
    }
    @Test
    public void click_buildings(){
        op.building(d).click();
    }
    @Test
    public void click_curriculum(){
        op.curriculum(d).click();
    }
    @Test
    public void click_locations(){
        op.location(d).click();
    }
    @Test
    public void click_rooms(){
        op.room(d).click();
    }
    @Test
    public void click_startDate(){
        op.startDate(d).click();
    }
    @Test
    public void click_endDate(){
        op.endDate(d).click();
    }
    @Test
    public void click_trainers(){
        op.trainer(d).click();
    }
    @Test
    public void check_filter_inProgress(){
        op.filter(d).click();
        op.in_progress(d).click();
        //*[@id="menu_container_0"]/md-menu-content/md-menu-item[1]/button/span
    }

}
