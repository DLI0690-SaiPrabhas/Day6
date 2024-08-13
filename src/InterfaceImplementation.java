public class InterfaceImplementation implements FunctionalInterfaceExample {

    public int Sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample f=new FunctionalInterfaceExample() {


            @Override
            public int Sum(int a, int b) {

                return a+b;
            }
        };
             System.out.println("Sum of two numbers using Functional Interface:"+f.Sum(2,4));
    }


}






