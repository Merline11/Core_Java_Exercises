package uk.axone.devintest.solutionsix;

public class HeadOfficeDemo {

    public static void main(String[] args) {
        HeadOffice headOffice = new HeadOffice();
        System.out.println(headOffice.getBranchTable());

        System.out.println(headOffice.getUniqueProductCodes());

        System.out.println(headOffice.getPopularProducts());
    }
}
