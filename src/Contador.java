import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parameterOne = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parameterTwo = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            count(parameterOne, parameterTwo);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }
    static void count(int parameterOne, int parameterTwo ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parameterOne > parameterTwo) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parameterTwo - parameterOne;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i=0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}