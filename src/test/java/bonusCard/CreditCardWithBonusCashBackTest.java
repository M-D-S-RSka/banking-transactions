package bonusCard;

import org.example.bonusCard.CreditCardWithBonusCashBack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardWithBonusCashBackTest {

    @Test
    public void testPayBelow5000() {
        CreditCardWithBonusCashBack card = new CreditCardWithBonusCashBack(6000);
        assertTrue(card.pay(4000));
        assertEquals(0, card.getBonus());
    }

    @Test
    public void testPayAbove5000() {
        CreditCardWithBonusCashBack card = new CreditCardWithBonusCashBack(6000);
        assertTrue(card.pay(6000));
        assertEquals(300, card.getBonus());
    }

    @Test
    public void testGetMoneyFromBonus() {
        CreditCardWithBonusCashBack card = new CreditCardWithBonusCashBack(6000);
        card.pay(6000);
        card.getMoneyFromBonus();
        assertEquals(300, card.getBalance());
        assertEquals(0, card.getBonus());
    }

    @Test
    public void testGetAvailableFundsInfo() {
        CreditCardWithBonusCashBack card = new CreditCardWithBonusCashBack(6000);
        card.pay(6000);
        assertEquals("Available funds in Credit Card: Balance: 0.0, Bonus: 300.0", card.getAvailableFundsInfo());
    }
}