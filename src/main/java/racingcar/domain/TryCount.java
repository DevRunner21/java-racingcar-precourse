package racingcar.domain;

import java.util.Objects;

public class TryCount {

    private static final String TRY_COUNT_INVALID_MESSAGE = "[ERROR] Try 횟수는 1 이상만 입력이 가능합니다.";
    public static final int MIN_TRY_COUNT = 1;

    private final int count;

    public TryCount(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(int count) {
        if (count < MIN_TRY_COUNT) {
            throw new IllegalArgumentException(TRY_COUNT_INVALID_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TryCount tryCount = (TryCount) o;
        return count == tryCount.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

}
