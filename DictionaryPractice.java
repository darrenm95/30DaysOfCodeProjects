
package dictionarypractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // Create English to Spanish Dictionary
        Map<String, String> engSpanDictionary = new HashMap<String, String>();
        
        // Enter keys and values
        engSpanDictionary.put("Monday", "Lunes");
        engSpanDictionary.put("Tuesday", "Miercoles");
        engSpanDictionary.put("Wednesday", "Lunes");
        engSpanDictionary.put("Thursday", "Jueves");
        engSpanDictionary.put("Friday", "Viernes");
        engSpanDictionary.put("Saturday", "Sabado");
        engSpanDictionary.put("Sunday", "Domingo");
        
        // Retrieve things from our dictionary
        System.out.println(engSpanDictionary.get("Monday"));
        System.out.println(engSpanDictionary.get("Tuesday"));
        System.out.println(engSpanDictionary.get("Wednesday"));
        System.out.println(engSpanDictionary.get("Thursday"));
        System.out.println(engSpanDictionary.get("Friday"));
        
        // Print out all keys
        System.out.println(engSpanDictionary.keySet());
        // Print out all values
        System.out.println(engSpanDictionary.values());
        // Print out size
        System.out.println("The size of our dictionary is: " + engSpanDictionary.size());
        
        System.out.println();
        System.out.println();
        
        // Shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Mushrooms", false);
        shoppingList.put("Milk", true);
        shoppingList.put("Cheese", true);
        shoppingList.put("Celery", false);
        shoppingList.put("Cucumber", false);
        shoppingList.put("Sugar", Boolean.FALSE);
        shoppingList.put("Eggs", Boolean.TRUE);
        
        // Retrieve items
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Celery"));
        // Key-Value pairs print out
        System.out.println("These are my key-value pairs: " +shoppingList.toString());
        // Is empty?
        System.out.println(shoppingList.isEmpty());
        System.out.println("These are just my keys: " +shoppingList.keySet());
        System.out.println("These are just my values: " +shoppingList.values());
        System.out.println("...and this is the size of my dictionary: " +shoppingList.size());
        // Clear our dictionary
        // shoppingList.clear();
        // Is empty?
        // System.out.println(shoppingList.isEmpty());
        // System.out.println(shoppingList.toString());
        // What does it actually mean to clear the dictionary? Does it mean to
        // get rid of everything inside it? Well, no. What it means is that you
        // remove the pointer from your original dictionary and set it to point 
        // to an empty dictionary.
        
        // Remove items
        shoppingList.remove("Eggs");
        // Replace values for a particular key
        shoppingList.replace("Milk", Boolean.FALSE);
        
        // Print out key-value pairs
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.entrySet());
    }
    
}
