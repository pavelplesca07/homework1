public class Main {
    public static void main(String[] args) {

    int x = 16;
    short y = 8;
    byte c = 4;


        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        System.out.println("y + c = " + (y + c));
        System.out.println("y - c = " + (y - c));
        System.out.println("y * c = " + (y * c));
        System.out.println("y / c = " + (y / c));

        System.out.println("x + c = " + (x + c));
        System.out.println("x - c = " + (x - c));
        System.out.println("x * c = " + (x * c));
        System.out.println("x / c = " + (x / c));
    }

    static int someMethod(int a, int b){
        
        return a * b - 3;

    }
}