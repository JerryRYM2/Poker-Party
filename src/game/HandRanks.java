package game;

/**
 * Enum representing different hand ranks in a poker game.
 */
public enum HandRanks {
    HIGH_CARD(), // Represents a high card hand.
    PAIR(), // Represents a pair of hand.
    TWO_PAIR(), // Represents a two pair hand.
    THREE_OF_A_KIND(), // Represents a three of a kind hand.
    STRAIGHT(), // Represents a straight hand.
    FLUSH(), // Represents a flush hand.
    FULL_HOUSE(), // Represents a full house hand.
    FOUR_OF_A_KIND(), // Represents a four of a kind hand.
    STRAIGHT_FLUSH(), // Represents a straight flush hand.
    ROYAL_FLUSH(), ONE_PAIR(); // Represents a royal flush hand.

    private int value;

    /**
     * Constructor for HandRanks enum.
     */
    HandRanks() {
        this.value = value;
    }

    /**
     * Get the numerical value associated with the hand rank.
     * @return The numerical value of the hand rank.
     */
    public int getValue() {
        return this.value;
    }
}
