package animals;

import java.util.*;

public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
    {
        for (AbstractAnimal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " Breathes From: " + a.getBreathType());
            }
        }
    }
   public static void main (String[] args)
   {
       System.out.println("***Animal Collection ***");
       System.out.println();

       Mammals panda = new Mammals(50, "Panda", 1869);
       Mammals zebra = new Mammals(50, "Zebra", 1778);
       Mammals koala = new Mammals(50, "Koala", 1816);
       Mammals sloth = new Mammals(50, "Sloth", 1804);
       Mammals armadillo = new Mammals(50, "Armadillo", 1758);
       Mammals raccoon = new Mammals(50, "Raccoon", 1758);
       Mammals bigfoot = new Mammals(50, "Bigfoot", 2021);

       Birds pigeon = new Birds(50, "Pigeon", 1837);
       Birds peacock = new Birds(50, "Peacock", 1821);
       Birds toucan = new Birds(50, "Toucan", 1758);
       Birds parrot = new Birds(50, "Parrot", 1824);
       Birds swan = new Birds(50, "Swan", 1758);

       Fish salmon = new Fish(50, "Salmon", 1758);
       Fish catfish = new Fish(50, "Catfish", 1817);
       Fish perch = new Fish(50, "Perch", 1758);

       ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();
       myList.add(panda);
       myList.add(zebra);
       myList.add(koala);
       myList.add(sloth);
       myList.add(armadillo);
       myList.add(raccoon);
       myList.add(bigfoot);

       myList.add(pigeon);
       myList.add(peacock);
       myList.add(toucan);
       myList.add(parrot);
       myList.add(swan);

       myList.add(salmon);
       myList.add(catfish);
       myList.add(perch);

       System.out.println(myList.toString());
       System.out.println();

       System.out.println("***Lambda Expressions");
       System.out.println("Animals By Year In Decending Order: ");
       myList.sort((a1, a2) -> a2.getYear().compareTo(a1.getYear()));

       myList.forEach((a) -> System.out.println(a.getName() + " Was Named in Year: " + a.getYear()));
       System.out.println();
    
       System.out.println("Animals By Movement Type: ");
       myList.sort((a1, a2)-> a1.getMovement().compareToIgnoreCase(a2.getMovement()));
       myList.forEach((a)-> System.out.println("Animal: " + a.getName() + " Moves By: " + a.getMovement()));
       System.out.println();

       System.out.println("Animals Alphabetically: ");
       myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
       myList.forEach((a) -> System.out.println(a.getName()));
       System.out.println();

       System.out.println("Animals That Breathe by Lungs");
       printAnimals(myList, a -> a.getBreathType()== "Lungs");
       System.out.println();

       System.out.println("Animals That Breathe by Lungs and were Named in 1758:");
       printAnimals(myList, a -> (a.getBreathType() =="Lungs") && (a.getYear() == 1758));
       System.out.println();
       
   } 
}
