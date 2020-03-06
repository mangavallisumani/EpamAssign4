package assign4;

public class SCIntrest {
public SCIntrest(){
		
	}
	public double SimpleIntrest(double p,double t,double r){
		return (p*t*r)/100;
	}
	public double CompoundIntrest(double p,double t,double r){
		double c=p*(Math.pow(1+(r/100),t));
		return c;
	}

}
