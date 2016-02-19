package com.Brendon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LakeRunning {

    public static void main(String[] args) {



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

            if (lakeTimes.containsKey(lake)) {

                //times.removeAll(times);
                //times.add(runTime);
                //lakeTimes.put(lake, times);
                LinkedList time = lakeTimes.get(lake);
                time.add(runTime);
                lakeTimes.put(lake,time);

            }

            else {

                LinkedList time = new LinkedList();
                time.add(runTime);
                lakeTimes.put(lake, time);



            }

            if (runAgain.equalsIgnoreCase("n")) {

                break;
            }
            else if (runAgain.equalsIgnoreCase("no")) {

                break;
            }
        }

        System.out.println(lakeTimes.keySet());

    }


}
