package tabla.key;

import java.util.Arrays;
import java.util.logging.Logger;

import tabla.Column;
import tabla.ColumnsDefinition;
import tabla.Key;
import tabla.Row;

// TODO create a SingleColumnKey too

public class MultipleColumnsKey implements Key {

	private static final Logger LOG = Logger.getLogger(MultipleColumnsKey.class.getName());
	
	@Override
	public <C extends ColumnsDefinition> boolean sameKey(Row<C> row1, Row<C> row2) {
		LOG.info("verifying if rows has the same key: 1) " + row1 + ", 2) " + row2 + "...");
		
		boolean result = true;
		for (Column column : columns) {
			Object value1 = row1.getValue(column);
			Object value2 = row2.getValue(column);
			LOG.fine("... checking column " + column + ". Value of row 1 is: " + value1 + ", value of row 2 is: " + value2);
			
			if (value1 == null) {
				if (value2 != null) {
					result = false;
					break;
				}
			} else {
				if (! value1.equals(value2)) {
					result = false;
					break;
				}
			}
		}
		
		LOG.info("... returning: " + result);
		return result;
	}

	@Override
	public String toString() {
		return "key" + Arrays.toString(columns);
	}

	private Column[] columns;

	public MultipleColumnsKey(Column... columns) {
		this.columns = columns;
	}

}
