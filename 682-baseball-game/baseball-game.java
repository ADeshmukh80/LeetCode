class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                int n = arr.size();
                int score = arr.get(n - 1) + arr.get(n - 2);
                arr.add(score);

            } else if (operations[i].equals("D")) {
                int n = arr.size();
                int score = 2 * arr.get(n - 1);
                arr.add(score);

            } else if (operations[i].equals("C")) {
                arr.remove(arr.size() - 1);

            } else {
                int score = Integer.parseInt(operations[i]);
                arr.add(score);
            }
        }

        for (int score : arr) {
            res += score;
        }

        return res;
    }
}