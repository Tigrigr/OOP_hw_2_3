public class Truck extends EngineTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
//Перезаписываем метод для грузовиков
    @Override
    public void services() {
        super.services();
        checkTrailer();
    }
}
