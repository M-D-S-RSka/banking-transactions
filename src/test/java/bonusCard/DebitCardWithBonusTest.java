package bonusCard;

import org.example.bonusCard.DebitCardWithBonus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DebitCardWithBonusTest {

    @Test
    public void testPaySuccess() {
        DebitCardWithBonus card = new DebitCardWithBonus();
        assertFalse(card.pay(1000));
        assertEquals(0.0, card.getBonus());
    }

    @Test
    public void testPayFailure() {
        DebitCardWithBonus card = new DebitCardWithBonus();
        assertFalse(card.pay(500));
        assertEquals(0.0, card.getBonus());
    }
}