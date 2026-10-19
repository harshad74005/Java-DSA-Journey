package Integers;

import java.util.Arrays;


public class ConverttheTemperature {
	static double[] convertTemperatures(double celcius)
	{
		double kelvin = celcius+273.15;
		double fahrenheit=celcius* 1.80 + 32.00;
		return new double[] {kelvin,fahrenheit};
	}
public static void main(String[] args) {
	double celcius=36.50;
	double[] temp = convertTemperatures(celcius);
	System.out.println("Result : "+Arrays.toString(temp));
}
}

//leetcode quetion no 2469