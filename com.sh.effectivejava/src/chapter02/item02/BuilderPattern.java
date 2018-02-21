package chapter02.item02;

public class BuilderPattern { // 불변 클래스

    private final int servingSize; // 필수 필드
    private final int servings; // 필수 필드
    private final int calories; // 선택 필드
    private final int fat; // 선택 필드
    private final int sodium; // 선택 필드
    private final int carbohydrate; // 선택 필드

    private BuilderPattern(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static class Builder implements javafx.util.Builder<BuilderPattern> {

        @Override
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

        private final int servingSize; // 필수 필드
        private final int servings; // 필수 필드

        // 선택 필드 - Default 값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) { // Builder 자신을 반환 - chaning method
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            if (val < 0) { // 불변 규칙 검사
                throw new IllegalStateException("carbohydrate value must be upper than 0.");
            } else {
                carbohydrate = val;
            }
            return this;
        }

        public Builder optionals(int... vals) {
            calories = vals[0];
            fat = vals[1];
            sodium = vals[2];
            carbohydrate = vals[3];
            return this;
        }

    }

}



