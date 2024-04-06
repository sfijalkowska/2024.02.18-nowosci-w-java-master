package pl.comarch.camp.it.java10;

public class Var {
    public static void main(String[] args) {
        var s = cos();
        System.out.println(s);
        s = new Klasa();
    }

    public static Klasa cos() {
        return new Klasa();
    }
}
