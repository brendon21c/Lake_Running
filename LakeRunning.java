package com.Brendon;

import java.util.*;

public class LakeRunning {

    public static void main(String[] args) {

        /*
        This section of code is where I am at. I can iterate ove the keys, but I don't know how
        to work with the List inside the Hashmap.
         */

        HashMap working = lake_Times();

        LinkedList lakes = new LinkedList();


        for (Object key : working.keySet()) {

            lakes.add(key.toString());
        }





    }





    /*
    This method asks the user for the names of the lakes and the run times they had. It
    then stores that information into a Hashmap with the lake as the key and a list of run times as
    the values.
     */
    public static HashMap<String, LinkedList<Double>> lake_Times() {



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

        return lakeTimes; // returns the hashmap.

    }



}
