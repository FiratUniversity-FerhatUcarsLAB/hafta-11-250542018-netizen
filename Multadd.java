public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1.0 - b);
        
        return multadd(a, b, c);
    }

    public static void main(String[] args) {
        System.out.println("multadd(1.0, 2.0, 3.0) = " + multadd(1.0, 2.0, 3.0));

        double a2 = 0.5;
        double b2 = Math.cos(Math.PI / 4);
        double c2 = Math.sin(Math.PI / 4);
        System.out.println("sin(pi/4) + cos(pi/4) / 2 = " + multadd(a2, b2, c2));

        double a3 = 1.0;
        double b3 = Math.log(10);
        double c3 = Math.log(20);
        System.out.println("log(10) + log(20) = " + multadd(a3, b3, c3));
        
        System.out.println("expSum(2.0) = " + expSum(2.0));
    }
}
