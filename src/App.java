import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("velocity (meters/second)? ");
        double initialVelocity=sc.nextDouble();
        System.out.println("angle (degrees)? ");
        double alpha=sc.nextDouble();
        System.out.println("steps? ");
        int steps = sc.nextInt();
        alpha=Math.toRadians(alpha);

        Projectile p = new Projectile(initialVelocity, alpha);
        System.out.println("Maximum height to reach: "+ String.format("%.2f",p.maxHeight())+" meters");
        System.out.println("Maximum range to reach: "+ String.format("%.2f",p.maxRange())+" meters");
        System.out.println("Expected time to land: "+ String.format("%.2f",p.timeToLand())+" seconds");
        // System.out.println(p.getV0());

        ProjectileTable pt = new ProjectileTable(initialVelocity, alpha, steps);
        pt.printTable();
    }
}
