public class Truck extends Car {
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public String toString() {
        return "Обслуживаем грузовое авто: " + this.getModelName();
    }
}
