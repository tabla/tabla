package tabla;

import java.util.Iterator;

/**
 * Represents an implementation of {@link Table} all in memory.
 *
 * @param <COLUMNS> columns
 */
public class TableInMemory<COLUMNS extends Columns> implements Table<COLUMNS>, Iterable<Row<COLUMNS>> {

	@Override
	public Iterator<Row<COLUMNS>> iterator() {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

}
