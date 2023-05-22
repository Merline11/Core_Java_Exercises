package uk.axone.devintest.solutionthree;

import java.util.*;

public class UFOSurvey {

    private Map<Integer, Set<String>>  alienSightings = new TreeMap<>();;

    public UFOSurvey(){
        alienSightings.put(52,new HashSet<>(Arrays.asList("Azure", "Lime", "Purple")));
        alienSightings.put(49,new HashSet<>(Arrays.asList("HoneyDew", "Ash", "Red")));
        alienSightings.put(48,new HashSet<>(Arrays.asList("Coral")));
        alienSightings.put(51,new HashSet<>(Arrays.asList("Purple", "Navy", "Teal", "Coral")));
        alienSightings.put(50,new HashSet<>(Arrays.asList("Red", "Indigo")));
    }

    public Map<Integer, Set<String>> getAlienSightings() {
        return alienSightings;
    }

    public void setAlienSightings(Map<Integer, Set<String>> alienSightings) {
        this.alienSightings = alienSightings;
    }

    public String addSighting(int areaCode, Set<String> colour){
        String mapChange;
        if(!this.alienSightings.containsKey(areaCode)){
            this.alienSightings.put(areaCode,colour);
            mapChange = "true";
        } else {
           this.alienSightings.get(areaCode).addAll(colour);
            mapChange = "false";
        }
        return mapChange;
    }

    public Set<Integer> findAreasForColour(String colour) {
        Set<Integer> area = new HashSet<>();
        for(Map.Entry<Integer,Set<String>> alienSightingsMap : alienSightings.entrySet()){
            if (alienSightingsMap.getValue().contains(colour)) {
                area.add(alienSightingsMap.getKey());
            }
        }
        return area;
    }
}
