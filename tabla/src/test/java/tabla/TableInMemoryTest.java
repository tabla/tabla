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

	private TableInMemory<CruiseColumnsDefinition> newTable() {
		return new TableInMemory<CruiseColumnsDefinition>(CruiseColumnsDefinition.DEFINITION);
	}
	
}
