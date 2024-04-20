package cards;

import org.example.cards.DebitCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitCardTest {

    @Test
    public void testGetAvailableFundsInfo() {
        DebitCard card = new DebitCard();
        card.topUpYourBankCard(2000);
        assertEquals("Available funds in Debit Card: 2000.0", card.getAvailableFundsInfo());
    }
}