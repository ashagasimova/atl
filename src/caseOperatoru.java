import java.util.Scanner;

public class caseOperatoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ay daxil edin: ");
        String ay = scanner.next();
        switch (ay){
            case "Yanvar":
                System.out.println("Qish fesli");
                break;
            case "Fevral":
                System.out.println("Qish fesli");
                break;
            case "Mart":
                System.out.println("Yaz fesli");
                break;
            case "Aprel":
                System.out.println("Yaz fesli");
                break;
            case "May":
                System.out.println("Yaz fesli");
                break;
            case "Iyun":
                System.out.println("Yay fesli");
                break;
            case "Iyul":
                System.out.println("Yay fesli");
                break;
            case "Avqust":
                System.out.println("Yay fesli");
                break;
            case "Sentyabr":
                System.out.println("Payiz fesli");
                break;
            case "Oktyabr":
                System.out.println("Payiz fesli");
                break;
            case "Noyabr":
                System.out.println("payiz fesli");
                break;
            case "Dekabr":
                System.out.println("Qish fesli");
                break;
            default:
                System.out.println("Ayi duzgun daxil edin!");
                break;

        }
    }
}
