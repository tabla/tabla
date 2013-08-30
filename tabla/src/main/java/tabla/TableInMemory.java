package tabla;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents an implementation of {@link Table} all in memory.
 *
 * @param <C> columns
 * @param <K> key of the table
 */
public class TableInMemory<C extends Columns, K extends Columns> implements Table<C, K> {

	private final List<Row<C>> rows;
	
	public TableInMemory() {
		super();
		this.rows = new LinkedList<Row<C>>();
	}

	@Override
	public void add(Row<C> row) {
		this.rows.add(row);
	}

	@Override
	public void update(Row<C> row) {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public void remove(Row<C> row) {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public int count() {
		return rows.size();
	}

	@Override
	public Row<C> first() {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public Row<C> last() {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public Row<C> get(int position) {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public boolean contains(Row<C> row) {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public Iterator<Row<C>> iterator() {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

}
