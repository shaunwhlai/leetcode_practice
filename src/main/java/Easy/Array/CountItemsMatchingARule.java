package Easy.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 1773. Count Items Matching a Rule
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 * <p>
 * The ith item is said to match the rule if one of the following is true:
 * <p>
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 * <p>
 * Example 1:
 * <p>
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 * Example 2:
 * <p>
 * Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
 * Output: 2
 * Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 **/
public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        List<String> prop = new ArrayList<String>();
        List<String> prop2 = new ArrayList<String>();
        List<String> prop3 = new ArrayList<String>();
        prop.add("phone");
        prop.add("blue");
        prop.add("pixel");
        items.add(prop);
        prop2.add("computer");
        prop2.add("silver");
        prop2.add("lenovo");
        items.add(prop2);
        prop3.add("phone");
        prop3.add("gold");
        prop3.add("iphone");
        items.add(prop3);
        for (List<String> item : items) {
            System.out.println(item.get(1));
//            System.out.println(item.get(1));
//            System.out.println(item.get(2));
        }
//        System.out.println("items"+items);
        System.out.println(countMatches(items,"type","phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;

        int i = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(i).equals(ruleValue)) {
                counter++;
            }else if(ruleKey.equals("color") && item.get(i).equals(ruleValue)){
                counter++;
            }else if(ruleKey.equals("name") && item.get(i).equals(ruleValue)){
                counter++;
            }
        }

        return counter;
    }
}
