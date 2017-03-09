package week2.practice1;

public class QuadEqual {

    public static void main(String[] args) {
        double a;
        double b;
        double c;

        double value[][] = {{3,2.5,-0.5},{0,0,9999999999d},{0,10,0},{1,1.1,0.1},{0,0,0},{3,-18,27}};

        System.out.println("1-й результат:");
        quadEq(value[0][0],value[0][1],value[0][2]);
        System.out.println("2-й результат:");
        quadEq(value[1][0],value[1][1],value[1][2]);
        System.out.println("3-й результат:");
        quadEq(value[2][0],value[2][1],value[2][2]);
        System.out.println("4-й результат:");
        quadEq(value[3][0],value[3][1],value[3][2]);
        System.out.println("5-й результат:");
        quadEq(value[4][0],value[4][1],value[4][2]);
        System.out.println("6-й результат:");
        quadEq(value[5][0],value[5][1],value[5][2]);

    }

     static void quadEq(double a, double b, double c) {

        double x1;
        double x2;

        if ((a == 0)&&(c == 0)&&(b !=0)) {
            System.out.println("x1=" + 0.0);
            System.out.println("x2=" + 0.0);
        }
        if (a == 0) {
            if (b !=0) {
                x1 = x2 = (-1.0*c)/b;
            } else if (c == 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        } else {

            double d = b*b - 4*a*c;

            if (d > 0) {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if(d == 0) {
                x1 = x2 = -b/(2*a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        }
    }
}