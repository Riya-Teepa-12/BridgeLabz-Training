package com.functionalinterfaces.dataexportfeature;

public class UseData {
	public static void main(String[] args) {
		DataExporter exporter=new CSVPDFExporter();

	     String reportData="Monthly Report";

	     exporter.exportToCSV(reportData);
	     exporter.exportToPDF(reportData);
	     exporter.exportToJSON(reportData);
		
	}

}
