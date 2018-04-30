package chapter11.item75;

import java.io.Serializable;

// 기본 직렬화 형태에 적합한 클래스
class Name implements Serializable {

    /**
     * 성. null이 아니어야 한다.
     *
     * @serial
     */
    private final String lastName;

    /**
     * 이름. null이 아니어야 한다.
     *
     * @serial
     */
    private final String firstName;

    /**
     * 중간 이름, 또는 없을 때는 null이다.
     *
     * @serial
     */
    private final String middleName;


    Name() {
        lastName = "l";
        firstName = "l";
        middleName = "l";
    }

}
