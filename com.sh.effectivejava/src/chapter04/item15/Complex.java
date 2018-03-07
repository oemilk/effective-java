package chapter04.item15;

public class Complex {

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // public static 팩토리 메서드
    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public static Complex valueOfPolar(double r, double theta) {
        return new Complex(r * Math.cos(theta), r * Math.sin(theta));
    }

    // 대응되는 변경자 메서드가 없는 접근자 메서드
    public double realPart() {
        return re;
    }

    public double imaginarypart() {
        return im;
    }

    public Complex add(Complex c) {
        // 현재 인스턴스를 변경하지 않고 새로운 Complext 인스턴스를 생성하고 반환합니다.
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re + c.im + im * c.re);
    }

    public Complex divide(Complex c) {
        double temp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / temp, (im * c.re - re * c.im) / temp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Complex)) {
            return false;
        }

        Complex c = (Complex) obj;

        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    @Override
    public String toString() {
        return "Complex{" + "re=" + re + ", im=" + im + '}';
    }

    private int hashDouble(double val) {
        long longBits = Double.doubleToLongBits(val);
        return (int) (longBits ^ (longBits >>> 32));
    }

}
