package tabla;

import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ColumnsTest {

	@Test public void is_iterable() {
		List<String> names = new ArrayList<String>();
		for (Column column : Sample.CruiseColumns.DEFINITION)
			names.add(column.getName());
		assertThat(names, hasItem(Sample.CruiseColumns.DEPLOYMENT.getName()));
		assertThat(names, hasItem(Sample.CruiseColumns.CODE.getName()));
		assertThat(names, hasItem(Sample.CruiseColumns.NAME.getName()));
		assertThat(names, hasItem(Sample.CruiseColumns.DESCRIPTION.getName()));
	}

}
