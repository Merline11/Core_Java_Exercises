package uk.axone.devintest.accessmodifiers.pack2;

import uk.axone.devintest.accessmodifiers.pack1.AccessModifiers;

public class AccessModifiersTest {

    // Scenario 3 : Different Package with unrelated class
    // only public field
    void testAccess() {
        AccessModifiers test = new AccessModifiers();
        test.publicMethod();
        test.publicField=10;
    }
}
