package pl.comarch.camp.it.java9;

public class X implements MetodyPrywatne {

    @Override
    public void add(int a, int b) {

    }

    @Override
    public void diff(int a, int b) {
        MetodyPrywatne.super.diff(a, b);
    }
}
