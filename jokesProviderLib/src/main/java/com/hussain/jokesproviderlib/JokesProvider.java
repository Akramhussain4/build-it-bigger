package com.hussain.jokesproviderlib;

import java.util.Random;

public class JokesProvider {

    private String[] jokes;
    private Random random;

    public JokesProvider() {
        jokes = new String[6];
        jokes[0] = "The first computer dates back to Adam and Eve. It was an Apple with limited memory, just one byte. And then everything crashed.";
        jokes[1] = "Maybe if we start telling people the brain is an app they will start using it.";
        jokes[2] = "My mom said that if I don't get off my computer and do my homework she'll slam my head on the keyboard,\n"
                + " but I think she's jokinfjreoiwjrtwe4to8rkljreun8f4ny84c8y4t58lym4wthylmhawt4mylt4amlathnatyn";
        jokes[3] = "My email password has been hacked. That's the third time I've had to rename the cat.";
        jokes[4] = "A clean house is the sign of a broken computer.";
        jokes[5] = "Q: What do you call the security outside of a Samsung Store? A: Guardians of the Galaxy.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
