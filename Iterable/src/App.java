import java.util.*;

public class App {
    public static void main(String[] args) {

        UrlLibrary urlLibrary = new UrlLibrary();

        for (String html: urlLibrary){
            System.out.println(html.length());
            //System.out.println(html);

        }

    }



///////////LISTS/////////////////
    // Store lists of objects
    // Duplicates are allowed
    // Elements are indexed via an integer
    // cr. shopping lists
    // Checking for particular item in list is slow//
    // Looking an item up by index is fast
    // Iterating through lists is relatively fast
    // Note: you can sort lists if you want to.

    // If you only add or remove items at end of list, use ArrayList.
    List<String> list1 = new ArrayList<String>();

    // Removing or adding items elsewhere in the list?
    List<String> list2 = new LinkedList<String>();


//////////////////////SETS////////////////////
    // Only store unique values
    // Great for removing duplicates
    // Not indexed, unlike lists
    // Very fast to check if a particular object exists
    // If you want to use your own objects, you must implement hashCode() and equals()
    // Order is unimportant in OD if it changes?
    // HashSet is not ordered.
    Set<String> set1 = new HashSet<String >();

    // Sorted in natural order? Use TeeSet
    // (123... abc... etc)
    Set<String> set2 = new TreeSet<String>();

    // Elements remain in order they are added
    Set<String> set3 = new LinkedHashSet<String>();

/////////////////////MAPS///////////////////
    // Key value pairs
    // Like lookup tables
    // Retrieving a value by key is fast
    // Iterating over map values is very slow.
    // Maps are not optimized for iteration
    // If you want to use your own objects as keys, you must implement hashCode() and equals()/

    // Keys not in any particular order, and order liable to change.
    Map<String, String> map1 = new HashMap<String, String>();

    // Keys sorted in natural order
    Map<String, String> map2 = new TreeMap<String, String>();

    // Keys remain in order added
    Map<String, String> map3 = new LinkedHashMap<String, String>();

    // There are also SortedSet and SortedMap interfaces.

    //todo: add all the maps and finish the problems
}
