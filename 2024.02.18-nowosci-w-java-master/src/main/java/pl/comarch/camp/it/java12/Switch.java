package pl.comarch.camp.it.java12;

public class Switch {
    public static void main(String[] args) {
        int i = 9;
        /*switch (i) {
            case 1:
            case 2:
                System.out.println("1 albo 2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("cos innego !!");
        }*/

        switch (i) {
            case 1,2 -> System.out.println("1 albo 2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            default -> {
                System.out.println("cos innego !!");
                System.out.println("robie jeszcze cos !!");
                System.out.println("jeszcze coś innego !!");
            }
        }

        int miesiac = 10;
        /*String miesiacS;
        switch(miesiac) {
            case 1:
                miesiacS = "styczen";
            case 2:
                miesiacS = "luty";
            case 3:
                miesiacS = "marzec";
            case 4:
                miesiacS = "kwiecien";
        }*/
        System.out.println(switch(miesiac) {
            case 1 -> "styczen";
            case 2 -> "luty";
            case 3 -> "marzec";
            case 4 -> "kwiecien";
            case 5 -> "maj";
            default -> "niepoprawny numer miesiaca";
        });

        switch (4) {
            case 3:
                //cos sie dzieje
            case 4:
                //cos innego sie dzieje
                break;
            case 5:
                //???
                break;
        }

        switch (3) {
            case 3 -> {
                //cos sie dzieje
                //cos innego sie dzieje
                System.out.println();
            }
            case 4 -> System.out.println(); //cos innego sie dzieje
            case 5 -> System.out.println(); //???
        }
    }
}
