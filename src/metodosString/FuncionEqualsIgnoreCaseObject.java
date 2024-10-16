package metodosString;

public class FuncionEqualsIgnoreCaseObject {
    public static void main(String[] args) {
        String te1= "HOLA"; //compara ignorando mayusculas y minusculas
        String te2= "hola";
        if(te1.equalsIgnoreCase(te2))
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");

    }
}
