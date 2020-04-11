package com.samples.DataStruct;

import java.util.List;
import java.util.*;

public class Comparable {

     public static class Player implements java.lang.Comparable<Player> {

         private int ranking;
         private String name;
         private int age;

         public Player() {

         }

         public Player(int ranking, String name, int age) {
             this.ranking = ranking;
             this.name = name;
             this.age = age;
         }



         public int getRanking() {
             return ranking;
         }

         public void setRanking(int ranking) {
             this.ranking = ranking;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }

  //  compare based in age
         @Override
         public int compareTo(Player otherPlayer) {
             return (this.getName().compareTo(otherPlayer.getName()));
         }


     }

    public static void main(String[] args) {


         List<Player> footBallTeam = new ArrayList<>();
           Player player1 = new Player(10, "Zebra", 10);
           Player player2 = new Player(8, "Zara", 15);
           Player player3 = new Player(22, "Zane", 34);

           footBallTeam.add(player1);
           footBallTeam.add(player2);
           footBallTeam.add(player3);

           System.out.println("Before Sorting ....");
           for (Player t : footBallTeam){
               System.out.println(t.getRanking() + " " + t.getName() + " " + t.getAge());

           }
           Collections.sort(footBallTeam);

           System.out.println("After Sorting ....");
           for (Player t : footBallTeam){
               System.out.println(t.getRanking() + " " + t.getName() + " " + t.getAge());
           }

    }

}
