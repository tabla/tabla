package tabla;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Represents a <i>builder</i> of a {@link Row}.
 */
public class RowBuilder<C extends ColumnsDefinition> {

	public static <C extends ColumnsDefinition> RowBuilder<C> aRow(C columnsDefinition) {
		return new RowBuilder<C>(columnsDefinition);
	}
	
	public RowBuilder<C> with(Column column, Object value) {
		// TODO validate that column is one of columns
		values.put(column, value);
		return this;
	}
	
	public RowBuilder<C> with(Row<C> row) {
		for (Column col : columnsDefinition.getColumns())
			with(col, row.getValue(col));
		return this;
	}

	public Row<C> toRow() {
		return new Row<C>(values);
	}
	
	private RowBuilder(C columnsDefinition) {
		this.columnsDefinition = columnsDefinition;
		this.values = new LinkedHashMap<Column, Object>();
	}
	
	private final C columnsDefinition;
	private final Map<Column, Object> values;
	
}
