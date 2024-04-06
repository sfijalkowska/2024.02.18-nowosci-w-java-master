package pl.comarch.camp.it.java9;

public interface MetodyPrywatne {
    void add(int a, int b);

    default void diff(int a, int b) {
        algorytm(a);
        algorytm(b);
        metoda2();
    }

    private void algorytm(int x) {
        //wykonuje algorytm dla liczby x - 50 linijek
        System.out.println(x);
    }

    private void metoda2() {
        //????
    }
}
