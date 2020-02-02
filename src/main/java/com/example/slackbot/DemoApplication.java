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
        String param = text.toLowerCase();
        if (param.contains("help")) {
            return "=== For instructor office hours: ===\n"
                    + "course number (e.g. 'cpsc 110' or 'cpsc210')\n" +
                    "=== For BCS Program Director office hours: ===\n" +
                    "'steve' OR 'wolfman' OR 'director'\n" +
                    "=== For BCS tutor office hours: ===\n" +
                    "'bcs ta'\n" +
                    "Also let me know if you're 'bored' or want to hear a 'joke' ;)";
        } else if (param.contains("cpsc 110") || param.contains ("cpsc110")) {
            return "Gregor Kiczales has office hours on Thursday from 1:00 PM to 3:00 PM in ICICS/CS 311.\n" +
                    "Norman Hutchinson has office hours on Wednesday from 8:00 AM to 9:00 AM in ICICS/CS 319.\n" +
                    "Ola Oluwakemi has office hours on Tuesday  from 10:00 AM to 11:30 AM in ICICS/ CS 390.";

        } else if (param.contains("cpsc 121") || param.contains("cpsc121")) {
            return "Patrice Belleville has office hours on Tuesday  from 9:30 AM to 10:30 AM in ICICS/CS 343.\n" +
                    "Geoffrey Tien has office hours on Wednesday from 3:00 PM to 4:30 PM in ICICS/CS 245.\n";

        } else if (param.contains("cpsc 210") || param.contains("210")) {
            return "Paul Carter: Thursday 2:00 PM - 3:00 PM in ICICS/CS 391.\n" +
                    "Giovanni Viviani: Monday 11:00 AM - 12:00 PM in ICICS/ CS 255.\n" +
                    "Felix Grund: Wednesday 2:00 PM - 3:00 PM in ICICS/ CS 255.";

        } else if (param.contains("cpsc 221") || param.contains("221")) {
            return "Cinda Heeren: Monday 11:00 AM - 12:00 PM in ICICS/CS 390.\n" +
                    "Andrew Roth: Monday  -  in ICICS/CS 233.\n" +
                    "Geoffrey Tien: Friday  -  in ICICS/CS 300.";

        } else if (param.contains("bcs ta")) {
            return "Sasha Avreline: Monday 5:00 PM - 6:00 PM in ICICS/X 330.\n" +
                    "Jordan Chiu: Tuesday 5:00 PM - 6:00 PM in ICICS/X 330.";

        } else if (param.contains("joke") || param.contains("bored")) {
            Jokes myJokes = new Jokes();
            return  myJokes.tellJoke();

        } else if (param.contains("steve") || param.contains("worlfman") || param.contains("director")) {
            return "Steve Wolfman: Wednesday 1:00 PM - 3:00 PM in ICCS/X 330.";

        } else {
            return "Hi there! I would love to help but that request is invalid. \n" +
                    "To see valid options type '/bcsbot help'";
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
