//package algorithm_sites.codility;
//
//public class KkoMoProblem02 {
//
//    private int count = 1;
//    private boolean[] learned;
//
//    public int solution(int[] T, int[] A) {
//        learned = new boolean[T.length];
//
//        for (int newSkillIndex : A) {
//            recursive(T, newSkillIndex);
//        }
//
//        return count;
//    }
//
//    private void recursive(int[] T, int newSkillIndex) {
//        if (newSkillIndex == 0) {
//            return;
//        }
//
//        if (!learned[newSkillIndex]) {
//            learned[newSkillIndex] = true;
//            ++count;
//
//            recursive(T, T[newSkillIndex]);
//        }
//    }
//
//    /**
//     * 어레이에서 조상을 따라간다.
//     * T 는 부모번호를 나타내고, A 는 아직 안배운(배워야 할) 스킬의 시작인덱스를 말한다.
//     *
//     * T (1~ 10,0000)
//     * A (1~ T)
//     * T, A 둘 다 (0~ N-1 사이의 정수)
//     */
////    static boolean[] learned;
////    static int count;
////    static int[] array;
////
////    public static int solutionOld(int[] T, int[] A) {
////        if (T.length == 1) return 1;
////
////        array = T;
////        learned = new boolean[T.length];
////
////        count = 1;
////
////        for (int i = 0; i < A.length; ++i) {
////            recursive(A[i]);
////        }
////
////        return count;
////    }
////
////    public static void recursive(int index) {
////        if (index == 0) {
////            return;
////        }
////
////        if (!learned[index]) {
////            learned[index] = true;
////            ++count;
////        }
////
////        recursive(array[index]);
////    }
//
////    public static void main(String args[]) {
////        int result1 = solution(new int[]{0,0,1,1}, new int[]{2});
////        int result0 = solution(new int[]{0,0}, new int[]{1});
////        int result2 = solution(new int[]{0,0,0,0,2,3,3}, new int[]{2,5,6});
////        int result3 = solution(new int[]{0,0,1,2}, new int[]{1,2});
////        int result4 = solution(new int[]{0,3,0,0,5,0,5}, new int[]{4,2,6,1,0});
////        int result5 = solution(new int[]{0}, new int[]{0});
////
////        System.out.println("==================");
////        System.out.println(result1 + " " + "== 3");
////        System.out.println(result0 + " " + "== 2");
////        System.out.println(result2 + " " + "== 5");
////        System.out.println(result3 + " " + "== 3");
////        System.out.println(result4 + " " + "== 7");
////        System.out.println(result5 + " " + "== 1");
////    }
//}
