package com.Brendon;

import java.util.*;

public class LakeRunning {

    public static void main(String[] args) {


        HashMap<String, LinkedList<Double>> lakeTimes = new HashMap<String, LinkedList<Double>>();


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);



        while (true) {

            System.out.println("Enter the lake you ran around: ");
            String lake = scanner.nextLine().toLowerCase();

            System.out.println("What was your time: ");
            Double runTime = scanner2.nextDouble();


            System.out.println("Do you want to make another entry? ");

            String runAgain = scanner1.nextLine();


            if (lakeTimes.containsKey(lake)) { // checks if the lake entered has been entered before.


                LinkedList time = lakeTimes.get(lake);
                time.add(runTime);
                lakeTimes.put(lake,time);

            }

            else { // This will add the lake and run time if no entry is found.

                LinkedList time = new LinkedList();
                time.add(runTime);
                lakeTimes.put(lake, time);



            }

            if (runAgain.equalsIgnoreCase("n")) { // loops the questionnaire.

                break;
            }
            else if (runAgain.equalsIgnoreCase("no")) {

                break;
            }
        }

        LinkedList lakes = new LinkedList();


        for (String key : lakeTimes.keySet()) {

            lakes.add(key);
        }

        for (int x = 0 ; x < lakes.size() ; x++) {

            LinkedList time = lakeTimes.get(lakes.get(x));

            Object max = Collections.max(time);

            System.out.println("The highest run time for each was: ");
            System.out.println();
            System.out.println(lakes.get(x).toString() + " " + max);

        }

    }



}
