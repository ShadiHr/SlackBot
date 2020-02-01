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
        if (text.toLowerCase().contains("help")) {
            return "...list all valid options... ";
        } else if (text.toLowerCase().contains("cpsc 110")) {
            return "Gregor Kiczales has office hours on Thursday from 1:00 PM to 3:00 PM in ICICS/CS 311.\n" +
                    "Norman Hutchinson has office hours on Wednesday from 8:00 AM to 9:00 AM in ICICS/CS 319.\n" +
                    "Ola Oluwakemi has office hours on Tuesday  from 10:00 AM to 11:30 AM in ICICS/ CS 390.";

        } else if (text.toLowerCase().contains("cpsc 121")) {
            return "Patrice Belleville has office hours on Tuesday  from 9:30 AM to 10:30 AM in ICICS/CS 343.\n" +
                    "Geoffrey Tien has office hours on Wednesday from 3:00 PM to 4:30 PM in ICICS/CS 245.\n";

        } else if (text.toLowerCase().contains("cpsc 210")) {
            return "";

        } else if (text.toLowerCase().contains("cpsc 221")) {
            return "";

        } else if (text.toLowerCase().contains("bcs ta")) {
            return "";

        } else if (text.toLowerCase().contains("joke")) {
            return "";

        } else {
            return "Hi there! I would love to help but that request is invalid. \nTo see valid options type '/buddybot help'";
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
