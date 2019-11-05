package seedu.savenus.model.savings;

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

    // Default starting savings amount.
    public Savings() {
        super(new Money("0.00"), new TimeStamp(TimeStamp.generateCurrentTimeStamp()), true);
    }

    public Savings(String savings, String time) {
        super(savings, time, true);
    }
}
