package by.it.hutnik.refabrishedTasks_AKhmelev.urok01_04;

class MySortedPiramida {
    public static void main(String[] args) {
        int[] massiv = {6, 1, 8, 3, 5, 2, 4};
        int[] arrVirtSort = new int[massiv.length];
        int i = 0;
        int j = 0;
        int p = 0;
        int parent1 = (i - 1) / 2;
        int parent2 = (j - 1) / 2;
        int dother1 = 2 * p + 1;
        int dother2 = 2 * p + 2;

        for (int k = 0; k < massiv.length; k++) {
            for (int l = 0; l < arrVirtSort.length - massiv.length + 1; l++) {
                //arrVirtSort[l] =
            }
            p = massiv[k];
            
        }

    }
}
