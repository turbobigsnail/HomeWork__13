public class Bicycle extends Transport {

    public String modelName;
    public int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда " + getModelName());
    }
    @Override
    public void transportService() {
        updateTyre();
    }
}