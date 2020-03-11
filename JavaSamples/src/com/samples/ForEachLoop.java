package com.samples;

public class ForEachLoop {


        public static void main(String[] args) {

            String[] names = {"Roger", "Tom", "Mary", "Rob"};

            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
            for (String name : names) {
                System.out.println(name);
            }

            String pets = "parrot";

            //	for (String pet : pets)  -- this will not compile because it is not array [].

            //	for (int i : pets)  -- can only iterate thru arrays.

            for (char pet : pets.toCharArray()) {
                System.out.println(pet);
            }

            String animal = "dog";

            for(char animals : animal.toCharArray()){
                System.out.println(animals);
            }

            String [] planets = {"Earth", "Venus"};

            for(int j=0; j< planets.length; j++){
                System.out.println(planets[j]);
            }

        }
    }
