import java.util.ArrayList;

public class QuickSorter {
    public void quicksort(int[] sortee, int lo, int hi) {
        if (lo < hi) {
            int p = partition(sortee, lo, hi);
            quicksort(sortee, lo, p-1);
            quicksort(sortee, p+1, hi);
        }
    }

    public int partition(int[] sortee, int lo, int hi) {
        int pivotIndex = lo;
        int pivotValue = sortee[lo];
        ArrayList<Integer> open = new ArrayList();
        open.add(lo+1);
        Integer lastClosed = null;
        for (int i=lo+1; i<=hi; i++) {
            if (sortee[i] < pivotValue) {
                int swapIndex = open.get(0);
                int tmp = sortee[i];
                sortee[i] = sortee[swapIndex];
                sortee[swapIndex] = tmp;
                open.remove(0);
                lastClosed = new Integer(swapIndex);
            } else {
                open.add(i);
            }
        }
        if (lastClosed != null) {
            int tmp = sortee[pivotIndex];
            sortee[pivotIndex] = sortee[lastClosed];
            sortee[lastClosed] = tmp;
            pivotIndex = lastClosed;
        }
        return pivotIndex;
    }

    public void sort(int[] list) {
        quicksort(list, 0, list.length-1);
    }

    public void main(String[] args) {
        int[] list = new int[]{8, 3, 2, 7, 1, 9};
        sort(list);
    }
}
