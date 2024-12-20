import java.util.Scanner;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double value;
        int option;

        do {
            System.out.println("(------------ MENU ------------)");
            System.out.println("1. Cadastrar novo gasto");
            System.out.println("2. Listar todos os gastos");
            System.out.println("3. Calcular total dos gastos");
            System.out.println("4. Filtrar gastos acima de um valor");
            System.out.println("5. Sair");

            option = scanner.nextInt();

            ArrayList<String> nameArray = new ArrayList<String>();
            ArrayList<Double> valueArray = new ArrayList<Double>();

            switch (option){
                case 1:
                    System.out.println("Digite o nome do gasto:");
                    name = scanner.next();
                    nameArray.add(name);
                    System.out.println("Digite o valor do gasto:");
                    value = scanner.nextDouble();
                    valueArray.add(value);
                    break;
            }
        }
    }
}
