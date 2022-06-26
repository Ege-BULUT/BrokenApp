package com.ege.instagramtool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class HelloController {

    private String username = "", password = "", url = "";
    private WebDriver browser;

    @FXML
    private TextField in_username, in_password, in_url;
    @FXML
    private Button btn_insta, btn_search;
    @FXML
    private Label welcomeText;

    @FXML
    void onInstaBtnClick(ActionEvent event) {
        browser.get("https://www.instagram.com/");
    }

    @FXML
    void onSearchBtnClick(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "F:/PROJELER/WebScraping/ChromeDrivers/chromedriver_102.exe");
        browser = new ChromeDriver();

        in_url.setDisable(true);
        btn_insta.setDisable(true);
        btn_search.setDisable(true);


        in_username.textProperty().addListener((observable, oldText, newText)->{
            if(in_username.getText().length()>0){
                username = in_username.getText();
                if(!password.isBlank()){
                    btn_insta.setDisable(false);
                }
            }else{
                username = "";
                btn_insta.setDisable(true);
            }

        });

        in_password.textProperty().addListener((observable, oldText, newText)->{
            if(in_password.getText().length()>0){
                password = in_password.getText();
                if(!username.isBlank()){
                    btn_insta.setDisable(false);
                }
            }else{
                password = "";
                btn_insta.setDisable(true);
            }
        });
    }

}
