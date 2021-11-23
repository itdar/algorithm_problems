package algorithm_sites.programmers;

import java.util.*;

public class SShopProblem02 {
    public static int solution(int K, String[] user_scores) {
        if (K >= user_scores.length) {
            return user_scores.length;
        }

        //
        List<User> users = new ArrayList<>();
        for (int i = 0; i < user_scores.length; ++i) {
            String[] userInfo = user_scores[i].split(" ");
            users.add(new User(userInfo[0], Integer.parseInt(userInfo[1])));
        }

        //
        LinkedList<User> rank = new LinkedList<>();
        rank.add(users.get(0));
        int changeCount = 1;

        for (int i = 1; i < users.size(); ++i) {
            User currentUser = users.get(i);

            System.out.println(rank);

            for (int j = 0; j < rank.size(); ++j) {
                if (currentUser.name.equals(rank.get(j).name)) {
                    if (currentUser.score > rank.get(j).score) {
                        rank.get(j).score = currentUser.score;
                    }
                    break;
                }

                if (rank.size() < K) {
                    if (!rank.contains(currentUser)) {
                        rank.addLast(currentUser);
                        ++changeCount;
                    }
                    break;
                }

                if (currentUser.score > rank.get(j).score) {
                    if (!currentUser.name.equals(rank.get(j).name)) {
                        ++changeCount;
                    } else {

                    }

                    for (int k = j; k < rank.size(); ++k) {
                        if (rank.get(k).name.equals(currentUser.name)) {
                            rank.remove(k);
                        }
                    }

                    rank.add(j, currentUser);

                    if (rank.size() > K) {
                        rank.removeLast();
                    }

                    break;
                }
            }
        }
        System.out.println("Last: " + rank);

        return changeCount;
    }

    static class User {
        String name;
        int score;
        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public User clone() {
            return new User(this.name, this.score);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, score);
        }

        @Override
        public String toString() {
            return "["+name+","+score+"]";
        }
    }

    public static void main(String args[]) {
//        int result1 = solution(3, new String[] {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"});
//        System.out.println(result1);
//
//        int result2 = solution(3, new String[] {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"});
//        System.out.println(result2);

//        int result3 = solution(2, new String[] {"cheries2 200", "alex111 100", "coco 150", "puyo 120"});
//        System.out.println(result3);

//        int result4 = solution(1, new String[] {"cheries2 200", "alex111 100", "coco 150", "puyo 120"});
//        System.out.println(result4);

        int result5 = solution(4, new String[] {"A 200", "B 150", "C 100", "D 80", "D 120"});
        System.out.println(result5);

    }

}
