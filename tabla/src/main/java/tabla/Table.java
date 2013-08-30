package tabla;

/**
 * Represents a table with specified columns.
 * 
 * @param <C> columns of the table
 */
public interface Table<C extends ColumnsDefinition> extends Iterable<Row<C>> {

	/**
	 * Add specified row to this table.
	 * 
	 * @param row a {@link Row}
	 */
	public void add(Row<C> row);
	
	/**
	 * Update specified row in this table.
	 * 
	 * @param row a {@link Row}
	 */
	public void update(Row<C> row);
	
	/**
	 * Remove specified row from this table.
	 * 
	 * @param row a {@link Row}
	 */
	public void remove(Row<C> row);

	/**
	 * Returns the number of rows in this table.
	 * 
	 * @return number of rows
	 */
	public int count();
	
	/**
	 * Returns first row of this table.
	 * 
	 * @return first row
	 */
	public Row<C> first();

	/**
	 * Returns last row of this table.
	 * 
	 * @return last row
	 */
	public Row<C> last();

	/**
	 * Returns row at specified position (0-based).
	 * 
	 * @return row at specified position
	 */
	public Row<C> get(int position);

	/**
	 * Returns <code>true</code> if table contains specified row.
	 * 
	 * @param row a {@link Row}
	 * 
	 * @return <code>true</code> if table contains specified row, otherwise <code>false</code>
	 */
	public boolean contains(Row<C> row);
	
	/**
	 * Returns the index of specified row (0-based).
	 * 
	 * @param row a {@link Row}
	 * @return index of specified row (0-based) or -1 if row is not found
	 */
	public int indexOf(Row<C> row);
	
}
