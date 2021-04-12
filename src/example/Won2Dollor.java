package example;

public class Won2Dollor extends Converter {

	@Override
	protected double convert(double src) {
		ratio = 1200;
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}

}
