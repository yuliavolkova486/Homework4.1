public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int ageOfThePerson = 12;
        if (ageOfThePerson >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (ageOfThePerson < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }

        // Задача 2
        System.out.println("Задача 2");
        if (ageOfThePerson >= 7 && ageOfThePerson < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ageOfThePerson >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");
        int trainCarCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCarCapacity - seatingPlaces;
        int seatTicket = 47;
        int standTicket = 12;
        if (seatTicket < seatingPlaces) {
            System.out.println("Сидячих мест " + (seatingPlaces - seatTicket));
        }
        if (standTicket < standingPlaces) {
            System.out.println("Стоячих мест " + (standingPlaces - standTicket));
        }
        if (seatTicket >= seatingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standTicket >= standingPlaces) {
            System.out.println("Стоячих мест нет");
        }

    }
}