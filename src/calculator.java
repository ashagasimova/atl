import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("numb1 daxil edin: ");
        var numb1 = scanner.nextDouble();
        System.out.print("numb2 daxil edin: ");
        var numb2 = scanner.nextDouble();
        System.out.println("Operatoru secin: toplama, cixma,vurma,bolme");
        String operator = scanner.next(); //toplama, cixma, vurma, bolme
        switch (operator){
            case "toplama":
                System.out.println("numb1+numb2= " + (numb1+numb2));
                break;
            case "cixma":
                System.out.println("numb1-numb2= " + (numb1-numb2));
                break;
            case "vurma":
                System.out.println("numb1*numb2= " + (numb1*numb2));
                break;
            case "bolme":
                System.out.println("numb1/numb2= " + (numb1/numb2));
                break;
            default:
                System.err.println("Invalid opearot");
        }
    }
}
