public class CalendarConverter {
    private static int monday = 1;
    private static int tuesday = 2;
    private static int wednesday = 3;
    private static int thursday = 4;
    private static int friday = 5;
    private static int saturday = 6;
    private static int sunday = 7;

    static String convertDayToString(int dayNumber) {

        if (dayNumber == monday) {
            dayNumber = monday;
        } else if (dayNumber == tuesday) {
            dayNumber = tuesday;
        } else if (dayNumber == wednesday) {
            dayNumber = wednesday;
        } else if (dayNumber == thursday) {
            dayNumber = thursday;
        } else if (dayNumber == friday) {
            dayNumber = friday;
        } else if (dayNumber == saturday) {
            dayNumber = saturday;
        } else if (dayNumber == sunday) {
            dayNumber = sunday;

        }

        switch (dayNumber) {
            case 1:
                return "Poniedziałek";

            case 2:
                return "Wtorek";
            case 3:
                return "Środa";
            case 4:
                return "Czwartek";
            case 5:
                return "Piątek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
        }
        return "błąd";
    }
}

