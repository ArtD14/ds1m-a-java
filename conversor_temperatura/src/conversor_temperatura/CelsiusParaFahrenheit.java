package conversor_temperatura;

public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		
		float celsius;
		float fahrenheit;
		
		celsius = 25;
				
		fahrenheit = (9 * celsius + 160)/5;	
		
		System.out.print(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit");
	}
}
