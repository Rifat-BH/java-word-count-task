import java.util.HashMap;
import java.util.Scanner;

public class Task_steadfast{
    public static void main(String[] args) {
        
        Scanner scanInput = new Scanner(System.in);
        String userInput = scanInput.nextLine();
        String lowerCaseInput =  userInput.toLowerCase();
        String[] inputToArray = lowerCaseInput.split("[,;:'?!$%^&*-_+=|*-\\`~/(){}<>.#@\"\\[\\]\\s+]+");

        HashMap<String, Integer> countInput = new HashMap<>();

        for (String a : inputToArray){
            if(!countInput.containsKey(a)){
                countInput.put(a, 1);
            }
            else{
                countInput.put(a, countInput.get(a)+1);
            }
        }

        for(String i : countInput.keySet()){
            System.out.println(i + ": " + countInput.get(i));
        }
    }
}