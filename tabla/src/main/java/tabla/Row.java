package tabla;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a row of specified columns.
 *
 * @param <C> columns of the row
 */
public class Row<C extends Columns> {

	private final Map<Column, Object> values;
	
	public Row() {
		super();
		this.values = new LinkedHashMap<Column, Object>();
	}

	public void set(Column column, Object value) {
		values.put(column, value);
	}

}
