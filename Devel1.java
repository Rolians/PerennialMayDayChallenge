import java.util.Scanner;
import java.util.ArrayList;
public class Devel1{
	public  void findArrayToSum(int sum, int arrayToSum[]){
		int arrSum = 0;
		boolean flag = false ;
		ArrayList<Integer> eleList = new ArrayList<Integer>();
		for(int i = 0; i<arrayToSum.length; i++){
			eleList.add(arrayToSum[i]);
			for(int j = i+1; j < arrayToSum.length;j++){
				arrSum = arrSum + j;
				eleList.add(arrayToSum[j]);
				if(arrSum == sum){
					flag = true;
					break;
				}

			}
		if(flag){
			System.out.println("sum is "+arrSum);
			System.out.println("list is "+eleList);
			for(Integer k : eleList){
				System.out.print(k+"- ");
			}
			break;
		} else{
			eleList.clear();
		}
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Devel1 devel1 = new Devel1();
		int noOfTasks;
		noOfTasks = sc.nextInt();
		while(noOfTasks > 0){
			int noOfEle = sc.nextInt();
			int sum = sc.nextInt();
			int[] arraySum = new int[noOfEle];
			for(int i = 0; i < noOfEle; i++){
				arraySum[i] = sc.nextInt();
			}
			System.out.println("ele is "+noOfEle+" with sum "+sum);
			devel1.findArrayToSum(sum, arraySum);
			noOfTasks--;
		}
	}

}
