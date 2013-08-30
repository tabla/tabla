package tabla;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tabla.sample.CruiseColumnsDefinition;

public class TableInMemoryTest {

	@Test public void add_increment_rows_so_that_count_is_1() {
		TableInMemory<CruiseColumnsDefinition> table = newTable();
		assertEquals(0, table.count());

		Row<CruiseColumnsDefinition> row = RowBuilder.aRow(CruiseColumnsDefinition.DEFINITION)
			.with(CruiseColumnsDefinition.DEPLOYMENT,  "C")
			.with(CruiseColumnsDefinition.CODE,        "12345678")
			.with(CruiseColumnsDefinition.NAME,        "Napoli - Sardegna")
			.with(CruiseColumnsDefinition.DESCRIPTION, "A wonderful trip!")
			.toRow();
		
		table.add(row);
		assertEquals(1, table.count());
	}

	@Test(expected=IllegalStateException.class)
	public void add_throws_an_error_when_row_that_we_are_trying_to_insert_has_a_key_already_present_in_table() {
		TableInMemory<CruiseColumnsDefinition> table = newTable();
		Row<CruiseColumnsDefinition> row = RowBuilder.aRow(CruiseColumnsDefinition.DEFINITION)
			.with(CruiseColumnsDefinition.DEPLOYMENT, "C")
			.with(CruiseColumnsDefinition.CODE,       "12345678")
			.toRow();
		table.add(row);
		
		table.add(row);
	}

	@Test(expected=IllegalStateException.class)
	public void update_throws_an_error_when_specified_row_does_not_exist() {
		TableInMemory<CruiseColumnsDefinition> table = newTable();
		Row<CruiseColumnsDefinition> row = RowBuilder.aRow(CruiseColumnsDefinition.DEFINITION)
			.with(CruiseColumnsDefinition.DEPLOYMENT, "C")
			.with(CruiseColumnsDefinition.CODE,       "12345678")
			.toRow();
		table.update(row);
	}

	@Test public void update_change_two_columns() {
		TableInMemory<CruiseColumnsDefinition> table = newTable();
		Row<CruiseColumnsDefinition> row = RowBuilder.aRow(CruiseColumnsDefinition.DEFINITION)
			.with(CruiseColumnsDefinition.DEPLOYMENT,  "C")
			.with(CruiseColumnsDefinition.CODE,        "12345678")
			.with(CruiseColumnsDefinition.NAME,        "AAA")
			.with(CruiseColumnsDefinition.DESCRIPTION, "aaa")
			.toRow();
		table.add(row);

		Row<CruiseColumnsDefinition> newRow = RowBuilder.aRow(CruiseColumnsDefinition.DEFINITION)
			.with(row)
			.with(CruiseColumnsDefinition.NAME,        "BBB")
			.with(CruiseColumnsDefinition.DESCRIPTION, "bbb")
			.toRow();
		table.update(newRow);
		
		assertEquals(1, table.count());
		assertEquals("BBB", table.first().getValue(CruiseColumnsDefinition.NAME));
		assertEquals("bbb", table.first().getValue(CruiseColumnsDefinition.DESCRIPTION));
	}

	private TableInMemory<CruiseColumnsDefinition> newTable() {
		return new TableInMemory<CruiseColumnsDefinition>(CruiseColumnsDefinition.DEFINITION);
	}
	
}
