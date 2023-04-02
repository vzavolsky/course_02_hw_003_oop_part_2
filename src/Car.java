public class Car extends Bicycle {
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public String toString() {
        return "Обслуживаем легковое авто: " + this.getWheelsCount();
    }
}
