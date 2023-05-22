package uk.axone.devintest.solutionFour;

import java.util.*;

public class DistrictCrime {

    private Map<String, TreeSet<Integer>> crimeTable = new TreeMap<>();

    public DistrictCrime(){
        this.crimeTable.put("Little Newark",new TreeSet<>(Arrays.asList(8,77,93)));
        this.crimeTable.put("Springfield Heights",new TreeSet<>(Arrays.asList(8,14,15,31,33,47,77)));
        this.crimeTable.put("Squidport",new TreeSet<>(Arrays.asList(5,8,14,27,31,47,93)));
        this.crimeTable.put("Waterfront",new TreeSet<>(Arrays.asList(2)));
    }
    public Map<String, TreeSet<Integer>> getCrimeTable() {
        return crimeTable;
    }

    public void setCrimeTable(Map<String, TreeSet<Integer>> crimeTable) {
        this.crimeTable = crimeTable;
    }

    /**
     * Returns a list containing every crime code in the collection object referenced by crimeTable
     * Condition : 1. not need to be sorted and
     *             2. duplicate code numbers must not be removed.
     */
    public List crimeList(){
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<String, TreeSet<Integer>> crimeTableMap : getCrimeTable().entrySet()){
            list.addAll(crimeTableMap.getValue());
        }
        return list;
    }

    /**
     * Returns the set containing only those crime codes that have been reported for one district and no other.
     */

    public Set highlyLocalisedCrimeTypes(){
        Set<Integer> set = new HashSet<>();
        for(Object i : crimeList()){
            System.out.println(i +": "+Collections.frequency(crimeList(),i));
            int value = Collections.frequency(crimeList(),i);
            if(value==1){
                set.add((Integer) i);
            }
        }
        return set; //15, 33, 5, 27 and 2.
    }

    public List crimeList1(){
        Set<Integer> set = new LinkedHashSet<>(); //duplicates removed
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<String, TreeSet<Integer>> crimeTableMap : crimeTable.entrySet()){
            set.addAll(crimeTableMap.getValue());
        }
        list.addAll(set);
        return list;
    }

    public List crimeList2(){ //duplicates removed without linked hashset
        List<HashSet<Integer>> list = new ArrayList<>();
        for(Map.Entry<String, TreeSet<Integer>> crimeTableMap : crimeTable.entrySet()){
            if(!list.contains(crimeTableMap.getValue())){
               // list.add(crimeTableMap.getValue());
            }
        }
        return list;
    }
}
