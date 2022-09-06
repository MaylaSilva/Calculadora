import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        initialize();

        ToFahrenheit transformToFahrenheit = new ToFahrenheit();
        ToCelsius transformToCelsius = new ToCelsius();
        ToKelvin transformToKelvin = new ToKelvin();
        Scanner input = new Scanner(System.in);
        int quantidade=0;
        double[] vetorInput;
        String keep;

        do {
            double media = 0;
            double media2 = 0;
            double resultado;
            boolean done = false;
            boolean number = false;

            UnityTemp unityInput = getUnityTemp("entrada: ");
            UnityTemp unityOutput = getUnityTemp("saída: ");
            System.out.println("\n----------------------------------------------------------");
            System.out.println("Você vai transformar " + unityInput + " em " + unityOutput + "");
            System.out.println("----------------------------------------------------------");
            while (!done) {
                try {
                    System.out.print("Digite a quantidade de temperaturas a serem convertidas: ");
                    quantidade = input.nextInt();
                    while (quantidade < 0){
                        System.out.println("Digite uma quantidade positiva");
                        quantidade = input.nextInt();
                    }
                    done = true;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.err.println("Você não digitou um número positivo inteiro.");
                }
            }
            System.out.println("\n");
            vetorInput = new double[(int) quantidade];

            while (!number) {
                try {
                    for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite uma temperatura: ");
                vetorInput[i] = input.nextDouble();
                number = true;
                    }
            } catch (InputMismatchException e){
                input.nextLine();
                System.err.println("Você não digitou um número.");
            }

            }
            System.out.println("\n");
            for (double printVetor : vetorInput) {
                System.out.println("As temperaturas digitadas são " + printVetor + " " + unityInput);
                media += printVetor;

            }
            System.out.println("\n------------------------RESULTADO-------------------------");
            for (double temps : vetorInput) {
                switch (unityInput) {
                    case CELSIUS:
                        resultado = transformToCelsius.transform(unityOutput, temps);

                        break;

                    case KELVIN:
                        resultado = transformToKelvin.transform(unityOutput, temps);
                        break;

                    case FAHRENHEIT:
                        resultado = transformToFahrenheit.transform(unityOutput, temps);
                        break;
                    default:
                        resultado = 0;
                }
                System.out.println("O resultado da conversão é " + resultado + " " + unityOutput);
                media2 += resultado;

            }
            media /= quantidade;
            media2 /= quantidade;
            System.out.println("\n--------------------------MÉDIA---------------------------");
            System.out.println("\nA média da(s) " + quantidade + " temperatura(s) é(são): \n" + unityInput + " " + media
                    + " \n" + unityOutput + " " + media2);

            System.out.println("Deseja continuar com o programa? (S/N) ");
            String again = input.next();
            keep = again.toUpperCase();
            
        } while (!keep.equals("N"));
        System.out.println("Obrigada por utilizar a calculadora.");
    }

    private static UnityTemp getUnityTemp(String nomeQualquerDeVariavel) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite a unidade de temperatura de " + nomeQualquerDeVariavel);
        String typeString = input.nextLine();
        try {
            return UnityTemp.valueOf(typeString.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("Você digitou uma unidade inválida. Tente novamente.");
            return getUnityTemp(nomeQualquerDeVariavel);
        }

    }

    private static void initialize() {

        System.out.println("+--------------------------------------------------------+");
        System.out.println("|     Bem vindo ao nosso conversor de temperaturas.      |");
        System.out.println("|     Esta calculadora tem as seguintes medidas:         |");
        System.out.println("|         *Celsius                                       |");
        System.out.println("|         *Fahrenheit                                    |");
        System.out.println("|         *Kelvin                                        |");
        System.out.println("+--------------------------------------------------------+\n");
    }

}

// fazer tratamento de erro e formatar pra ficar bonito
