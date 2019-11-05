package seedu.savenus.model.savings;

import static java.util.Objects.requireNonNull;

import seedu.savenus.model.util.Money;
import seedu.savenus.model.util.TimeStamp;

//@@author fatclarence
/**
 * Dictates a shared interface for Savings and Withdrawals
 */
public class HistoryItem implements Comparable<HistoryItem> {

    private final Money savingsAmount;
    private final TimeStamp timeStamp;
    private final Boolean isWithdrawal;

    HistoryItem(Money money, TimeStamp timeStamp, boolean isWithdraw) {
        requireNonNull(money);
        requireNonNull(timeStamp);
        requireNonNull(isWithdraw);
        this.savingsAmount = money;
        this.timeStamp = timeStamp;
        this.isWithdrawal = isWithdraw;
    }

    HistoryItem(String money, String time, boolean isWithdraw) {
        requireNonNull(money);
        requireNonNull(time);
        requireNonNull(isWithdraw);
        this.savingsAmount = new Money(money);
        this.timeStamp = new TimeStamp(time);
        this.isWithdrawal = isWithdraw;
    }

    /**
     * For retrieving the timestamp of which the saving or the withdrawal was made.
     * @return a timestamp long in a string format.
     */
    public String getTimeStampString() {
        return getTimeStamp().toString();
    }

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
    public Money getMoney() {
        return savingsAmount;
    }

    @Override
    public String toString() {
        return String.format("%.02f", getMoney().getAmount());
    }

    @Override
    public int compareTo(HistoryItem other) {
        return this.getTimeStamp().getTimeStampInLocalDateTime()
                .compareTo(other.getTimeStamp().getTimeStampInLocalDateTime());
    }
}
