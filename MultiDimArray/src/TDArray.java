public class TDArray {
    public static void main(String[] args){
        int[][] arr = new int[100][30];
        int i =0, j = 0, k = 0;

        System.out.println("Original array");
        while(i < arr.length){
            while(j < arr[i].length){
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

        System.out.println("\n");
        System.out.println("Array after adding 1");

        i = 0;
        j = 0;

        while(i < arr.length){
            while(j < arr[i].length){
                System.out.print(arr[i][j] + 1 + " ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

        System.out.println("\n");
        System.out.println("Odd numbers or numbers divisible by 8");
        i = 0;
        j = 0;

        while(i < arr.length){
            while(j < arr[i].length){
                int even = arr[i][j] % 2;
                int divisible = arr[i][j] % 8;

                switch(even){
                    case 1:
                        System.out.print(arr[i][j] + " ");
                        break;
                    default:
                        switch(divisible){
                            case 0:
                                System.out.print(arr[i][j] + " ");
                                break;
                        }
                }
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
