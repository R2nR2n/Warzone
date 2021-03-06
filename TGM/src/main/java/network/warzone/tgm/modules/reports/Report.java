package network.warzone.tgm.modules.reports;

public class Report {
    private String reporter;
    private String reported;
    private String reason;
    private long timestamp;
    private int amount;

    public Report setReporter(String reporter) {
        this.reporter = reporter;
        return this;
    }

    public Report setReported(String reported) {
        this.reported = reported;
        return this;
    }

    public Report setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public Report setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Report setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getReporter() {
        return this.reporter;
    }

    public String getReported() {
        return this.reported;
    }

    public String getReason() {
        return this.reason;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getAgo() {
        double time = (System.currentTimeMillis() - this.getTimestamp()) / 1000D;
        String ago;

        int hours = (int) Math.floor(time / 3600);
        time -= hours * 3600;
        int minutes = (int) Math.floor(time / 60);
        time -= minutes * 60;
        int seconds = (int) Math.floor(time);

        if (hours > 0) {
            ago = (hours == 1) ? "1 hour" : hours + " hours";
        } else if (minutes > 0) {
            ago = (minutes == 1) ? "1 minute" : minutes + " minutes";
        } else if (seconds > 0) {
            ago = (seconds == 1) ? "1 second" : seconds + " seconds";
        } else {
            ago = "moments";
        }

        return ago;
    }
}
