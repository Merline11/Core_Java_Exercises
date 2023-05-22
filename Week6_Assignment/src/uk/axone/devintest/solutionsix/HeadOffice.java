package uk.axone.devintest.solutionsix;

import java.util.*;

public class HeadOffice {

    //branches and products in alphabetical order
    private Map<String, TreeSet<Integer>> branchTable = new TreeMap<>();

    public HeadOffice(){
        this.branchTable.put("Chelsea",new TreeSet<>(Arrays.asList(23,8,77,13,23,7)));
        this.branchTable.put("Maida Vale",new TreeSet<>(Arrays.asList(76,14,11,7,11,24,8,9)));
        this.branchTable.put("Belgravia",new TreeSet<>(Arrays.asList(17,2,6,9,14,8)));
        this.branchTable.put("Knightsbridge",new TreeSet<>(Arrays.asList(31,7,9,16,32,31)));
    }
    public Map<String, TreeSet<Integer>> getBranchTable() {
        return branchTable;
    }

    public void setBranchTable(Map<String, TreeSet<Integer>> branchTable) {
        this.branchTable = branchTable;
    }

    public Set<Integer> getUniqueProductCodes(){
        Set<Integer> set = new HashSet<>();
        for (String s : branchTable.keySet()) {
            set.addAll(branchTable.get(s));
        }
       /* for(Map.Entry<String, TreeSet<Integer>> branchTableMap : branchTable.entrySet()){
            set.addAll(branchTableMap.getValue());
        }*/
        return set;
    }

    public Set getPopularProducts(){
        Set<Integer> popularProducts = new HashSet<>();
        for (Integer uniqueProductCode : getUniqueProductCodes()) {
            int count =0;
            for (String eachBranch : branchTable.keySet()) {
                if(branchTable.get(eachBranch).contains(uniqueProductCode)){
                    count++;
                }
                if(count>=3){
                    popularProducts.add(uniqueProductCode);
                }
            }
        }
        return popularProducts;
    }

    public Set getPopularProducts1(){
        Set<Integer> popularProducts = new HashSet<>();
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for(Map.Entry<String, TreeSet<Integer>> branchTableMap : branchTable.entrySet()){
            System.out.println(branchTableMap.getKey() + " - " +branchTableMap.getValue());
            for(Integer i : branchTableMap.getValue()){
                //System.out.println(i+" - "+Collections.frequency(branchTableMap.getValue(),i));
                int value = counts.get(i) == null ? 0 : counts.get(i);
                counts.put(i, value + 1);
            }
        }
        System.out.println(counts);

        for(Map.Entry<Integer, Integer> countMap : counts.entrySet()){
            if(countMap.getValue()>=3){
                popularProducts.add(countMap.getKey());
            }
        }


        return popularProducts;
    }
}
