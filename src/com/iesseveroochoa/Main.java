package com.iesseveroochoa;

public class Main {

    public static void main(String[] args) {
        //Campo
        Romboide campo = new Romboide(30, 20);
        System.out.print("La superficie de un campo con forma romboidal es: ");
        System.out.println(campo.area() + " m2");

        //Rombo
        double diagonalMayor = 5;
        Rombo rombo = new Rombo(diagonalMayor / 2, diagonalMayor);
        System.out.print("Área de un rombo resulta: ");
        System.out.println(rombo.area() + " cm2");


        //Mosaico
        Romboide mosaico = new Romboide(3.5, 2.5);
        System.out.print("Un mosaico con 6 teselas de ese tamaño ocupa una superfice de: ");
        System.out.println(mosaico.area() + " cm2");
    }

}
