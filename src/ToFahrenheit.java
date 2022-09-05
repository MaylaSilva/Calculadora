public class ToFahrenheit {
    public double transform(UnityTemp type, double printVetor){
        final double calc = 32;
        final double calc2 = 273.15;
        final double calc3 = 9/5.0;
            switch (type){
            case CELSIUS:
                return (printVetor - calc) / (calc3);
            case KELVIN:
                return (printVetor - calc) / (calc3) + calc2;
            default: 
                return printVetor;
            }
}
}

/* exercicio entregue
    public static void main(String[] args){
        double fahrenheitMin;
        double fahrenheitMax;
        final double fator1 = 9/5.0;
        final double fator2 = 32;

        Scanner temperatura = new Scanner(System.in);

        System.out.println("Digite a temperatura mínima e máxima em graus Celsius: ");

        double celsiusMin = temperatura.nextDouble();
        double celsiusMax = temperatura.nextDouble();
        
        fahrenheitMin = (celsiusMin*fator1) + fator2;
        fahrenheitMax = (celsiusMax*fator1) + fator2;

        System.out.println("A temperatura mínima em fahrenheit é: " + fahrenheitMin);
        System.out.println("A temperatura máxima em fahrenheit é: " + fahrenheitMax);
    
    }
}*/
