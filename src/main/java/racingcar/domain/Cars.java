package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import racingcar.dto.MoveResult;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        validate(cars);
        this.cars.addAll(cars);
    }

    private void validate(List<Car> cars) {
        if (Objects.isNull(cars)) {
            throw new IllegalArgumentException("cars는 Null일 수 없습니다.");
        }
        if (cars.isEmpty()) {
            throw new IllegalArgumentException("cars는 Enpty 일 수 없습니다.");
        }
    }

    public MoveResult move() {
        MoveResult moveResult = new MoveResult();
        for (Car car : cars) {
            Car movedCar = car.move();
            moveResult.addMoveLog(car.isMoved(movedCar));
        }

        return moveResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

}
