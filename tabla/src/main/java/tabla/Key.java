package tabla;

/**
 * Represents a key in a columns definition.
 */
public interface Key {

	/**
	 * Returns <code>true</code> if specified rows has the same key.
	 * 
	 * @param row1 a row
	 * @param row2 another row
	 * @return <code>true</code> if specified rows has the same key, otherwise <code>false</code>
	 */
	public <C extends ColumnsDefinition> boolean sameKey(Row<C> row1, Row<C> row2);
	
}
