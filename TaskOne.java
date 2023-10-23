public class TaskOne {
    public static void main(String[] args) {

        Character[] sortedArray = {'a', 'a', 'c', 'c', 'd', 'e', 'e', 'g', 'g'};
        Character singleElement = sortSingle(sortedArray);
        System.out.println("Вот неповторяющийся элемент: " + singleElement);

        Character singleElementBinary = searchBinary(sortedArray);
        System.out.println("Вот неповторяющийся элемент: " + singleElementBinary);
    }

       //С помощью обычного цикла
    private static Character sortSingle(Character[] sortedArray) {
        for (int i = 0; i < sortedArray.length - 1; i+=2) {
            if (sortedArray[i] != sortedArray[i +1 ]) {
                return sortedArray[i];
            }

        }
        return sortedArray[sortedArray.length - 1];


    }
    //Посредством адаптации метода бинарного поиска c помощью GPT чата
    private static Character searchBinary(Character[] sortedArray) {
        int start = 0;
        int end = sortedArray.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start) / 2;

            if (middle % 2 == 1) {
                middle--; // Приведем middle к четному индексу
            }

            if (sortedArray[middle].equals(sortedArray[middle + 1])) {
                start = middle + 2;
            } else {
                end = middle;
            }
        }

        return sortedArray[start];
    }
}



