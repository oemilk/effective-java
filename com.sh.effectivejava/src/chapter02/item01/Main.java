package chapter02.item01;

import java.util.Random;

public class Main {

    static Provider DEFAULT_PROVIDER = () -> new Service() {
        @Override
        public String toString() {
            return "Default service";
        }
    };

    static Provider FIRST_PROVIDER = () -> new Service() {
        @Override
        public String toString() {
            return "First service";
        }
    };

    static Provider SECOND_PROVIDER = () -> new Service() {
        @Override
        public String toString() {
            return "Second service";
        }
    };

    public static void main(String[] args) {

        // public static factory method

        InstanceTest instanceTest01 = new InstanceTest();
        InstanceTest instanceTest02 = InstanceTest.newInstance();

        BigInteger bigInteger01 =
                new BigInteger(10, 10, new Random());
        BigInteger bigInteger02 =
                BigInteger.probablePrime(10, 10, new Random());

        Video video01 = new Video("love");
        Video video02 = Video.find("love");

        Video video03 = new Video("http://test.co.kr");
        Video video04 = Video.from("http://test.co.kr");

        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("first", FIRST_PROVIDER);
        Services.registerProvider("second", SECOND_PROVIDER);

        Service service01 = Services.newInstance();
        Service service02 = Services.newInstance("first");
        Service service03 = Services.newInstance("second");
    }

}
