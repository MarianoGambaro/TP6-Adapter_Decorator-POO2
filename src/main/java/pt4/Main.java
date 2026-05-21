package pt4;

public class Main {
    static void main() {

//        //combo familiar
//        Combo comboFamiliar = new Familiar("Sorrentinos", 10000);
//        comboFamiliar = new ConCarne(comboFamiliar);
//        comboFamiliar = new ConQueso(comboFamiliar);
//
//        System.out.println(comboFamiliar.descripcion());
//        System.out.println("Total: $" + comboFamiliar.calcularTotal());
//
//        //combo especial
//        Combo especial = new Especial("Hamburguesas", 12000);
//        especial = new ConQueso(especial);
//        especial = new ConCarne(especial);
//        especial = new ConPapas(especial);
//        especial = new ConTomate(especial);
//
//        System.out.println(especial.descripcion());
//        System.out.println("Total: $" + especial.calcularTotal());


        //con builder

        //familiar
        Combo comboFamiliar = new Familiar("Sorrentinos", 10000);
        ComboBuilder cbF = new ComboBuilder(comboFamiliar).conQueso().conCarne();

        System.out.println(cbF.build().descripcion());
        System.out.println(cbF.build().calcularTotal());

        //especial
        Combo especial = new Especial("Hamburguesas", 12000);
        ComboBuilder cbE = new ComboBuilder(especial).conCarne().conTomate().conPapas().conQueso();

        System.out.println(cbE.build().descripcion());
        System.out.println(cbE.build().calcularTotal());

    }

}
