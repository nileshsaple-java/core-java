Let's explore examples of each implementation class (`ArrayList`, `LinkedList`, `HashSet`, `LinkedHashSet`, `TreeSet`, `HashMap`, `LinkedHashMap`, `TreeMap`, `ConcurrentHashMap`) and different ways to iterate over them.

### **List Implementations**

1. **`ArrayList` Example and Iteration**:
   ```java
   import java.util.*;

   public class ArrayListExample {
       public static void main(String[] args) {
           List<String> arrayList = new ArrayList<>();
           arrayList.add("Apple");
           arrayList.add("Banana");
           arrayList.add("Cherry");

           // 1. Using for loop with index
           for (int i = 0; i < arrayList.size(); i++) {
               System.out.println(arrayList.get(i));
           }

           // 2. Using enhanced for loop
           for (String fruit : arrayList) {
               System.out.println(fruit);
           }

           // 3. Using Iterator
           Iterator<String> iterator = arrayList.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }

           // 4. Using Stream API
           arrayList.stream().forEach(System.out::println);
       }
   }
   ```

2. **`LinkedList` Example and Iteration**:
   ```java
   import java.util.*;

   public class LinkedListExample {
       public static void main(String[] args) {
           List<String> linkedList = new LinkedList<>();
           linkedList.add("Apple");
           linkedList.add("Banana");
           linkedList.add("Cherry");

           // 1. Using for loop with index
           for (int i = 0; i < linkedList.size(); i++) {
               System.out.println(linkedList.get(i));
           }

           // 2. Using enhanced for loop
           for (String fruit : linkedList) {
               System.out.println(fruit);
           }

           // 3. Using Iterator
           Iterator<String> iterator = linkedList.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }

           // 4. Using Stream API
           linkedList.stream().forEach(System.out::println);
       }
   }
   ```

### **Set Implementations**

1. **`HashSet` Example and Iteration**:
   ```java
   import java.util.*;

   public class HashSetExample {
       public static void main(String[] args) {
           Set<String> hashSet = new HashSet<>();
           hashSet.add("Apple");
           hashSet.add("Banana");
           hashSet.add("Cherry");

           // 1. Using enhanced for loop
           for (String fruit : hashSet) {
               System.out.println(fruit);
           }

           // 2. Using Iterator
           Iterator<String> iterator = hashSet.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }

           // 3. Using Stream API
           hashSet.stream().forEach(System.out::println);
       }
   }
   ```

2. **`LinkedHashSet` Example and Iteration**:
   ```java
   import java.util.*;

   public class LinkedHashSetExample {
       public static void main(String[] args) {
           Set<String> linkedHashSet = new LinkedHashSet<>();
           linkedHashSet.add("Apple");
           linkedHashSet.add("Banana");
           linkedHashSet.add("Cherry");

           // 1. Using enhanced for loop
           for (String fruit : linkedHashSet) {
               System.out.println(fruit);
           }

           // 2. Using Iterator
           Iterator<String> iterator = linkedHashSet.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }

           // 3. Using Stream API
           linkedHashSet.stream().forEach(System.out::println);
       }
   }
   ```

3. **`TreeSet` Example and Iteration**:
   ```java
   import java.util.*;

   public class TreeSetExample {
       public static void main(String[] args) {
           Set<String> treeSet = new TreeSet<>();
           treeSet.add("Apple");
           treeSet.add("Banana");
           treeSet.add("Cherry");

           // 1. Using enhanced for loop
           for (String fruit : treeSet) {
               System.out.println(fruit);
           }

           // 2. Using Iterator
           Iterator<String> iterator = treeSet.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }

           // 3. Using Stream API
           treeSet.stream().forEach(System.out::println);
       }
   }
   ```

### **Map Implementations**

1. **`HashMap` Example and Iteration**:
   ```java
   import java.util.*;

   public class HashMapExample {
       public static void main(String[] args) {
           Map<String, Integer> hashMap = new HashMap<>();
           hashMap.put("Apple", 1);
           hashMap.put("Banana", 2);
           hashMap.put("Cherry", 3);

           // 1. Iterating over key-value pairs using entrySet()
           for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
           }

           // 2. Iterating over keys using keySet()
           for (String key : hashMap.keySet()) {
               System.out.println("Key: " + key);
           }

           // 3. Iterating over values using values()
           for (Integer value : hashMap.values()) {
               System.out.println("Value: " + value);
           }

           // 4. Using Stream API
           hashMap.entrySet().stream().forEach(entry -> 
               System.out.println(entry.getKey() + ": " + entry.getValue())
           );
       }
   }
   ```

2. **`LinkedHashMap` Example and Iteration**:
   ```java
   import java.util.*;

   public class LinkedHashMapExample {
       public static void main(String[] args) {
           Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
           linkedHashMap.put("Apple", 1);
           linkedHashMap.put("Banana", 2);
           linkedHashMap.put("Cherry", 3);

           // 1. Iterating over key-value pairs using entrySet()
           for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
           }

           // 2. Iterating over keys using keySet()
           for (String key : linkedHashMap.keySet()) {
               System.out.println("Key: " + key);
           }

           // 3. Iterating over values using values()
           for (Integer value : linkedHashMap.values()) {
               System.out.println("Value: " + value);
           }

           // 4. Using Stream API
           linkedHashMap.entrySet().stream().forEach(entry -> 
               System.out.println(entry.getKey() + ": " + entry.getValue())
           );
       }
   }
   ```

3. **`TreeMap` Example and Iteration**:
   ```java
   import java.util.*;

   public class TreeMapExample {
       public static void main(String[] args) {
           Map<String, Integer> treeMap = new TreeMap<>();
           treeMap.put("Apple", 1);
           treeMap.put("Banana", 2);
           treeMap.put("Cherry", 3);

           // 1. Iterating over key-value pairs using entrySet()
           for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
           }

           // 2. Iterating over keys using keySet()
           for (String key : treeMap.keySet()) {
               System.out.println("Key: " + key);
           }

           // 3. Iterating over values using values()
           for (Integer value : treeMap.values()) {
               System.out.println("Value: " + value);
           }

           // 4. Using Stream API
           treeMap.entrySet().stream().forEach(entry -> 
               System.out.println(entry.getKey() + ": " + entry.getValue())
           );
       }
   }
   ```

4. **`ConcurrentHashMap` Example and Iteration**:
   ```java
   import java.util.*;
   import java.util.concurrent.ConcurrentHashMap;

   public class ConcurrentHashMapExample {
       public static void main(String[] args) {
           Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
           concurrentHashMap.put("Apple", 1);
           concurrentHashMap.put("Banana", 2);
           concurrentHashMap.put("Cherry", 3);

           // 1. Iterating over key-value pairs using entrySet()
           for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
               System.out.println(entry.getKey() + ": " + entry.getValue());
           }

           // 2. Iterating over keys using keySet()
           for (String key : concurrentHashMap.keySet()) {
               System.out.println("Key: " + key);
           }

           // 3. Iterating over values using values()
           for (Integer value : concurrentHashMap.values()) {
               System.out.println("Value: " + value);
           }

           // 4. Using Stream API
           concurrentHashMap.entrySet().stream().forEach(entry -> 
               System.out.println(entry.getKey() + ": " + entry.getValue())
           );
       }
   }
   ```

### Iteration Methods Used:

1. **For Loop with Index**: Only applicable

to `List` since `Set` and `Map` do not support direct index-based access.
2. **Enhanced For Loop**: Used for both `List`, `Set`, and `Map` (iterating over keys, values, or entries).
3. **Iterator**: Works for both `List`, `Set`, and `Map`.
4. **Stream API**: Works for both `List`, `Set`, and `Map` as well.

Each iteration method is useful depending on the type of collection and what you intend to do with the elements.