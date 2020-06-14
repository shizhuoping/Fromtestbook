package basicS;

public class Jzoffer64 {

	//在一个长度为n的数组里的所有数字都在0到n-1的范围内。 
	//数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 
	//例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
	
	//这个方法不用辅助空间，借助所有数字都在0-n-1内可以吧数组的值和下标调整为一致
	//每次如果不一致就进行互换，找当前值对应的位置进行互换，直到一致
	//如果这个过程中出现相等就返回
	public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length == 0){
            return false;
        }
        for(int i = 0; i < numbers.length; i++){
            while(i != numbers[i]){
                if(numbers[i] == numbers[numbers[i]]){
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[numbers[i]];
                numbers[temp] = temp;
            }
        }
        return false;
    }
}
