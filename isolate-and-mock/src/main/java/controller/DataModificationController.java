package controller;

import java.util.List;

import dao.SimpleDataDao;
import model.DataRow;

public class DataModificationController {
 
	private List<DataRow> dataRows;
	public DataModificationController(List<DataRow> dataRows) {
		this.dataRows = dataRows;
	}

	public void processDataChange() {
		SimpleDataDao simpleDataDao = new SimpleDataDao();
		for(DataRow row: dataRows) {
			boolean recordExists = simpleDataDao.recordExists(row);
			if(recordExists) {
				if(row.isActive()) {
					simpleDataDao.updateRow(row);
				} else {
					simpleDataDao.deleteRow(row);
				}
			} else if (row.isActive() && recordExists) {
				simpleDataDao.insertRow(row);
			}
		}
	}
}
