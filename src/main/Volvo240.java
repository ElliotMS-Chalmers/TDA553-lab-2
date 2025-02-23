
import java.awt.*;

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;
    
    public Volvo240() {
		super(
			4,				// nrDoors
			100, 			// enginePower
			Color.black, 	// color
			"Volvo240"		// modelName
		);
    }

	public double getTrimFactor(){
		return trimFactor;
	}
    
	@Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }
}
