import java.util.*;

public class hhhhhhhhhhh {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        Collections.sort(fruits);
        for (String str : fruits) {
            System.out.println(str);
        }
        System.out.println("HashMap example: ");
        HashMap<Integer,String> hMap=new HashMap<>();
        hMap.put(101,"Cricket");
        hMap.put(105,"Hockey");
        hMap.put(111,"Basketball");
        hMap.put(111,"Karate"); //adding element with duplicate key

        System.out.println("HashMap elements: ");
        for(
                Map.Entry mEntry : hMap.entrySet()){
            System.out.print("key: "+ mEntry.getKey() + " & Value: ");
            System.out.println(mEntry.getValue());
        }
        System.out.println("HashMap example2: ");
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        /* Display content using Iterator*/
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        /* Get values based on key*/
        String var= hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }


    }

}
