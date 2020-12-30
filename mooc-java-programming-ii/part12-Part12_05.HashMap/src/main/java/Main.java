
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Main {
    public static void main(String[] args){
    ArrayList<String> myList = new ArrayList<>();
HashMap<String, String> hashMap = new HashMap<>();

for (int i = 0; i < 1000; i++) {
    myList.add("" + i);
    hashMap.add("" + i, "" + i);
}

ArrayList<String> elements = new ArrayList<>();
Random randomizer = new Random();
for (int i = 0; i < 1000; i++) {
    elements.add("" + randomizer.nextInt(2000000));
}

long listSearchStartTime = System.nanoTime();
for (int i = 0; i < elements.size(); i++) {
    myList.contains(elements.get(i));
}
long listSearchEndTime = System.nanoTime();

long hashMapSearchStartTime = System.nanoTime();
for (int i = 0; i < elements.size(); i++) {
    hashMap.get(elements.get(i));
}
long hashMapSearchEndTime = System.nanoTime();


long listSearch = listSearchEndTime - listSearchStartTime;
System.out.println("List: the search took about " + listSearch / 1000000 + " milliseconds (" +
    listSearch + " nanoseconds.)");

long hashMapSearch = hashMapSearchEndTime - hashMapSearchStartTime;
System.out.println("Hash map: the search took about " + hashMapSearch / 1000000 +
    " milliseconds (" + hashMapSearch + " nanoseconds.)");
}
}
