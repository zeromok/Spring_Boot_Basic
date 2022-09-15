package Generic.OOP06.used;

import Generic.OOP06.unused.Plastic;
import Generic.OOP06.unused.Powder;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(new Powder());
        Powder p = powderPrinter.getMaterial();

        System.out.println(powderPrinter);
        System.out.println(p);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);

    }
}
