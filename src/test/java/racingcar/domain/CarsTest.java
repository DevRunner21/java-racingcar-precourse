package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.dto.MoveResult;

@DisplayName("Cars 단위 테스트")
class CarsTest {

    @Test
    void Cars는_Null이나_빈_리스트가_인자로_주어진다면_예외를_던집니다() {
        List<Car> emptyList = new ArrayList<Car>();

        assertAll(
                () -> {
                    assertThatThrownBy(() -> new Cars(null))
                            .isInstanceOf(IllegalArgumentException.class);
                },
                () -> {
                    assertThatThrownBy(() -> new Cars(emptyList))
                            .isInstanceOf(IllegalArgumentException.class);
                }
        );
    }

    @Test
    void move_메서드는_주어진_전략에_따라_Car들을_전진시킨_후_MoveLog를_반환합니다() {
        List<String> inputCarNames = Arrays.asList("a", "b", "c", "d", "e");
        MoveStrategy fakeAbsoluteMoveStrategy = Position::moveOneStep;
        List<Car> carList = new ArrayList<>();
        for (String name : inputCarNames) {
            carList.add(new Car(name, fakeAbsoluteMoveStrategy));
        }
        Cars cars = new Cars(carList);
        MoveResult expected = new MoveResult(
                Arrays.asList(true, true, true, true, true)
        );

        MoveResult moveResult = cars.move();

        assertThat(moveResult).isEqualTo(expected);
    }

}
