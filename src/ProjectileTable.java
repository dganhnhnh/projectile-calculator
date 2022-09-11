public class ProjectileTable extends Projectile{
    private double v0;
    private double alpha;
    private int steps;
    private double x=0.0;
    private double y=0.0;
    private double t=0.0;
    private double timeIncrement;
    
    public ProjectileTable (double v0,double alpha,int steps){
        super(v0, alpha);
        this.steps=steps;
        System.out.println("step\tx\ty\tt");
        System.out.println("0\t0.0\t0.0\t0.0");
    }
    public void printTable(){
        timeIncrement = super.timeToLand()/steps;
        for (int i=1; i<=steps; i++){
            t += timeIncrement;
            x = super.getV0()*Math.cos(super.getAlpha())*t;
            y= super.getV0()*Math.sin(super.getAlpha())*t - 9.81*t*t/2;
            System.out.println(i +"\t"+ String.format("%.2f",x)+"\t"
            + String.format("%.2f",y) +"\t"+String.format("%.2f",t));
        }
    }

}
