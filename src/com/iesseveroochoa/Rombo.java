package com.iesseveroochoa;

class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;

    Rombo(double minor, double maior) {
        diagonalMenor = minor;
        diagonalMayor = maior;
    }

    double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
}
