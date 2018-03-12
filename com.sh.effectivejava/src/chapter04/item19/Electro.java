package chapter04.item19;

class Electro implements PhysicalConstants {

    void doSomething() {
        double an = AVOGADROS_NUMBER;
        double bc = BOLTZMANN_CONSTANT;
        double em = ELECTRON_MASS;

        // ...
    }

    void doSomethings() {
        double an = PhysicalConstantsClass.AVOGADROS_NUMBER;
        double bc = PhysicalConstantsClass.BOLTZMANN_CONSTANT;
        double em = PhysicalConstantsClass.ELECTRON_MASS;

        // ...
    }

}
