
public class Projectile  extends PhysicsObject{
	boolean released=false;
	
	public Projectile(LeverArm parent){
		this.parent=parent;
		//this.position=parent.L1;
	}
	public void update(double deltaTime){
		if(released){
			
		}
	}
	public double x(){
		return this.position[0];
	}
	public double y(){
		return this.position[1];
	}
	public void release(){
		released=true;
	}
}
