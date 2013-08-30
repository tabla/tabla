package tabla;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a row of specified columns.
 *
 * @param <C> columns definition
 */
public class Row<C extends ColumnsDefinition> {

	/**
	 * Return the value of specified column.
	 * 
	 * @param column a column in this row
	 * @return value of specified column
	 */
	public Object getValue(Column column) {
		return values.get(column);
	}

	@Override
	public String toString() {
		return values.toString();
	}
	
	Row(Map<Column, Object> values) {
		super();
		this.values = new LinkedHashMap<Column, Object>();
		this.values.putAll(values);
	}
	
	private final Map<Column, Object> values;

}
