package miniCalculator;

public class Calculator {
    public static void main(String[] args) {
        var toplam = new toplama();
        int netice1 = toplam.sum(8, 11);
        System.out.println(netice1);


        var cixilma = new cixma();
        int netice2 = cixilma.cix(9, 2);
        System.out.println(netice2);

        var vur = new vurma();
        int netice3 = vur.multiplaction(7,9);
        System.out.println(netice3);

        var bolme1 = new bolme();
        int netice4 = bolme1.bol(56, 8);
        System.out.println(netice4);
    }
}
