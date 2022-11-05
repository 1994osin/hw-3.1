public class Main {
    public static void main(String[] args) {
        // Task 1
        int age = 28;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило. Нужно немного подождать");
        }

        // Task 2
        int humanAge = 18;
        if (humanAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (humanAge >= 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }

        // Task 3
        int totalSeats = 102;
        int seating = 60;
        int seatsTaken = 104;
        if (seatsTaken < seating) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        }
        if (seatsTaken >= seating) {
            System.out.println("В вагоне только стоячие места");
        }
        if (seatsTaken >= totalSeats) {
            System.out.println("В вагоне нет мест");
        }
    }
}