import java.util.Scanner;

public class ExcuteQuadraEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("nhap b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("nhap c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        double delta = q.getDiscriminant();
        if (delta > 0){
            System.out.println("nghiem thu nhat la: " + q.getRoot1());
            System.out.println("nghiem thu hai la: " + q.getRoot2());
        } else if (delta == 0){
            System.out.println("nghiem la: " + q.getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem");
        }

    }
}
