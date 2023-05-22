package uk.axone.devintest.accessmodifiers.pack1;

public class AccessModifiersTest {

    public static void main(String[] args) {
        AccessModifiers test = new AccessModifiers();

        // Scenario 1 : Different class + same package
        test.publicField=10;
        test.protectedField=20;
        test.defaultField=30;

        test.publicMethod();
        test.protectedMethod();
        test.defaultMethod();

    }


}
