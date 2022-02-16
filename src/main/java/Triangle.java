public class Triangle {
    public static void main(String[] args) {
        try {
            System.out.println("Площадь треугольника равна " + TriangleArea.Area(3, 4, 5));
        }
        catch (NegativeException | NotATriangleException e) {
            e.printStackTrace();
        }
    }
}
