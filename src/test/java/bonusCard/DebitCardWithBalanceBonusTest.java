package bonusCard;

import org.example.bonusCard.DebitCardWithBalanceBonus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitCardWithBalanceBonusTest {

    @Test
    public void testTopUpYourBankCard() {
        DebitCardWithBalanceBonus card = new DebitCardWithBalanceBonus();
        card.topUpYourBankCard(1000);
        assertEquals(0.05, card.getBonus());
    }
}