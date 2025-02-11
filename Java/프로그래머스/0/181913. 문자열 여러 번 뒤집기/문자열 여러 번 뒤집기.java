class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sbAll = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];

            // 현재 sbAll에서 부분 문자열 추출
            StringBuilder sbReverse = new StringBuilder(sbAll.substring(startIndex, endIndex + 1));
            sbReverse.reverse();

            // 원래 문자열에서 해당 부분을 삭제하고, 뒤집은 문자열을 삽입
            sbAll.replace(startIndex, endIndex + 1, sbReverse.toString());
        }
        return sbAll.toString();
    }
}
