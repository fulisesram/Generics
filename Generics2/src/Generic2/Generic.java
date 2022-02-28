package Generic2;

public class Generic {

    public static void main(String[] args) {

    OperationsImpl impl = new OperationsImpl();
    
        int sum = impl.sum(10,5);
        String name = impl.name(1,"Fabian");

        System.out.println("sum = " + sum);
        System.out.println("name = " + name);

        /* La interface se definio como tipo generico -> T print (T input);
        * por lo que en la Impl el metodo print recibe un input de tipo Object
        * que puede ser Integer, String, Object, etc */

        Object res = impl.res(10,5); //RESULTADO RESTA DE TIPO OBJECT
        impl.print(res);

    }
}