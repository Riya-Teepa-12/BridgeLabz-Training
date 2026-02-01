package com.functionalinterfaces.dataexportfeature;

public interface DataExporter {
	void exportToCSV(String data);

    void exportToPDF(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON: " + data);
    }

}
