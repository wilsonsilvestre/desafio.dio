public class Contador {

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2)
            throw new ParametrosInvalidosException("O   
 segundo parâmetro deve ser maior que o primeiro");

        int quantidadeDeInteracoes = parametro2 - parametro1;

        for (int i = 1; i <= quantidadeDeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        try {
            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros devem ser números inteiros.");
        }
    }
}