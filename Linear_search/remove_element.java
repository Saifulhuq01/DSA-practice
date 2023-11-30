package DSA.algos;

public class remove_element {
    public static void main(String[] args) {
        int[] nums ={3,2,2,3,7,6,3};
        int val =3;
        System.out.println(removeElement(nums,val));
    }
    static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;

            }
        }
        return j;

    }
}
