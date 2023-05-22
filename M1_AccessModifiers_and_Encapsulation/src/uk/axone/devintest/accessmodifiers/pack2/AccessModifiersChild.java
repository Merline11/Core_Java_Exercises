package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {

    // Scenario 2 : Different Package with subclass
    // only public and protected field
    void testAccess(){
        publicMethod();
        protectedMethod();

        publicField=10;
        protectedField=20;
    }
}
