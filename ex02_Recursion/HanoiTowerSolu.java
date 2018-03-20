package ex02_Recursion;

public class HanoiTowerSolu {
	
	public static void main(String[] args) {
		//막대 A의 원반 3개를 막대 B를 경유하여 막대 C로 옮기기
		HanoiTowerMove(4, 'A', 'B', 'C');
	}
	
	static void HanoiTowerMove(int num, char from, char by, char to) {
		if(num == 1) {
			System.out.printf("원반 %d을 %c에서 %c로 이동 \n", num, from, to);
		} else {
			HanoiTowerMove(num - 1, from, to, by);
			System.out.printf("원반 %d를 %c에서 %c로 이동 \n", num, from, to);
			HanoiTowerMove(num - 1, by, from, to);
		}
	}

}
