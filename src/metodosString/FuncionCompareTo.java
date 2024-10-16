package metodosString;

public class FuncionCompareTo {

    public static void main(String[] args) {
        String a="gato", b="perro", c="GATO";
        int z=a.compareTo(b);
        int p=b.compareTo(a);
        int q=a.compareToIgnoreCase(c);
        if(a.compareToIgnoreCase(b) == 0)
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");




    }
}
