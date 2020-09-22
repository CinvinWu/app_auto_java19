package com.cinvin.day01;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

//Author:Cinvin
//标题
public class FirstAppAuto {
    public static void main(String[] args) throws MalformedURLException {
        //所需功能类，把下面四个配置保存到其中
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //1.确认测试平台是android orIOS
        desiredCapabilities.setCapability("platformName","Android");
        //2.找到测试设备
        desiredCapabilities.setCapability("deviceName","127.0.0.1:62001");
        //3.找到测试的app
        desiredCapabilities.setCapability("appPackage","com.lemon.lemonban");
        //4.启动测试APP
        desiredCapabilities.setCapability("appActivity","com.lemon.lemonban.activity.WelcomeActivity");
        //5.把配置发送给Appium服务器，需要找到Appium服务器地址127.0.0.1：4723
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        //创建驱动对象,连接Appium服务器
        AndroidDriver androidDriver=new AndroidDriver(url,desiredCapabilities);

    }
}
