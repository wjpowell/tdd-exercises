package dao;

import model.DataRow;

public class SimpleDataDao {

	public boolean recordExists (DataRow row) {
		throw new RuntimeException("Dao Was called for Record Exists");
	}

	public void updateRow(DataRow row) {
		throw new RuntimeException("Dao Was called for Update Row");
	}

	public void deleteRow(DataRow row) {
		throw new RuntimeException("Dao Was called for Delete Row");
	}

	public void insertRow(DataRow row) {
		throw new RuntimeException("Dao Was called for Insert Row");
	}

}
