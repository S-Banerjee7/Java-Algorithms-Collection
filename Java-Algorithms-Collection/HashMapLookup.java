import java.util.HashMap;

public class HashMapLookup {

    public static void main(String[] args) {
        HashMap<String, Integer> nums = new HashMap<>();
        
        nums.put("A", 654654);
        nums.put("B", 744325);
        nums.put("C", 254);
        nums.put("D", 256);
        
        nums.remove("C");
        
        System.out.println(nums.get("A"));
        System.out.println(nums.containsKey("B"));
        System.out.println(nums.containsValue(123));
        System.out.println(nums.size());
        System.out.println(nums);
        
        for (String key : nums.keySet()) {
            System.out.println(key + " " + nums.get(key));
        }
    }
}