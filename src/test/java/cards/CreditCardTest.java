package cards;

import org.example.cards.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    public void testTopUpYourBankCard() {
        CreditCard card = new CreditCard(5000);
        card.topUpYourBankCard(2000);
        assertEquals(2000, card.getBalance());
    }

    @Test
    public void testPaySufficientFunds() {
        CreditCard card = new CreditCard(5000);
        card.topUpYourBankCard(3000);
        assertTrue(card.pay(2000));
        assertEquals(1000, card.getBalance());
    }

    @Test
    public void testPayWithCredit() {
        CreditCard card = new CreditCard(5000);
        card.topUpYourBankCard(3000);
        assertTrue(card.pay(4000));
        assertEquals(-1000, card.getCreditBalance());
    }

    @Test
    public void testGetAvailableFundsInfo() {
        CreditCard card = new CreditCard(5000);
        card.topUpYourBankCard(3000);
        assertEquals("Available funds in Credit Card: Balance: 3000.0, Credit Limit: 5000.0", card.getAvailableFundsInfo());
    }
}