
public class PhysicsObject {
	public double[] position={0,0};
	public double[] velocity={0,0};
	public double[] acceleration={0,0};
	public double positionAng=0;
	public double velocityAng=0;
	public double accelerationAng=0;
	public double mass=0;
	PhysicsObject parent=null;
	public PhysicsObject(){
		
	}
	public void update(double deltaTime){
		
	}
	public double x(){
		return position[0];
	}
	public double y(){
		return position[1];
	}
	
}
