import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question7 {
    public static void main(String[] args) {
        String str = "Java Learning !";
        Map<Character, Integer> map = new HashMap<>();
        char[] strArr = str.toCharArray();
        for (char c : strArr) {
            if (((c == ' ') || (c == '\t'))) {
                continue;
            }
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> m : set) {
            System.out.println(m.getKey() + " times " + m.getValue());
        }
    }
}