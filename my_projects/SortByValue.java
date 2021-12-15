package my_projects;


import java.util.Map;  
import java.util.HashMap;
import java.util.TreeMap;

class SortByValue {
 
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();
 
    // Function to sort map by Key
    public static void sortbykey()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted
            = new TreeMap<>(map);
 
        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry :
             sorted.entrySet())
      
        	 System.out.println("" + entry.getKey()
             + "="
             + entry.getValue());
        	
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("java", 1);
        map.put("abc", 2);
        map.put("byte", 3);
        map.put("python", 6);
        map.put("ruby", 9);
        map.put("c", 2);
 
        // Calling the function to sortbyKey
        sortbykey();
    }
}