package Chapter5;

public class ChristmasSong {
    private static String gift;
    private static String day;

    public static void getGift(String whatGift) {
        switch (whatGift) {
            case "1":
                day = "First";
                gift = "A partridge in a pear tree";
                break;

            case "2":
                day = "Second";
                gift =  "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "3":
                day = "Third";
                gift =  "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "4":
                day = "Fourth";
                gift =  "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "5":
                day = "Fifth";
                gift =  "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "6":
                day = "Sixth";
                gift =  "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "7":
                day = "Seventh";
                gift =  "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "8":
                day = "Eighth";
                gift =  "Eight Maids a Milking \n" +
                        "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "9":
                day = "Ninth";
                gift =  "Nine Ladies Dancing \n" +
                        "Eight Maids a Milking \n" +
                        "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "10":
                day = "Tenth";
                gift =  "Ten Lords a Leaping \n" +
                        "Nine Ladies Dancing \n" +
                        "Eight Maids a Milking \n" +
                        "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "11":
                day = "Eleventh";
                gift =  "Eleven Pipers Piping \n" +
                        "Ten Lords a Leaping \n" +
                        "Nine Ladies Dancing \n" +
                        "Eight Maids a Milking \n" +
                        "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            case "12":
                day = "Twelfth";
                gift =  "Twelve Drummers Drumming \n" +
                        "Eleven Pipers Piping \n" +
                        "Ten Lords a Leaping \n" +
                        "Nine Ladies Dancing \n" +
                        "Eight Maids a Milking \n" +
                        "Seven Swans a Swimming \n" +
                        "Six Geese a Laying \n" +
                        "Five Golden Rings \n" +
                        "Four Calling Birds \n" +
                        "Three French Hens \n" +
                        "Two Turtle Doves \n" +
                        "and a partridge in a pear tree";
                break;

            default:
                day = "Unknown";
                gift = "Nothing.";


        }
    }
    public static String whichGift() {
        return gift;
    }
    public static String whatDay() {
        return day;
    }

}
