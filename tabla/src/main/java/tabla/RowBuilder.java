package tabla;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a <i>builder</i> of a {@link Row}.
 */
public class RowBuilder<C extends ColumnsDefinition> {

	public static <C extends ColumnsDefinition> RowBuilder<C> aRow(C columns) {
		return new RowBuilder<C>(columns);
	}
	
	public RowBuilder<C> with(Column column, Object value) {
		// FIXME validate that column is one of columns
		values.put(column, value);
		return this;
	}
	
	public Row<C> toRow() {
		return new Row<C>(values);
	}
	
	private RowBuilder(C columns) {
		this.columns = columns;
		this.values = new LinkedHashMap<Column, Object>();
	}
	
	@SuppressWarnings("unused")
	private final C columns;
	private final Map<Column, Object> values;
	
}
