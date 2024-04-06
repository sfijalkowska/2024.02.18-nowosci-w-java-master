package pl.comarch.camp.it.java11;

public class MetodyDlaKlasyString {
    public static void main(String[] args) {
        String s = " ";

        System.out.println(s.isBlank());

        String s2 = "    ABC    ";
        System.out.println(s2.stripLeading());
        System.out.println(s2.stripTrailing());
        System.out.println(s2.strip());

        String s3 = "cos";
        System.out.println(s3.repeat(5));

        String multilineString = "Linia1\nLinia2\nLinia3\nLinia4";
        System.out.println(multilineString);
        multilineString.lines().map(l -> l + "cos").forEach(System.out::println);
    }
}
