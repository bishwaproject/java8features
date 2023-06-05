package java8features.lamdaExpression;



public class Main {
    public static void main(String[] args) {
        String str = "John";
        FunctionInterface fi = ()->"hello " + str;
        System.out.println(fi.printMessage());
        

    }

    
}
