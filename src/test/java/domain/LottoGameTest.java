package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoGameTest {

    @Test
    @DisplayName("로또 게임을 생성하는 경우")
    void createLottoGame() {
        int amount = 5000;
        Money money = new Money(amount);

        LottoGame lottoGame = new LottoGame(money);

        assertThat(lottoGame).isNotNull();
    }
}
