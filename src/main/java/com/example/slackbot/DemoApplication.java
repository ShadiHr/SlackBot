package com.example.slackbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping
    @ResponseBody
    String home(@RequestParam String text) {
        if (text.equals("TA")) {
            return "Wednesdays 3-4 pm";
        } else {
            return "Hey Slackers!";
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
