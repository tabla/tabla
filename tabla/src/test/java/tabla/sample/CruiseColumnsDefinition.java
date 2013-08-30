package tabla.sample;

import java.util.Arrays;
import java.util.Collection;

import tabla.Column;
import tabla.ColumnsDefinition;
import tabla.Key;
import tabla.key.MultipleColumnsKey;

public final class CruiseColumnsDefinition extends ColumnsDefinition {
	
	public static final Column DEPLOYMENT = new Column("deployment", Column.Type.text);
	public static final Column CODE = new Column("code", Column.Type.text);
	
	public static final Column NAME = new Column("name", Column.Type.text);
	public static final Column DESCRIPTION = new Column("description", Column.Type.text);

	public static final CruiseColumnsDefinition DEFINITION = new CruiseColumnsDefinition(Arrays.asList(
			CruiseColumnsDefinition.DEPLOYMENT, 
			CruiseColumnsDefinition.CODE,
			CruiseColumnsDefinition.NAME,
			CruiseColumnsDefinition.DESCRIPTION
		));
	
	public static final Key KEY = new MultipleColumnsKey(CruiseColumnsDefinition.DEPLOYMENT, CruiseColumnsDefinition.CODE);
	
	private CruiseColumnsDefinition(Collection<Column> columns) {
		super(columns);
	}

	@Override
	public Key getKey() {
		return KEY;
	}

}