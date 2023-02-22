package com.company;

public class Main {
    public static void main(String[] args)
    {
        ComplexNumber a = new ComplexNumber(5,2);
        ComplexNumber b = new ComplexNumber(6,4);

        ComplexNumber sum=a.sum(b);
        ComplexNumber difference=a.difference(b);
        ComplexNumber product=a.product(b);

        System.out.println("SUM OF TWO COMPLEX NUMBERS ARE: "+sum);
        System.out.println("DIFFERENCE OF TWO COMPLEX NUMBERS ARE: "+difference);
        System.out.println("PRODUCT OF TWO COMPLEX NUMBERS ARE: "+product);

        System.out.println(a);
    }
}
class ComplexNumber
{
    private final double real_num,img_num;

    public ComplexNumber(double real,double imaginary)
    {
        this.real_num=real;
        this.img_num=imaginary;
    }
    public ComplexNumber sum(ComplexNumber other)
    {
        double r = this.real_num+other.real_num;
        double i = this.img_num+other.img_num;
        return new ComplexNumber(r,i);
    }
    public ComplexNumber difference(ComplexNumber other)
    {
        double r = this.real_num-other.real_num;
        double i = this.img_num-other.img_num;
        return new ComplexNumber(r,i);
    }
    public ComplexNumber product(ComplexNumber other)
    {
        double r = this.real_num* other.real_num;
        double i = this.img_num*other.img_num;
        return new ComplexNumber(r,i);
    }
    public double getReal()
    {
        return real_num;
    }
    public double getImg()
    {
        return img_num;
    }
    public String toStr()
    {
        return real_num+" + "+img_num+"i";
    }
}
