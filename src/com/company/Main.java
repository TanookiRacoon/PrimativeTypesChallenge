package com.company;

public class Main {

    public static void main(String[] args) {
        byte myChallengeByte = 10;
        short myChallengeShort = 100;
        int myChallengeInt = 1000;

        long myChallengeLong = (50000L + 10L * (myChallengeByte + myChallengeShort + myChallengeInt));
        System.out.println(myChallengeLong);

        short shortTotal = (short) (1000 + 10 * (myChallengeByte + myChallengeShort + myChallengeInt));
    }
}