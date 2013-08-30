package tabla;

public class Sample {

	public static final class CruiseColumns extends Columns {
		
		public static final Column DEPLOYMENT = new Column("deployment", Column.Type.text);
		public static final Column CODE = new Column("code", Column.Type.text);
		
		public static final Column NAME = new Column("name", Column.Type.text);
		public static final Column DESCRIPTION = new Column("description", Column.Type.text);

		public static final CruiseColumns DEFINITION = new CruiseColumns(
				CruiseColumns.DEPLOYMENT, 
				CruiseColumns.CODE,
				CruiseColumns.NAME,
				CruiseColumns.DESCRIPTION
			);
		
		private CruiseColumns(Column... columns) {
			super(columns);
		}
		
	}
	
	public static final class CruiseKey extends Columns {
		
		public static final CruiseKey DEFINITION = new CruiseKey(
				CruiseColumns.DEPLOYMENT, 
				CruiseColumns.CODE
			);
		
		private CruiseKey(Column... columns) {
			super(columns);
		}
		
	}
	
}

