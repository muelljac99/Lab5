import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * types of bank accounts.
     */
    public enum BankAccountType {
        /**
         * Checking Acct.
         */
        CHECKINGS,
        /**
         * Savings Acct.
         */
        SAVINGS,
        /**
         * Student Acct.
         */
        STUDENT,
        /**
         * Workplace Acct.
         */
        WORKPLACE
    }
    /**
     * # of accounts opened.
     */
    private static int totalAccounts = 0;
    /**
     * Random number generator.
     */
    private Random random = new Random();
    /**
     * The account number.
     */
    private int accountNumber;
    /**
     * the type of bank account.
     */
    private BankAccountType accountType;
    /**
     * the balance of the account.
     */
    private double accountBalance;
    /**
     * the name of the owner of the account.
     */
    private String ownerName;
    /**
     * The interest rate on the account.
     */
    private double interestRate;
    /**
     * The amount of interest earned on the account.
     */
    private double interestEarned;

    /**
     * BankAccount constructor.
     * @param name of the owner of the account
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        this.accountBalance = 0.0;
        totalAccounts++;
        this.accountNumber = random.nextInt();
    }

    /**
     * bank account default constructor.
     */
    public BankAccount() {
        this.ownerName = "";
        this.accountType = null;
        this.accountBalance = 0.0;
        totalAccounts++;
        this.accountNumber = random.nextInt();
    }
    /**
     * Uses static variable to get number of bank accounts opened.
     *
     * @return the total number of accounts
     */
    public static int getNumberOfAccount() {
        return totalAccounts;
    }
    /**
     * returns account number.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     *returns account Type.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * returns owner's name.
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * returns account balance.
     * @return account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * returns interest earned.
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * sets owners name.
     * @param named name of the owner of the account
     */
    public void setOwnerName(final String named) {
        this.ownerName = named;
    }

    /**
     * Sets account type.
     * @param typeOfAccount new account type.
     */
    public void setAccountType(final BankAccountType typeOfAccount) {
        this.accountType = typeOfAccount;
    }
    /**
     * Sets interest rate.
     * @param rate interest rate
     */
    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }

    /**
     * Sets account balance.
     * @param nBalance account balance
     */
    public void setAccountBalance(final double nBalance) {
        this.accountBalance = nBalance;
    }
}
