public class ToCelsius {
        public double transform(UnityTemp type, double printVetor){
            final double calc = 32;
            final double calc2 = 273.15;
            final double calc3 = 9/5.0;

            if(type == UnityTemp.FAHRENHEIT){
                return (printVetor * calc3) + calc;
            }
            else if(type == UnityTemp.KELVIN){
                return printVetor + calc2;
            } else {
                return printVetor;
            }
            }
}
