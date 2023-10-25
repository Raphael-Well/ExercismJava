public enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL,
    UNKNOWN;

    public static LogLevel fromString(String levelString) {
        switch (levelString.toUpperCase()) {
            case "TRC":
                return TRACE;
            case "DBG":
                return DEBUG;
            case "INF":
                return INFO;
            case "WRN":
                return WARNING;
            case "ERR":
                return ERROR;
            case "FTL":
                return FATAL;
            default:
                return UNKNOWN;
        }
    }

    public int getValue() {
        switch (this) {
            case TRACE:
                return 1;
            case DEBUG:
                return 2;
            case INFO:
                return 4;
            case WARNING:
                return 5;
            case ERROR:
                return 6;
            case FATAL:
                return 42;
            default:
                return 0;
        }
    }
}
