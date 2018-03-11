package converter;
/**
 * The Enum class for length values with name. 
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.03.09
 */
public enum Length {
	
	Meter(1.00000),
	Kilometer(1000),
	Mile(1609.344),
	Foot(0.30480),
	Wa(2.00000),
	AU(149597870700.000);
	
	/**the value of each length (can't modify)*/
	private final double value;
	
	/**
	 * The constructor for each value in the length.
	 * @param value
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * Get the value from each length.
	 * @return the value from each length.
	 */
	public double getValue() {
		return this.value;
	}
	
	/**
	 * For testing length. 
	 * @param args get information for print.
	 */
	public static void main(String[] args) {
		Length[] lengths = Length.values();
		for (Length x : lengths) {
			System.out.println(x.toString() + " = " + x.getValue());
		}
	}
}
