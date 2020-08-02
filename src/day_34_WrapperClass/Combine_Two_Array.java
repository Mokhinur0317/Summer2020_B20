package day_34_WrapperClass;

public class Combine_Two_Array {

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2) {
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for (Integer each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Integer each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
//================================================================
public static Double[] combine2Arrays(Double[] arr1,Double[] arr2) {
    Double[] arr3 = new Double[arr1.length + arr2.length];

    int i = 0;
    for (Double each : arr1) {
        arr3[i] = each;
        i++;
    }

    for (Double each : arr2) {
        arr3[i] = each;
        i++;
    }

    return arr3;
}

//=========================================================================

    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2) {
       Character[] arr3 = new Character[arr1.length + arr2.length];

        int i = 0;
        for (Character each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (Character each : arr2) {
            arr3[i] = each;
            i++;
        }

        return arr3;
    }
}
