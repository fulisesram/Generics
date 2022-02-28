package Generic2;

public class OperationsImpl implements Operations {

    @Override
    /* al momento de hacer la implementacion tenemos que indicar el tipo
     * de OBJECTO con el que vamos a trabajar ya que la interface se
     * definio como generic y debemos indicar la wrapper class del tipo T.
     */
    public Integer sum(int val1, int val2) {
        int res = val1 +val2;
        return res;
    }

    @Override
    public Integer res(int val1, int val2) {
        int res = val1 - val2;
        return res;
    }

    @Override
    public String name(int id, String name1) {
        String name = new String(String.valueOf(id) + " " + name1);
        return name;
    }
}
