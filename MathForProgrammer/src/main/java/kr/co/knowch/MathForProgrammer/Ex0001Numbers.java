package kr.co.knowch.MathForProgrammer;

/**
 * 프로그래머를 위한 기초수학 - 0001 수의 체계
 * 
 * 본 소스는 프로그래머를 위한 기초수학을 위해 작성되었습니다. 
 * 본 소스에 대한 모든 권리는 제작자에게 있습니다.
 *  
 * Made by shalska
 * 2018/08/27
 */

public class Ex0001Numbers {
    public static void main(String[] args) {
    	byte a = 0;
    	short b = 0;
    	int c = 0;
    	long d = 0L;
    	float e = 1.12f;
    	double f = 2.12;
    	
    	getMinMax();
    	
    	Complex z1 = new Complex(1, 2);
    	Complex z2 = new Complex(3, -4);
    	
    	System.out.println(z1.add(z2).toString());
    	System.out.println(z1.multifly(z2).toString());
    }
    
    public static void getMinMax() {
    	System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
    	System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
    	System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
    	System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
    	System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
    	System.out.println("double : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
    }

    
    public static class Complex {
    	// 실수부
    	private double real;

    	// 허수부
    	private double image;
    	
    	public Complex(double real, double image) {
    		this.real = real;
    		this.image = image;
    	}
    	
    	public double getReal() {
    		return this.real;
    	}

    	public double getImage() {
    		return this.image;
    	}
    	
    	public Complex add(Complex com) {
    		return new Complex(real + com.getReal(), image + com.getImage());
    	}
    	
    	public Complex multifly(Complex com) {
    		return new Complex(real*com.getReal() - image*com.getImage(), 
    							real*com.getImage() + image*com.getReal());
    	}
    	
    	public Complex inverse(Complex com) {
    		return new Complex(real/(real*real+image*image), -image/(real*real+image*image));
    	}
    	
    	public Complex conjugate(Complex com) {
    		return new Complex(real, (-1)*image);
    	}
    	
    	public String toString() {
    		StringBuffer result = new StringBuffer();
    		result.append(real);
    		
    		if(image == 0) {
    			
    		} else if(image > 0) {
    			result.append("+").append(image).append("i");
    		} else {
    			result.append(image).append("i");
    		}
    		
    		return result.toString();
    	}
    	
    }
}
