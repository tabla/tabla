package tabla;

import java.util.Iterator;

/**
 * Represents an implementation of {@link Table} that use {@code JDBC}.
 *
 * @param <C> columns of the table
 * @param <K> key of the table
 */
public class TableJdbc<C extends Columns, K extends Columns> implements Table<C, K> {

	@Override
	public Iterator<Row<C>> iterator() {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
	}

	@Override
	public void add(Row<C> row) {
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
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
		// TODO
		throw new UnsupportedOperationException("This operation has to be implemented yet");
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

}
