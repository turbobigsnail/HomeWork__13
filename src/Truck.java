public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика " + getModelName());
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + getModelName());
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + getModelName());
    }
    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}