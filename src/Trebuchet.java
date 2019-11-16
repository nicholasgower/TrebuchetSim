import java.io.PrintStream;

public class Trebuchet extends PhysicsObject{
	double height=0;
	double desiredDistance=11;
	LeverArm leverArm;
	public Trebuchet(double height,LeverArm LA){
		this.height=height;
		this.position[1]=height;
		this.leverArm=LA;
		
	}
	public void launchConsole(PrintStream output){
		
	}
	public void launchRange(PrintStream output)
	
}

