import javax.swing.table.AbstractTableModel;
import java.util.*;

public class FellowShipOfTheRing {
    public static void main(String[] args) {
        Set<String> dwarves = new HashSet<>(Arrays.asList("Gimli"));

        Set<String> elves = new HashSet<>(List.of("Legolas"));

        Set<String> humans = new HashSet<>(List.of("Aragorn", "Boromir"));

        Set<String> hobbits = new HashSet<>(Arrays.asList("Frodo", "Sam", "Merry", "Pippin"));

        Set<String> fellowship = new HashSet<>();
        fellowship.addAll(dwarves);
        fellowship.addAll(elves);
        fellowship.addAll(humans);
        fellowship.addAll(hobbits);
        fellowship.add("Gandalf");
        System.out.println(fellowship);

        fellowship.remove("Gandalf");
        fellowship.add("Gandalf White");

        fellowship.removeAll(hobbits);
        System.out.println(fellowship.containsAll(hobbits));

        System.out.println(fellowship.contains("Boromir"));




        int[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};
        Set numbersList = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(numbers[i]);
        }
        System.out.println(numbersList);

        // páros és páratlan számok
        Set evenNumbers = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            }
        }
        System.out.println(evenNumbers);

        Set oddNumber = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                oddNumber.add(numbers[i]);
            }
        }
        System.out.println(oddNumber);

        Random dobokocka = new Random();
        List<Integer> diceList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 1001; i++) {
            int randomRoll = dobokocka.nextInt(1,7);
            diceList.add(randomRoll);
            sum += randomRoll;
        }
        int average = sum / 1000;
        System.out.println("dobásátlag: " + average);
        int egyes = 0;
        int kettes = 0;
        int harmas = 0;
        int negyes = 0;
        int otos = 0;
        int hatos = 0;
        for (int i = 0; i < diceList.size(); i++) {
            if(diceList.get(i) == 1) {
                egyes += 1;
            }
            if(diceList.get(i) == 2) {
                kettes += 1;
            }
            if(diceList.get(i) == 3) {
                harmas += 1;
            }
            if(diceList.get(i) == 4) {
                negyes += 1;
            }
            if(diceList.get(i) == 5) {
                otos += 1;
            }
            if(diceList.get(i) == 6) {
                hatos += 1;
            }
        }
        System.out.println("A listában ennyi 1-es van: " + egyes);
        System.out.println("A listában ennyi 2-es van: " + kettes);
        System.out.println("A listában ennyi 3-es van: " + harmas);
        System.out.println("A listában ennyi 4-es van: " + negyes);
        System.out.println("A listában ennyi 5-es van: " + otos);
        System.out.println("A listában ennyi 6-es van: " + hatos);

        int[] numbersArray = {34808, 422, 334, 12014, 412617, 292389, 342260, 32244, 334534, 497721, 3775, 544, 433, 55340, 257952, 1496173, 73, 539141, 3355, 305720, 3677429, 114047, 5656 };

//        ⎼ Van ismétlődés a tömbben? (Szerepel-e többször ugyanaz a szám?)
        Set numbersSet = new HashSet<>();
        for (int i = 0; i < numbersArray.length; i++) {
            numbersSet.add(numbersArray[i]);
        }
        System.out.println("Van ismétlődés a tömbben? " + (numbersSet.size() != numbersArray.length ? "van" : "nincs"));

//        ⎼ Hány számjegyből állnak a számok a tömbben? Vizsgáld meg, hogy a számok hány számjegyből állnak - másképp, hogy milyen “hosszúak”! Pl. a tömb első eleme, a 34808 5 számjegyből áll, azaz 5 “hosszú”, úgymond.
//        ⎼ Mennyi a legkisebb és a legnagyobb “hosszúság”?

    }
}
