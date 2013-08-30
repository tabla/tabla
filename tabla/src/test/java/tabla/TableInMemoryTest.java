package tabla;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TableInMemoryTest {

	@Test public void add_increment_rows_so_that_count_is_1() {
		TableInMemory<Sample.CruiseColumns, Sample.CruiseKey> table = new TableInMemory<Sample.CruiseColumns, Sample.CruiseKey>();
		assertEquals(0, table.count());

		Row<Sample.CruiseColumns> row = new Row<Sample.CruiseColumns>();
		row.set(Sample.CruiseColumns.DEPLOYMENT,  "C");
		row.set(Sample.CruiseColumns.CODE,        "12345678");
		row.set(Sample.CruiseColumns.NAME,        "Napoli - Sardegna");
		row.set(Sample.CruiseColumns.DESCRIPTION, "A wonderful trip!");
		
		table.add(row);
		assertEquals(1, table.count());
	}

}
