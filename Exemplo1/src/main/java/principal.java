public class principal {
    public static void main (String[] args) {
        Banco b1 = new Banco ("Pedro", "000", 15);
        Banco b2 = new Banco ();
        Banco b3 = new Banco ("Pedro", "000000", 67);

        System.out.println(b3.getNome());
        b3.setNome("Joaquim");
        System.out.println(b3.getNome());

    }
}
