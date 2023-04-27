package com.academy.burtsevich.lesson6;

public class Task3 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus A310", 10023, 183, 164000, 3700);
        Airplane airplane2 = new Airplane("Airbus A320", 10024, 149, 73500, 4900);
        Airplane airplane3 = new Airplane("Boeing-737", 10025, 114, 52800, 2518);
        Quadcopter quadcopter1 = new Quadcopter("DJI Mavic Pro", 104, 0, 1,4);
        Quadcopter quadcopter2 = new Quadcopter("DJI Mavic", 105, 0, 1,2);
        Helicopter helicopter1 = new Helicopter("Robinson R44", 2345, 3, 1089, 680);
        Helicopter helicopter2 = new Helicopter("Robinson R66", 2345, 4, 1225, 602);
        Baloon baloon1 = new Baloon("07 ATC", 106, 4, 270, 20);


        Aircraft[] aircrafts = {airplane1, airplane2, airplane3, quadcopter1, quadcopter2, helicopter1, helicopter2, baloon1};

        if (aircrafts.length != 0){
            System.out.println("###########################################");
            System.out.println("Общая пассажировместимость авиакомпании составляет " + Airline.getTotalCapacity(aircrafts) + " мест");
            System.out.println("Общая грузоподъемность компании составляет " + Airline.getTotalLoadCapacity(aircrafts)+ " кг");
            System.out.println("Средняя максимальная дальность полета воздушного судна авиакомпании составляет " + Airline.getAverageRange(aircrafts) + " км");
            System.out.println("###########################################");
            System.out.println("Сортируем авиапарк по дальности полета:");
            Airline.sortByRange(aircrafts);
            System.out.println("###########################################");
            System.out.println("Ищем воздушное судно по заданным параметрам: ");
            Airline.searchByParameter(183, 164000, 3700, aircrafts);
        } else {
            System.out.println("Список авиатранспорта не может быть пустым!");
//            кривая проверка для выполнения условия "...их количество может быть от 1 до бесконечности..."
            /* идея этого условия не в том, что бы проверять сколько там их.
             а в том, что их может быть и 1 штука и много. для этого не подходит массив
            точнее для того что бы передать подходит, а вот метод авиакомпании должен принимать не массив, а кое-что другое

            подсказка: могу передать в метод хоть один объект, хоть два, хоть массив объектов.

            ну и раз уже все равно поправлять, сделай авиакомпанию тоже объектом и методы не статическими, как в предыдущем примере
            */
        }
    }
}
