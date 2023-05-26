import java.util.Scanner;

public class PrincipalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do atleta: ");
        String nomeAtleta = scanner.next();

        Triatleta testeTriatleta = new Triatleta(nomeAtleta);

        System.out.print("Agora informe o endereço do atleta: ");
        String endereco = scanner.next();

        testeTriatleta.setEndereco(endereco);

        testeTriatleta.aquecer();
        testeTriatleta.correr();
        testeTriatleta.nadar();
        testeTriatleta.correrDeBicicleta();

    }
}
