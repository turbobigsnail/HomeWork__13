public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку машины " + getModelName());
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины " + getModelName());
    }
    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
    }
}