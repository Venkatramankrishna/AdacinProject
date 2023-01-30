package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Config {
public static Properties p;
public Config() throws IOException {
File f = new File("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\src\\main\\java\\com\\properties\\adactin.properties");
FileInputStream fis = new FileInputStream(f);
p = new Properties();
p.load(fis);
}
public String geturl() {
	String url = p.getProperty("url");
	return url;
}
public String getusername() {
String username = p.getProperty("username");
return username;
}
public String getpassword() {
String password = p.getProperty("password");
return password;
}
public String getlocation() {
String property = p.getProperty("location");
return property;
}
public String getHotel() {
String property = p.getProperty("Hotel");
return property;
}
public String getrt() {
String property = p.getProperty("rt");
return property;
}
public String getNr() {
String property = p.getProperty("Nr");
return property;
}
public String getDi() {
String property = p.getProperty("Di");
return property;
}
public String getDou() {
String property = p.getProperty("Dou");
return property;
}
public String getAd() {
String property = p.getProperty("Ad");
return property;
}
public String getCh() {
String property = p.getProperty("Ch");
return property;
}
public String getFname() {
String property = p.getProperty("Fname");
return property;
}
public String getLname() {
String property = p.getProperty("Lname");
return property;
}
public String getAdd() {
String property = p.getProperty("Add");
return property;
}
public String getCc() {
String property = p.getProperty("Cc");
return property;
}
public String getCct() {
String property = p.getProperty("Cct");
return property;
}
public String getCcm() {
String property = p.getProperty("Ccm");
return property;
}
public String getCcy() {
String property = p.getProperty("Ccy");
return property;
}
public String getCcv() {
String property = p.getProperty("Ccv");
return property;
}

}