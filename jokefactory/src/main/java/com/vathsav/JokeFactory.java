package com.vathsav;

import java.util.Random;

public class JokeFactory {
    public static String getJoke() {
        String[] arrayOfJokes = {
                // Yo mama time? \m/
                "Yo mama so fat, a planet revolves around her!",
                "Yo mama so chatty, her voice box died when she was 5!",
                "Yo mama so mean they don't give her happy meals at McDonalds.",
                "Yo mama so skinny, she could dive through a fence.",
                "Yo mama so tall she tripped over a rock and hit her head on the moon.",
                "Yo mama so bald that she took a shower and got brain-washed.",
                "Yo mama is so black, that she doesn't even need a shadow!",
                "Yo mama so hairy, that you need a lawn mower for her back",
                "Yo momma so hot she makes the devil sweat.",
                "Yo mama so lazy she undercooks ramen noodles.",
                "Yo mama so ugly One Direction went the other way!",
                "Yo mama's so old, Jurassic Park brought back memories.",
                "Yo mama so poor her tv has two channels. ON & OFF.",
                "Yo mama's so short, she tried to commit suicide with a pin.",
                "Yo mama so white she makes a marshmallow look tan.",
                "Yo mama so stupid she bought tickets to Xbox Live"
        };
        return arrayOfJokes[new Random().nextInt(arrayOfJokes.length)];
    }
}