package tabla;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Represents an implementation of {@link Table} all in memory.
 *
 * @param <C> columns
 */
public class TableInMemory<C extends ColumnsDefinition> implements Table<C> {

	private static final Logger LOG = Logger.getLogger(TableInMemory.class.getName());
	
	@Override
	public void add(Row<C> row) {
		LOG.info("adding row " + row + "...");
		
		Key key = columnsDefinition.getKey();
		for (Row<C> each : rows) {
			if (key.sameKey(each, row)) {
				LOG.severe("a row with the same key (" + key + ") already exists (row " + row + ")");
				throw new IllegalStateException("a rows with the same key already exists");
			}
		}
		
		this.rows.add(row);
		LOG.info("... row added");
	}

	@Override
	public void update(Row<C> row) {
		LOG.info("updating row " + row + "...");
		
		Key key = columnsDefinition.getKey();
		int position = -1;
		int i = 0;
		for (Row<C> each : rows) {
			if (key.sameKey(each, row)) {
				position = i;
				break;
			}
			
			i++;
		}
		
		if (position < 0) {
			LOG.severe("unable to find any row matching key of " + row);
			throw new IllegalStateException("unable to find any row matching key of " + row);
		}

		rows.set(position, row);
		
		LOG.info("... row updated");
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
		if (rows.size() > 0)
			return rows.get(0);
		return null;
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

	@Override
	public String toString() {
		return "[columns definition=" + columnsDefinition + ", rows=" + rows.size() + "]";
	}

	public TableInMemory(C columnsDefinition) {
		super();
		this.columnsDefinition = columnsDefinition;
		this.rows = new LinkedList<Row<C>>();
	}

	private final List<Row<C>> rows;
	private final C columnsDefinition;
	
}
