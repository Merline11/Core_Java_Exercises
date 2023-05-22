package uk.axone.devintest.assignments5.pasrtb;

public class ExceptionTest3 {

    static void learnExceptionHandling(){
        String str;
        try{
            str = "Hello World";
        } catch(Exception ex){
            ex.printStackTrace();
        } catch(Throwable t){
            t.printStackTrace();
        } finally {
            str = "I'm done";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        learnExceptionHandling();
    }
}
