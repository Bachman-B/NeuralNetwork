package nu.bachman.neuralnetwork;


/**
 * @author Bj�rn Bachman
 * @version 1.0
 * @created 29-aug-2022 19:54:34
 */
public class Neuron {

	@SuppressWarnings("unused")
	private double value;
	@SuppressWarnings("unused")
	private double bias;

	public Neuron(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param value
	 * @return 
	 */
	public void setValue(double value){
		this.value=value;
	}

	/**
	 * 
	 * @param bias
	 * @return 
	 */
	public void setBias(double bias){
		this.bias=bias;
	}

}