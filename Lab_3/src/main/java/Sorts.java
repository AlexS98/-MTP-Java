class Sorts {
    private int[] sortArray;

    static void BubbleSort(int[] sortArray) {
        int n = sortArray.length;
        while (n > 0) {
            n--;
            for (int i = 0; i < n; i++) {
                if (sortArray[i] > sortArray[i + 1]) exchange(sortArray, i, i + 1);
            }
        }
    }

    static void CocktailSort(int[] sortArray) {
        int n = 0;
        while (n < ((sortArray.length + 1) / 2)) {
            for (int i = n; i < sortArray.length - (n + 1); i++) {
                if (sortArray[i] > sortArray[i + 1]) exchange(sortArray, i, i + 1);
            }
            for (int i = sortArray.length - (n + 1); i > n; i--) {
                if (sortArray[i] < sortArray[i - 1]) exchange(sortArray, i, i - 1);
            }
            n++;
        }
    }

    static void QuickSort(int[] sortArray, int begin, int end) {
        int left = begin, right = end;
        int pivot = sortArray[(left + right) / 2];
        while (left <= right) {
            while (sortArray[left] < pivot) left++;
            while (sortArray[right] > pivot) right--;
            if (left <= right) exchange(sortArray, left++, right--);
        }
        if (begin < right) QuickSort(sortArray, begin, right);
        if (end > left) QuickSort(sortArray, left, end);
    }

    static void OddEvenSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = ((i % 2) == 0) ? 0 : 1; j < sortArray.length - 1; j += 2) {
                if (sortArray[j] > sortArray[j + 1]) {
                    exchange(sortArray, j, j + 1);
                }
            }
        }
    }

    static void CycleSort(int[] sortArray){
        for (int cycleStart = 0; cycleStart < sortArray.length - 1; cycleStart++) {
            int val = sortArray[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < sortArray.length; i++) if (sortArray[i] < val) pos++;
            if (pos == cycleStart) continue;
            while (val == sortArray[pos]) pos++;
            int tmp = sortArray[pos];
            sortArray[pos] = val;
            val = tmp;
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < sortArray.length; i++) if (sortArray[i] < val) pos++;
                while (val == sortArray[pos]) pos++;
                tmp = sortArray[pos];
                sortArray[pos] = val;
                val = tmp;
            }
        }
    }

    static void exchange(int[] array, int n1, int n2) {
        int var = array[n1];
        array[n1] = array[n2];
        array[n2] = var;
    }
}
