package tabla;

import java.util.Collection;
import java.util.Collections;

/**
 * Represents a columns definition.
 */
public abstract class ColumnsDefinition {

	/**
	 * Returns all columns of this columns definition.
	 * 
	 * @return all columns of this columns definition
	 */
	public Collection<Column> getColumns() {
		return Collections.unmodifiableCollection(columns);
	}

	/**
	 * Returns the key of this columns definition.
	 * 
	 * @return key of this columns definition
	 */
	public abstract Key getKey();

	@Override
	public String toString() {
		return "<columns=" + columns + ", key=" + getKey() + ">";
	}
	
	protected ColumnsDefinition(Collection<Column> columns) {
		super();
		this.columns = columns;
	}
	
	private final Collection<Column> columns;
	
}

