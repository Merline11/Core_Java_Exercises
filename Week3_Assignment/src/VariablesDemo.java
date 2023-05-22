public class VariablesDemo {

    int instanceVariable =10;
    static int staticVariable=20;

    /*Static Method  cannot access directly instance variable and instance method.[need object to refer instance variables and instance methods]
                     can access static variables and static method
                        [by classname.staticvariable and classname.staticmethod()] (advisible) or
                        [by objectoftheclass.staticvariable and objectoftheclass.staticmethod]
    Instance Method  can access static variables and static method directly
			         can access instance variables and instance method directly*/

    public void instanceMethod(){
        System.out.println(instanceVariable);
        System.out.println(staticVariable);

        instanceMethod();
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println(staticVariable);
       // System.out.println(instanceVariable); call by obj

       staticMethod();
       // instanceMethod(); call by obj
    }
}
