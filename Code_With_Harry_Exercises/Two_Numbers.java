package Code_With_Harry_Exercises;


public class Two_Numbers {
    static void pair(int num[],int target) {
        for (int i = 0;i<num.length;i++){
            for (int j = i ; j<num.length;j++){
                int sum = num[i]+num[j];
                if (sum==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {2,7,11,7};
        int target = 9;
        pair(num,target);
    }
}
