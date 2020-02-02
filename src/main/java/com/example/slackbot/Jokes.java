package com.example.slackbot;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    private ArrayList<String> jokes;

    public Jokes() {
        jokes = new ArrayList<>(); //jokes
        jokes.add("Trust the Natural Recursion. Trust the Natural Recursion. Trust the Natural Recursion. Trust the Natural Recursion.");
        jokes.add("What did the spider do on the computer? \nMade a website!");
        jokes.add("What did the computer do at lunchtime? \nHad a byte!");
        jokes.add("Where do all the cool mice live? \nIn their mousepads.");
        jokes.add("Why was the computer cold? \nIt left it's Windows open!");
        //fun facts
        jokes.add("FunFact! \nTYPEWRITER is the longest word that you can write using the letters only on one row of the keyboard of your computer.");
        jokes.add("Fun Fact! \nAlgae grow on sloth fur, which camouflages them green.");
        jokes.add("Fun Fact! \nThe Largemouth Bass is the official state fish for Alabama, Georgia, Mississippi, Florida, and Tennessee.");
        jokes.add("Fun Fact! \nA group of hippos is usually called a bloat, pod, or herd.");

    }

    public String tellJoke() {
//        jokes.size();
        Random randomJoke = new Random();
        String random = jokes.get(new Random().nextInt(jokes.size()));
//        Joke myJoke = new Joke();
//        myJoke.setter(jokes.get(3));
//
        return random;

//        return myJoke.getter();
    }
}