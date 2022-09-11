import java.lang.Math;

public class Projectile {
    private double v0;
    private double alpha;
    private double t;
    // private double xVelocity;
    // private double yVelocity;
    
    public Projectile(double v0,double alpha){
        this.v0=v0;
        this.alpha=alpha;
    }

    public double getV0(){
        return v0;
    }

    public double getAlpha(){
        return alpha;
    }

    public double maxHeight(){
        return v0*v0*Math.pow(Math.sin(alpha),2)/2/9.81;
    }
    public double maxRange(){

        return v0*v0*Math.sin(2*alpha)/9.81;
    }
    public double timeToLand(){
        t = maxRange()/(v0*Math.cos(getAlpha()));
        return t;
    }
    public double timeToReachMaxHeight(){
        return timeToLand()/2;
    }
}