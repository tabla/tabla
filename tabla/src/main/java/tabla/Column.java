package tabla;


/**
 * Represents a column.
 */
public class Column {

	/**
	 * Represents a supported column type.
	 */
	public static enum Type { text, number, datetime, bool };
	
	/**
	 * Returns the name of the column.
	 * 
	 * @return the name of the column
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the type of the column.
	 * 
	 * @return the type of the column
	 */
	public Type getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Column other = (Column) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new StringBuilder(name)
			.append("<")
			.append(type)
			.append(">")
			.toString();
	}

	/**
	 * Create a column with specified name and type.
	 * 
	 * @param name name of the column
	 * @param type type of the column
	 */
	public Column(String name, Type type) {
		if (name == null || name.trim().length() == 0) throw new IllegalArgumentException("'name' parameter cannot be null");
		if (type == null) throw new IllegalArgumentException("'type' parameter cannot be null");
		
		this.name = name;
		this.type = type;
	}

	private final String name;
	private final Type type;
	
}