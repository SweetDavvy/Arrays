public class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Определение дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Расчет количества топлива, необходимого транспортному
// средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;

    }
}
