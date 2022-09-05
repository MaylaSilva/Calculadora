public class ToKelvin {
    public double transform(UnityTemp type, double printVetor){
        final double calc = 32;
        final double calc2 = 273.15;
        final double calc3 = 9/5.0;
        if(type == UnityTemp.FAHRENHEIT){
            return (printVetor - calc2) * (calc3) + calc;
        }
            else if(type == UnityTemp.CELSIUS){
            return printVetor - calc2;
        }   else {
            return printVetor;
        }
    }
}
