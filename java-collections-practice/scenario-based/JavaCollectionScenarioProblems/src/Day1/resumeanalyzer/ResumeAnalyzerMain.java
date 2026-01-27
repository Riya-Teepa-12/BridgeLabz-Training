package Day1.resumeanalyzer;

public class ResumeAnalyzerMain {
	   public static void main(String[] args) {
	    	System.out.println("RESUME ANALYZER");

	        ResumeAnalyzer analyzer = new ResumeAnalyzer();

	        String folder = "src/samplefiles/myrepo/";

	        analyzer.processFolder(folder);
	        analyzer.showResults();
	        
	    }
}
