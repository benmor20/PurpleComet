package Programs;

import java.util.Scanner;

public class SinCosTan {

	public static void main(String[] args) {
		double[] array;	
		double angle = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in your angle or radian (type in pi for pi)");
		String angle_or_radian = sc.next();
		int exists = angle_or_radian.indexOf("pi");
		if(exists == -1) { //Goes to angles
			angle = Integer.parseInt(angle_or_radian);
		}
		else { //Goes to radians
			
		}
		
		if(angle == -1) {
			System.out.println("Please put in a valid angle");
		}
		if(angle < 0) {
			while(angle < 0) {
				angle = angle + 360;
			}
		}
		else {
			System.out.println("Sin =" + sin(angle));
			System.out.println("Cos =" + cos(angle));
			System.out.println("Tan =" + tan(angle));
			System.out.println("Tan90 =" + Math.tan(angle * Math.PI/180.0));

		}
	}
	
	public static double sin(double angle) {
		if(angle % 180 == 0) {
			angle = 0;
			return angle;
		}
		else if(angle % 90 == 0){
			angle = 1;
			return angle;
		}
		else if(angle % 60 == 0){
			if(firstQuadrant(angle) || secondQuadrant(angle)) {
				System.out.println("Sin = sqrt(3)/2");
			}
			else {
				System.out.println("Sin = -sqrt(3)/2");
			}
			
		}
		else if(angle % 45 == 0){
			if(firstQuadrant(angle) || secondQuadrant(angle)) {
				System.out.println("Sin = sqrt(2)/2");
			}
			else {
				System.out.println("Sin = -sqrt(2)/2");
			}
		}
		else if(angle % 30 == 0){
			if(firstQuadrant(angle) || secondQuadrant(angle)) {
				angle = 0.5;
			}
			else {
				angle = -0.5;
			}
		}
		else {
			angle = Math.sin(angle * Math.PI/180.0);
			return angle;
		}
		return angle;
	}
	
	public static double cos(double angle) {
		if(angle % 180 == 0) {
			angle = 1;
			return angle;
		}
		else if(angle % 90 == 0){
			angle = 0;
			return angle;
		}
		else if(angle % 60 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				angle = 0.5;
			}
			else {
				System.out.println("Cos = -0.5");
				angle = -0.5;
			}
			
		}
		else if(angle % 45 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				System.out.println("Cos = sqrt(2)/2");
			}
			else {
				System.out.println("Cos = -sqrt(2)/2");
			}
		}
		else if(angle % 30 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				System.out.println("Cos = sqrt(3)/2");
			}
			else {
				System.out.println("Cos = -sqrt(3)/2");
			}
		}
		else {
			angle = Math.cos(angle * Math.PI/180.0);
			return angle;
		}
		return angle;
		
	}
	
	public static double tan(double angle) {
		if(angle % 180 == 0) {
			angle = 0;
			return angle;
		}
		else if(angle % 90 == 0){
			angle = -1;
			return angle;
		}
		else if(angle % 60 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				System.out.println("Tan = sqrt(3)");
			}	
			else {
				System.out.println("Tan = sqrt(3)");
			}
			
		}
		else if(angle % 45 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				angle = 1;
			}
			else {
				angle = -1;
			}
		}
		else if(angle % 30 == 0){
			if(firstQuadrant(angle) || thirdQuadrant(angle)) {
				System.out.println("Tan = sqrt(3)/3");
			}
			else {
				System.out.println("Tan = -sqrt(3)/3");
			}
		}
		else {
			angle = Math.tan(angle * Math.PI/180.0);
			return angle;
		}
		return angle;
		
	}
//Converter constants
	public static double convertToLessThan360(double angle) {
		while(angle >= 360) {
			angle = angle % 360;
		}
		return angle;
	}
	public static boolean firstQuadrant(double angle) {
		angle = convertToLessThan360(angle);
		if(angle >= 0 && angle <= 90) {
			return true;
		}
		else return false;
	}
	public static boolean secondQuadrant(double angle) {
		angle = convertToLessThan360(angle);
		if(angle >= 90 && angle <= 180) {
			return true;
		}
		else return false;
	}
	public static boolean thirdQuadrant(double angle) {
		angle = convertToLessThan360(angle);
		if(angle >= 180 && angle <= 270) {
			return true;
		}
		else return false;
	}
	public static boolean fourthQuadrant(double angle) {
		angle = convertToLessThan360(angle);
		if(angle >= 270 && angle <= 360) {
			return true;
		}
		else return false;
	}

}
