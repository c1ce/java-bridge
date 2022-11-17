package bridge;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BridgeGameTest {

    @Test
    void 움직임_테스트() {
        //GIVEN
        BridgeGame bridgeGame = new BridgeGame(List.of("U","D","D"));
        //WHEN
        boolean moveCheck = bridgeGame.move("U");
        //THEN
        assertEquals(moveCheck,true);
    }
    @Test
    void 움직임_테스트_실패() {
        //GIVEN
        BridgeGame bridgeGame = new BridgeGame(List.of("U","D","D"));
        //WHEN
        boolean moveCheck = bridgeGame.move("D");
        //THEN
        assertEquals(moveCheck,false);
    }

}