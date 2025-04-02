import java.time.LocalDate;
import java.util.Scanner;

public class Atividades_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho máximo da pilha:");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        PilhaRecordes pilha = new PilhaRecordes(tamanho);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Inserir novo recorde");
            System.out.println("2. Consultar recorde do topo");
            System.out.println("3. Remover recorde do topo");
            System.out.println("4. Listar todos os recordes");
            System.out.println("5. Sair");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite a data do recorde (yyyy-mm-dd): ");
                    String dataStr = scanner.nextLine();
                    LocalDate data = LocalDate.parse(dataStr);

                    System.out.print("Digite o tempo do recorde: ");
                    double tempo = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite o nome do atleta: ");
                    String nome = scanner.nextLine();

                    Recorde recorde = new Recorde(data, tempo, nome);
                    pilha.inserir(recorde);
                    break;

                case 2:
                    T topo = pilha.topo();
                    if (topo != null) {
                        System.out.println("Recorde no topo: " + topo);
                    }
                    break;

                case 3:
                    pilha.removerTopo();
                    break;

                case 4:
                    pilha.listarRecordes();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
