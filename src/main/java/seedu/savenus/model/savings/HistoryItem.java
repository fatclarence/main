package seedu.savenus.model.savings;

import seedu.savenus.model.util.Money;
import seedu.savenus.model.util.TimeStamp;

//@@author fatclarence
/**
 * Dictates a shared interface for Savings and Withdrawals
 */
public abstract class HistoryItem implements Comparable<HistoryItem> {

    final TimeStamp timeStamp;

    HistoryItem(TimeStamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    HistoryItem(String time) {
        this.timeStamp = new TimeStamp(time);
    }

    /**
     * For retrieving the timestamp of which the saving or the withdrawal was made.
     * @return a timestamp long in a string format.
     */
    public abstract String getTimeStampString();

    /**
     * For retrieving the timestamp of which the saving or withdrawal was made.
     * @return a timestamp object of the Saving or Withdrawal.
     */
    public TimeStamp getTimeStamp() {
        return timeStamp;
    };

    /**
     * For retrieving the amount of money of the saving or withdrawal.
     * @return the money object of the Saving or Withdrawal.
     */
    public abstract Money getMoney();

    @Override
    public int compareTo(HistoryItem other) {
        return this.getTimeStamp().getTimeStampInLocalDateTime()
                .compareTo(other.getTimeStamp().getTimeStampInLocalDateTime());
    }
}
