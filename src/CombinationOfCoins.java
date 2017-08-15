//
//public class CombinationOfCoins {
//    int[] coinsArray;
//    int number, count = 0;
//
//    public static void main(String[] args) {
//        CombinationOfCoins combinationOfCoins = new CombinationOfCoins();
//        combinationOfCoins.number = 5;
//        combinationOfCoins.coinsArray = new int[]{1, 2, 3};
//        int sum = 0;
////        for (int i = 0; i < combinationOfCoins.coinsArray.length; i++) {
//        combinationOfCoins.combinationOfNumber(combinationOfCoins.number, 0, sum, 0, 1);
////            System.out.println("**********");
//
////        }
//
//    }
//
//    public void combinationOfNumber(int number, int index, int sum, int mainIndex, int currentIncrement) {
//        int nextIndex = index + 1;
//        for (int i = 1; i <= number / coinsArray[index]; i++) {
//            sum += coinsArray[index] * i;
//            if (index == mainIndex) {
//            System.out.println("main Index " + sum);
//                currentIncrement = i;
//            }
//            if (sum == number) {
//                count++;
//                sum = 0;
//                System.out.println("count ==> " + count);
//            } else if (sum > number) {
//                sum = 0;
//            }
//            System.out.println(coinsArray[index] + "X" + i);
//            System.out.println("sum ==> " + sum);
//            if (nextIndex < coinsArray.length) {
//                combinationOfNumber(number, nextIndex, sum, mainIndex, currentIncrement);
//                if (nextIndex == coinsArray.length - 1) {
//                    sum = coinsArray[mainIndex] * currentIncrement;
//                    System.out.println("************  " + sum);
//                }
//            }
//        }
//    }
//
//}
//
//
////1*1 2*1 3*1
////1*1 2*2 3*1   1
////1*2 2*1 3*1
////1*2 2*2 3*1
////1*3 2*1 3*1
////1*3 2*2 3*1
////1*4 2*1 3*1
////1*4 2*2 3*1
////1*5 2*1 3*1
////1*5 2*2 3*1