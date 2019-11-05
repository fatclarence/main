package seedu.savenus.model.savings;

import static java.util.Objects.requireNonNull;

import seedu.savenus.model.util.Money;
import seedu.savenus.model.util.TimeStamp;

//@@author fatclarence
/**
 * Acts as the amount of money to be added into the {@code SavingsAccount} of the user
 * and also the amount of money to deduct from the {@code Wallet} of the user.
 */
public class Savings extends HistoryItem {

    public static final String MESSAGE_CONSTRAINTS =
            "Please provide a savings amount with 0 or 2 decimal places.\n"
            + "For example: 1.50 or 200\n"
            + "Note that you also cannot save 0 or a negative amount of money!";

    // Identity fields of a saving.
    private final Money savingsAmount; // the amount to be saved.

    // Default starting savings amount.
    public Savings() {
        super(new TimeStamp(TimeStamp.generateCurrentTimeStamp()));
        savingsAmount = new Money("0.00");
    }

    public Savings(String savings, String time) {
        super(time);
        requireNonNull(savings);
        savingsAmount = new Money(savings);
    }

    public String getTimeStampString() {
        return timeStamp.toString();
    }

    public TimeStamp getTimeStamp() {
        return timeStamp;
    }

    public Money getMoney() {
        return this.savingsAmount;
    }

    @Override
    public String toString() {
        return String.format("%.02f", getMoney().getAmount());
    }


}
