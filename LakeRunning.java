package com.Brendon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LakeRunning {

    public static void main(String[] args) {

        /*
        This section of code is where I am at. I can iterate ove the keys, but I don't know how
        to work with the List inside the Hashmap.
         */

        HashMap working = lake_Times();

        LinkedList lakes = new LinkedList();

        LinkedList times = new LinkedList();


        for (Object key : working.keySet()) {

            lakes.add(key.toString());
        }

        System.out.println(lakes.get(0));

        for (int x = 0 ; x < lakes.size() ; x++) {

            String lake = lakes.get(x).toString();

            times.add(working.get(lake.));

        }

        Object final_time = times.get(0);








    }





    /*
    This method asks the user for the names of the lakes and the run times they had. It
    then stores that information into a Hashmap with the lake as the key and a list of run times as
    the values.
     */
    public static HashMap lake_Times() {



        HashMap<String, LinkedList<Double>> lakeTimes = new HashMap<String, LinkedList<Double>>();


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        //String lake = scanner.nextLine();

        //Double runTime = scanner.nextDouble();


        while (true) {

            System.out.println("Enter the lake you ran around: ");
            String lake = scanner.nextLine().toLowerCase();

            System.out.println("What was your time: ");
            Double runTime = scanner2.nextDouble();

            //LinkedList times = new LinkedList();

            //times.add(runTime);

            //lakeTimes.put(lake, times);

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
