import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro do Livro ===");

        System.out.print("Digite o título do livro: ");
        String tituloLivro = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();

        System.out.print("Digite o preço do livro: ");
        double precoLivro = scanner.nextDouble();

        scanner.nextLine(); 

        Livro livro = new Livro(
                tituloLivro,
                autorLivro,
                precoLivro
        );

        System.out.println("\n=== Cadastro do CD ===");

        System.out.print("Digite o título do CD: ");
        String tituloCD = scanner.nextLine();

        System.out.print("Digite o artista do CD: ");
        String artistaCD = scanner.nextLine();

        System.out.print("Digite o preço do CD: ");
        double precoCD = scanner.nextDouble();

        CD cd = new CD(
                tituloCD,
                artistaCD,
                precoCD
        );
        
        System.out.println("\n=== Informações do CD cadastrado ===");
        System.out.println("Título: " + cd.getTitulo());
        System.out.println("Artista: " + cd.getArtista());
        System.out.println("Preço: R$ " + cd.getPreco());

        scanner.close();
    }
}