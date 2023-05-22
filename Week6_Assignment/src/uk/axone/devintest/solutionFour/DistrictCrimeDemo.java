package uk.axone.devintest.solutionFour;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DistrictCrimeDemo {

    public static void main(String[] args) {
        DistrictCrime districtCrime = new DistrictCrime();
        System.out.println(districtCrime.getCrimeTable());

        System.out.println(districtCrime.crimeList());
        //System.out.println(districtCrime.crimeList1());
        //System.out.println(districtCrime.crimeList2());

        System.out.println(districtCrime.highlyLocalisedCrimeTypes());
    }
}
