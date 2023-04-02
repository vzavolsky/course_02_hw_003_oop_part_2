public class Bicycle implements Vehicle {
    private String modelName;
    private int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String toString() {
        return "Обслуживаем велосипед: " + this.getModelName();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
