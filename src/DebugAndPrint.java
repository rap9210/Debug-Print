public class DebugAndPrint {
    public static void main(String[] args){
        ////1.Create an array to hold the numbers 1-10.
        int numList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String numList_str = "Numbers 1 through 10: [";
        for (int i = 0; i <= 9; i++) {
            if (i<9) {
                numList_str += numList[i] + ", ";
            }
            else {
                numList_str += numList[i] + "]";
                System.out.println(numList_str);
            }
        }



////2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
//        int numList () = ({1, 2, 3, 4, 5, 6, 7, 8, 9, 10});  << no need to reinitialize array
        int total = 0;
        for (int i = 0; i <= 9; i++) {
            total += numList[i];
        }
        System.out.println("The total of the numbers is " + total+".");
    }
}
