import java.util.ArrayList;
import java.util.List;

public class PilhaRecordes {
    private List<Recorde> pilha;
    private int tamanho;

    public PilhaRecordes(int tamanho) {
        this.pilha = new ArrayList<>();
        this.tamanho = tamanho;
    }

    public void inserir(Recorde recorde) {
        if (pilha.isEmpty() || recorde.getTempo() < pilha.get(pilha.size() - 1).getTempo()) {
            if (pilha.size() == tamanho) {
                pilha.remove(0); // Remove o primeiro elemento para manter o tamanho da pilha
            }
            pilha.add(recorde);
            System.out.println("Recorde inserido!");
        } else {
            System.out.println("Novo recorde não foi inserido, pois o tempo é maior que o recorde atual.");
        }
    }

    public Recorde topo() {
        if (!pilha.isEmpty()) {
            return pilha.get(pilha.size() - 1);
        } else {
            System.out.println("Pilha vazia!");
            return null;
        }
    }

    public void removerTopo() {
        if (!pilha.isEmpty()) {
            System.out.println("Removendo recorde do topo: " + pilha.get(pilha.size() - 1));
            pilha.remove(pilha.size() - 1);
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public void listarRecordes() {
        if (!pilha.isEmpty()) {
            System.out.println("Lista de recordes:");
            for (Recorde recorde : pilha) {
                System.out.println(recorde);
            }
        } else {
            System.out.println("Pilha vazia!");
        }
    }
}
