public class TesteFuncionarios {
    public class TesteFuncionarios {
        public static void main(String[] args) {
            Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
            FuncionarioCLT f2 = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021");
            Gerente f3 = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018");
            Estagiario f4 = new Estagiario("Diego Alves", "E001", 0, "05/08/2024");

            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
            System.out.println(f4);
        }
    }

}
