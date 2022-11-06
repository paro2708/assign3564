
public class DataSource extends Observable {
	private static DataSource d;
	int[] points = new int[75];

	public static DataSource getDataSource() {
		if (d == null)
			d = new DataSource();
		return d;
	}

	private DataSource() {
	}

	public void setData() {
		for (int i = 0; i < 50; i++) {
			points[i] = (int) (Math.random() * 450) + 10;
		}
		notifying();
	}

	public int[] getData() {
		return points;
	}

	@Override
	public void notifying() {
		this.getObs1().update(points);
	}

}
