import java.math.BigInteger;

public class pruebaBiginteger {

	//ejemplo de internet para usar biginteger con for 
	    public static BigInteger factorial(int n) {
	        BigInteger result = BigInteger.ONE;
	        for (int i = 2; i <= n; i++) {
	            result = result.multiply(BigInteger.valueOf(i));
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int number = 20;
	        BigInteger fact = factorial(number);
	        System.out.println("El factorial de " + number + " es: " + fact);
	    }
	}

