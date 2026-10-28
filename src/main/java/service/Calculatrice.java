package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @Override
    public int somme(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                    "Division par zéro impossible"
            );
        }

        return a / b;
    }
}

