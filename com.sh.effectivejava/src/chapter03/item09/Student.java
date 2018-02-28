package chapter03.item09;

import java.util.Arrays;

public class Student {

    boolean isMan;
    int age;
    long birth;
    float height;
    double weight;
    String name;
    Arrays grades;

    @Override
    public boolean equals(Object obj) {
        // with isMan, age, birth, height, weight, name, grades
        return true; //temp
    }

    @Override
    public int hashCode() {
        int result = 17; // not 0
        result = 31 * result + (isMan ? 1 : 0);
        result = 31 * result + (age);
        result = 31 * result + ((int) (birth ^ (birth >>> 32)));
        result = 31 * result + (Float.floatToIntBits(height));
        result = 31 * result + ((int) (Double.doubleToLongBits(weight)
                ^ (Double.doubleToLongBits(weight) >>> 32)));
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (grades.hashCode());
        return result;
    }

}

