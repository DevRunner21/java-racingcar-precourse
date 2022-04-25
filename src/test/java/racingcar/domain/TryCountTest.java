package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TryCount 단위 테스트")
class TryCountTest {

    @Test
    void TryCount는_0_이하를_인자로_전달할_경우_예외를_던집니다() {
        int invalidTryCount = TryCount.MIN_TRY_COUNT - 1;

        assertThatThrownBy(() -> new TryCount(invalidTryCount))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void TryCount는_1_이상을_인자로_전달할_경우_인스턴스를_생성합니다() {
        TryCount tryCount = new TryCount(TryCount.MIN_TRY_COUNT + 1);

        assertThat(tryCount).isNotNull();
    }

}
