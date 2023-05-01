package com.academy.burtsevich.lesson6;

public class Task3 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus A310", 10023, 183, 164000, 3700);
        Airplane airplane2 = new Airplane("Airbus A320", 10024, 149, 73500, 4900);
        Airplane airplane3 = new Airplane("Boeing-737", 10025, 114, 52800, 2518);
        Quadcopter quadcopter1 = new Quadcopter("DJI Mavic Pro", 104, 0, 1, 4);
        Quadcopter quadcopter2 = new Quadcopter("DJI Mavic", 105, 0, 1, 2);
        Helicopter helicopter1 = new Helicopter("Robinson R44", 2345, 3, 1089, 680);
        Helicopter helicopter2 = new Helicopter("Robinson R66", 2345, 4, 1225, 602);
        Baloon baloon1 = new Baloon("07 ATC", 106, 4, 270, 20);


        Aircraft[] allAircrafts = {airplane1, airplane2, airplane3, quadcopter1, quadcopter2, helicopter1, helicopter2, baloon1};


        System.out.println("###########################################");
        System.out.println("Общая пассажировместимость авиакомпании составляет " + Airline.getTotalCapacity(allAircrafts) + " мест");
        System.out.println("Пассажировместимость определенных в/с составляет " + Airline.getTotalCapacity(airplane1, airplane2));
        System.out.println("Общая грузоподъемность компании составляет " + Airline.getTotalLoadCapacity(allAircrafts) + " кг");
        System.out.println("Грузоподъемность определенных в/с компании составляет " + Airline.getTotalLoadCapacity(airplane1, airplane2, airplane3) + " кг");
        System.out.println("Средняя максимальная дальность полета воздушного судна авиакомпании составляет " + Airline.getAverageRange(allAircrafts) + " км");
        System.out.println("Средняя максимальная дальность полета вертолетов авиакомпании составляет " + Airline.getAverageRange(helicopter1, helicopter2) + " км");
        System.out.println("###########################################");
        System.out.println("Сортируем авиапарк по дальности полета:");
        Airline.sortByRange(allAircrafts);
        System.out.println("###########################################");
        System.out.println("Ищем воздушное судно по заданным параметрам: ");
        Airline.searchByParameter(183, 164000, 3700, allAircrafts);

    }
}
