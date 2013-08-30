package tabla;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Represents a set of columns.
 */
public class Columns implements Iterable<Column> {

	private final Column[] cols;
	
	protected Columns(Column... cols) {
		super();
		this.cols = cols;
	}

	@Override
	public Iterator<Column> iterator() {
		return Arrays.asList(cols).iterator();
	}

}
