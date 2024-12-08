package day3;

// 최빈값 구하기
class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int max = 0;
        if(array.length==1) {
        	answer = array[0];
        }
        for(int i=0; i<array.length-1; i++) {
            int count = 0;
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==array[j]) {
                    count++;
                }
            }
            if(max!=0&&max==count) {
            	answer = -1;
            }
            if(max<count) {
                    max = count;
                    answer = array[i];
            }
        }
        return answer;
    }
}
