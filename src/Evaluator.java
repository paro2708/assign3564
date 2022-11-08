/**
 * This class implements the Singleton pattern. It has the private constructor.
 */

public class Evaluator {
	private static Evaluator _instance;

	// This is the private constructor essential to implement the Singleton pattern.
	private Evaluator() {
	};

	// This method creates an object of the Evaluator class, making sure that it will be the only instance.
	public static Evaluator getEvaluator() {
		if (_instance == null)
			_instance = new Evaluator();
		return _instance;
	}

	// This function finds the average of the points, to draw the line across the graph.
	public int findAvg() {
		DataSource ds = DataSource.getDataSource();
		int[] data = ds.getData();
		int sum = 0;
		for (int num : data) {
			sum += num;
		}
		return sum / data.length;
	}
}
