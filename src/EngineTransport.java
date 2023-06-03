public abstract class EngineTransport extends Transport {

    //    Асбтрактный родитель всего двигательного транспорта, наследуется от родителя всех транспортов
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    //      Перезаписываем метод родителя, теперь обслуживаем колеса и движки всего двигательного транспорта
    @Override
    public void services() {
        super.services();
        checkEngine();
    }
}
