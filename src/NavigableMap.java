import java.util.TreeMap;

public class NavigableMap
{
    public static void main(String[] args)
    {
        TreeMap<String, String> t = new TreeMap<String, String>();
        t.put("b","banana");
        t.put("c","cat");
        t.put("d","dog");
        t.put("a","apple");
        t.put("f","food");
        t.put("g","gun");
        System.out.println(t);
        System.out.println(t.ceilingKey("e"));
        System.out.println(t.floorKey("c"));
        System.out.println(t.ceilingKey("d"));
        System.out.println(t.higherKey("e"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());
        System.out.println(t.keySet());

    }
}
