
public class LeverArm extends PhysicsObject {
	double L1,L2,launchAngle;
	Projectile ball;
	public LeverArm(double L1, double L2,double angle,double launchAngle){
		this.positionAng=Math.toRadians(angle);
		this.launchAngle=Math.toRadians(launchAngle);
		this.L1=L1;
		this.L2=L2;
		ball=new Projectile(this);
	}
}
