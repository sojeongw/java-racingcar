package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    @DisplayName("움직일 수 있는 조건이 주어지면 전진한다")
    void shouldIncreasePosition() {
        Car car = new Car();
        car.move(true);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("움직일 수 있는 조건을 만족하지 않으면 전진하지 않는다")
    void shouldHaveSamePosition() {
        Car car = new Car();
        car.move(false);

        assertThat(car.getPosition()).isEqualTo(0);
    }
}