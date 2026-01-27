package Day2.chatlogparser;

public class UseChatLogParser {
	public static void main(String[] args) {
        ChatLogParser parser = new ChatLogParser();

        // use idle filter
        MessageFilter<String> filter = new IdleMessageFilter();

        // sample file path
        String logFile = "src/samplefiles/chat.txt";

        try {
            parser.parseLogFile(logFile, filter);
            parser.printSummary();

            // example: check specific user
            System.out.println("Messages by John: " + parser.getMessageCount("John"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
