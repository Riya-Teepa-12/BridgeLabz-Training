package Day2.examresultuploader;

import java.io.IOException;

public class UseExamResultUploader {
	public static void main(String[] args) {
		ExamResultUploader<Object> uploader = new ExamResultUploader<>();

		// sample file path
		String csvFile = "src/samplefiles/marks.csv";

		try {
			uploader.uploadResults(csvFile);
			uploader.showTopScorers();
			uploader.showSummary();

		} catch (InvalidMarksException e) {
			System.out.println("Validation Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}
