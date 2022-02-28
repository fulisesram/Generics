package Generic2;

public class Generic {

    public static void main(String[] args) {

    OperationsImpl impl = new OperationsImpl();
    
    int sum = impl.sum(10,5);
    int res = impl.res(10,5);
    String name = impl.name(1,"Fabian");

        System.out.println("sum = " + sum);
        System.out.println("res = " + res);
        System.out.println("name = " + name);
    
    }
}