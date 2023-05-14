package Bai4_Lop_va_Doi_Tuong;

public class Pt_bac2 {
    private double a;
    private double b;
    private double c;

    public Pt_bac2() {
    }

    public Pt_bac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return b*b - 4 * a * c;
    }
    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return ( (-b + Math.sqrt(getDiscriminant())) / (2*a));
        }
    }
    public double getRoot2() {
        if ( getDiscriminant() < 0 ) {
            return 0;
        } else {
            return ( (-b - Math.sqrt(getDiscriminant())) / (2*a));
        }
    }
    public double getRoot() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return -b / (2*a);
        }
    }

}
