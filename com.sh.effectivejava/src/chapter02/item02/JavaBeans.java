package chapter02.item02;

public class JavaBeans {

    private int servingSize = 0; // 필수 필드
    private int servings = 0; // 필수 필드
    private int calories = 0; // 선택 필드
    private int fat = 0; // 선택 필드
    private int sodium = 0; // 선택 필드
    private int carbohydrate = 0; // 선택 필드

    // 기본 생성자
    public JavaBeans() {

    }

    // setter
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

}


