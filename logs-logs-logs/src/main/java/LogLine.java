public class LogLine {
    private String logString;

    public LogLine(String logString) {
        this.logString = logString;
    }

    public LogLevel getLogLevel() {
        int start = logString.indexOf('[');
        int end = logString.indexOf(']');

        if (start != -1 && end != -1 && end > start) {
            String levelString = logString.substring(start + 1, end).toUpperCase();

            LogLevel level = LogLevel.fromString(levelString);

            if (level != null) {
                return level;
            } else {
                return LogLevel.UNKNOWN;
            }
        }

        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        String message = logString.substring(logString.indexOf(':') + 1).trim();
        return logLevel.getValue() + ":" + message;
    }
}