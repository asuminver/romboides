package com.iesseveroochoa;

class Romboide {
    private double diagonalMayor;
    private double diagonalMenor;

    Romboide(double mayor, double menor) {
        diagonalMayor = mayor;
        diagonalMenor = menor;
    }

    double area() {
        return diagonalMayor * diagonalMenor;
    }
}
