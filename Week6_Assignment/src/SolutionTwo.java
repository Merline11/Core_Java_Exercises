import java.util.Map;
import java.util.HashMap;

public class SolutionTwo {

    public static void main(String[] args) {
        //HashMap - decending order removal
        //TreeMap - ascending order removal
        Map<String, Integer> ageMap = new HashMap<String, Integer>();
        ageMap.put("Anna", 33);
        ageMap.put("Ben", 45);
        ageMap.put("Ben", 33);
        ageMap.put("Chas", 33);
        for(Map.Entry<String, Integer> ageMapEntry : ageMap.entrySet()){
            System.out.println(ageMapEntry.getKey() +" "+ageMapEntry.getValue());
        }
        System.out.println("-------------------------------------------------");
        ageMap.keySet().remove("Anna");

        for(Map.Entry<String, Integer> ageMapEntry : ageMap.entrySet()){
            System.out.println(ageMapEntry.getKey() +" "+ageMapEntry.getValue());
        }

        System.out.println("-------------------------------------------------");
        ageMap.values().remove(33);

        for(Map.Entry<String, Integer> ageMapEntry : ageMap.entrySet()){
            System.out.println(ageMapEntry.getKey() +" "+ageMapEntry.getValue());
        }
    }
}
