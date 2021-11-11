package study;

import java.util.Objects;

public class InputNumber {

    private final int value;

    public InputNumber(int number) {
        this.value = number;
    }

    public InputNumber(String text) {
        this(Integer.parseInt(text));
    }

    public int getValue() {
        return this.value;
    }

    public InputNumber add(InputNumber second) {
        return new InputNumber(this.value + second.value);
    }

    public InputNumber subtract(InputNumber second) {
        return new InputNumber(this.value - second.value);
    }

    public InputNumber multiply(InputNumber second) {
        return new InputNumber(this.value * second.value);
    }

    public InputNumber divide(InputNumber second) {
        validate(second);
        return new InputNumber(this.value / second.value);
    }

    private void validate(InputNumber second) {
        if(second.value == 0) {
            throw new IllegalArgumentException("분모는 0이 될 수 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputNumber that = (InputNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "InputNumber{" +
                "inputNumber=" + value +
                '}';
    }
}
