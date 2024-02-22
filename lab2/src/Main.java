public class Main {
    private static Phone[] phoneArray = new Phone[5];

    private static void createPhoneArray() {
        phoneArray[0] = new Phone(1, "Ivanov", "Ivan", "Ivanovich", "123456789", 50, 20);
        phoneArray[1] = new Phone(2, "Koval", "Nazar", "Ivanovich", "11241414", 29, 100);
        phoneArray[2] = new Phone(3, "Derevetskyi", "Oleh", "Ivanovich", "543421311", 80, 56);

    }

    private static void filterByCityCallDuration(int duration) {
        for (Phone phone : phoneArray) {
            if (phone != null && phone.getCityCallDuration() > duration) {
                System.out.println(phone);
            }
        }
    }


    private static void filterByIntercityCalls() {
        for (Phone phone : phoneArray) {
            if (phone != null && phone.getIntercityCallDuration() > 0) {
                System.out.println(phone);
            }
        }
    }



    private static void filterByAccountNumber(String accountNumber) {
        for (Phone phone : phoneArray) {
            if (phone != null && phone.getAccountNumber().equals(accountNumber)) {
                System.out.println(phone);
            }
        }
    }


    public static void main(String[] args) {
        createPhoneArray();

        System.out.println("Абоненти з міським часом розмов більше 30 хвилин:");
        filterByCityCallDuration(30);

        System.out.println("Абоненти, які користувались міжміським зв'язком:");
        filterByIntercityCalls();

        System.out.println("Абоненти з номером рахунку '123456789':");
        filterByAccountNumber("123456789");
    }
}