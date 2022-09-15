package Generic.OOP07;

import Generic.OOP06.used.GenericPrinter;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        powderGenericPrinter.setMaterial(new Powder());

        Powder powder = powderGenericPrinter.getMaterial();
        // 형변환 X

        System.out.println(powderGenericPrinter);


//        ----

        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        plasticGenericPrinter.setMaterial(new Plastic());

        Plastic plastic = plasticGenericPrinter.getMaterial();
        // 형변환 X

        System.out.println(plasticGenericPrinter);

//        ----

        // 강제 형변환의 예
       /* GenericPrinter powderPrinter2 = new GenericPrinter();
        powderPrinter2.setMaterial(new Powder());
        Powder powder1 = (Powder)powderPrinter2.getMaterial();
        System.out.println(powderPrinter2);*/

    }


}
