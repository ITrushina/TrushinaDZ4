import java.lang.Math;
public class TriangleArea {
    public static double Area(int a, int b, int c) throws NegativeException, NotATriangleException {
        if (a > 0 && b > 0 && c > 0) {
            if (a+b > c && b + c > a && c + a > b) {
                int p = a + b + c;
                int semi_p = p / 2;
                return Math.sqrt(semi_p * (semi_p - a) * (semi_p - b) * (semi_p - c));
            }
            else {
                throw new NotATriangleException ("Это не треугольник!");
            }
        }
        else {
            throw new NegativeException("Число не положительное!");
        }
    }
}
