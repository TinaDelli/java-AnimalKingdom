package animals;

import java.util.*;

public class Main
{
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

   } 
}
