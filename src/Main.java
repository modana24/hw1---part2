import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 5
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);

        //task 6
        Integer value2 = 33;
        changeValue2(value2);
        System.out.println("value2 = " + value2);

        //task 7
        Integer[] value3 = new Integer[]{3, 4};
        System.out.println("value3 = " + Arrays.toString(value3));

        //task 8
        Integer[] value4 = new Integer[]{3, 4};
        System.out.println("value4 = " + Arrays.toString(value4));

        //task 9
        Person.changePerson();

        }


        public static void changeValue(int value) {
            value = 22;
        }


        public static void changeValue2(Integer value2) {
            value2 = 22;
        }

        public static void changeValue3(Integer[]value3) {
            value3 = new Integer[]{1, 2};
        };

        public static void changeValu4(Integer[]value4) {
            value4 = new Integer[]{99};
        };



    }

