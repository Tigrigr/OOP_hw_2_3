public class Main {
    public static void main(String[] args) {

//       Создаем транспорт
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Car car1 = new Car("Car1", 4);
        Truck truck1 = new Truck("Truck1", 6);

//       Заводим траснпорт в гараж
        TransportService[] transportServices = {
                bicycle1,
                car1,
                truck1
        };
//       Заводим весь транспорт на станцию
        SrvsStation srvsStation = new SrvsStation();
        for (TransportService transportService : transportServices) {
            srvsStation.check(transportService);
            System.out.println();
        }
//      Заводим всех по отдельности
        srvsStation.check(bicycle1);
        System.out.println();
        srvsStation.check(car1);
        System.out.println();
        srvsStation.check(truck1);
    }
}