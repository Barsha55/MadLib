package com.Madlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // phase 1

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        String noun;

        String person;

        String place;

        String verbEndingInING;

        String adjectives;

        String adjectives2;

        String secondPerson;

        String secondVerbEnding;

        String morePlaces;

        String lastPlace;

        String descrbingWord;

        String noun2;

        String anotherName;

        String pastTenseVerb;

        String verb;

        String secondNoun;

        String adverb1;

        String adverb2;

        String pastTense2;

        String verb2;

        String nameofPlace;


        //phase 2
        System.out.println("Give me a noun");
        noun = keyboard.nextLine();

        System.out.println("Give me a person");
        person = keyboard.nextLine();

        System.out.println("Give me a place");
        place = keyboard.nextLine();

       System.out.println("give me a verbEndinginIng");
        verbEndingInING = keyboard.nextLine();

        System.out.println("Give me an adjective");
        adjectives = keyboard.nextLine();

        System.out.println("Give me another adjective ");
        adjectives2 = keyboard.nextLine();

        System.out.println("Give me another person");
        secondPerson = keyboard.nextLine();

        System.out.println("Give me a secondVerbEnding ");
        secondVerbEnding = keyboard.nextLine();

        System.out.println("Give me more places");
        morePlaces = keyboard.nextLine();

        System.out.println("Give me the last place");
        lastPlace = keyboard.nextLine();

        System.out.println("Give me a Describing word");
        descrbingWord = keyboard.nextLine();

        System.out.println("Give me something tall");
        noun2 = keyboard.nextLine();

        System.out.println("Give me another name");
        anotherName = keyboard.nextLine();

        System.out.println("Give me a past tense verb ");
        pastTenseVerb = keyboard.nextLine();

       System.out.println("Give me a verb");
        verb = keyboard.nextLine();

        System.out.println("Tell me one thing that is in your backpack");
        secondNoun = keyboard.nextLine();

        System.out.println("Give me another adverb ");
        adverb1 = keyboard.nextLine();

       System.out.println("Give me the last adverb ");
        adverb2 = keyboard.nextLine();
        System.out.println("Give me another past tense ");
        pastTense2 = keyboard.nextLine();

        System.out.println("Give me the last verb ");
        verb2 = keyboard.nextLine();

        System.out.println("Give me a name of the place");
        nameofPlace = keyboard.nextLine();


        //phase3
        System.out.println(" In  "+place + ", there was a "+ adjectives2 + " " + person + ". " );
        System.out.println("After "+noun + ",the " + adverb1 + " " +secondNoun+",cried out loud ");
        System.out.println(person + " " + verb2 + " over the "+ noun2+ ". ");
        System.out.println(nameofPlace+ " " +secondPerson+ " and "+anotherName+ " were crying out.");
        System.out.println(" There was ham and cheese on the " + morePlaces );
        System.out.println(" she ate till she " + verb+ " on the " +  adverb2+ ". " );
        System.out.println(pastTense2+ " she went to sleep on a " +secondVerbEnding+" " +lastPlace+ ".");
        System.out.println(" she climbed up the " +descrbingWord+ " " +verbEndingInING );
        System.out.println("behind the lake she " +pastTense2+ " on the "+adjectives+ " boat");
        System.out.println(pastTenseVerb +  " by the wind.");
 }
}