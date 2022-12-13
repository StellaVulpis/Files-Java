package day06;

import java.util.Scanner;
import java.util.Arrays;

//import java.util.ArrayList;
public class day06_2022_12_12 {
	public static void main(String[] args) {
		/*
		 * int argsCount=0;
		 * for(int i=0;i<args.length;i++)
		 * {
		 * System.out.print(args[i]+" ");
		 * argsCount++;
		 * }
		 * System.out.println("\nTotal Length of args[] is "+argsCount+".");
		 */
		ClassD06 cls = new ClassD06();
		// cls.Test();
		// cls.arr01();
		// cls.arr02();
		// cls.arr03();
		// cls.arr04();
		// cls.arr05();
		// cls.tdArr01();
	}
}// end of class day06~

class ClassD06 {
	Scanner ctnu = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in); // InputMismatchException >> Exception occur when inputting
											// different types into one Scanner. Use another Scanner for
											// two different types of arrays.

	ClassD06() {
	}

	void Test() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i)
					break;
				else
					System.out.print(j + " ");
			}
			System.out.println();
		} // end of for(i)
	}// end of void arrTest()

	void arr01() {
		String name1, name2, name3, name4, name5;
		name1 = "한라산";
		name2 = "칠보산";
		name3 = "백두산";
		name4 = "설악산";
		name5 = "광교산";
		String[] mountainNames = { "한라산", "칠보산", "백두산", "설악산", "광교산" }; // 선언+초기화
		String[] names = new String[5]; // 선언
		String[] arrayNames = new String[5];
		names = new String[] { "한라산", "칠보산", "백두산", "설악산", "광교산" }; // 초기화
		int numbers[] = { 1, 2, 3, 4, 5 };
		System.out.println();
		for (int i = 0; i < 5; i++) // 반복문 초기화
			arrayNames = new String[] { "Name" };
		for (int j = 0; j < 5; j++) // 반복문에서 출력
			System.out.println(mountainNames[j] + " Array [" + j + "]");
		System.out.println();
		for (int t = 0; t < 5; t++) // 배열에 입력받기
		{
			System.out.print((t + 1) + " 번째 문자를 입력해주세요: ");
			names[t] = sc.nextLine();
		}
		System.out.println();
		for (int t2 = 0; t2 < 5; t2++) // 입력받아 출력하기
		{
			System.out.println(names[t2]);
			System.out.println(arrayNames[t2]);
		}
		System.out.println();
		// ------------------------------------------------------
		// 빠른 for >> for(자료형 변수:객체명) { System.out.println(변수); }
		for (String PrintStrings : mountainNames) // 빠르게 배열의 내용물을 출력할 수 있다. (단점은 상세한 지정이 불가능)
			System.out.println(PrintStrings);
		System.out.println();
		for (int PrintNumbers : numbers)
			System.out.println(PrintNumbers);
		System.out.println();
		// ------------------------------------------------------
		/*
		 * String[] name = {10,34,45,56,67,78};
		 * System.out.println("빠른 for 출력");
		 * for(String names:name)
		 * System.out.println(names);
		 */
		// 에러 해결:
		int name[] = { 10, 34, 45, 56, 67, 78 };
		System.out.println("빠른 for 출력");
		for (int NAMES : name)
			System.out.println(NAMES);
		// 일반 for문에서 출력
		for (int a = 0; a < 6; a++)
			System.out.println(name[a]);
		// 일반 for문에서 배열의 길이만큼만 자동으로 출력
		for (int b = 0; b < name.length; b++)
			System.out.println(name[b]);
	}// end of arr01

	void arr02() {
		// 정수 7개를 입력받아 출려하는 프로그램
		int nums[] = new int[7]; // 기억장소 확보
		for (int i = 0; i < 7; i++) {
			System.out.print((i + 1) + " 번째 숫자를 입력하세요: ");
			nums[i] = sc.nextInt(); // 확보된 기억장소에 값을 입력
		}
		System.out.print("입력결과: ");
		System.out.println();
		for (int j = 0; j < nums.length; j++)
			System.out.print(nums[j] + " "); // 출력
		System.out.println();
		/*
		 * for(int NUM:nums) >> NUM: 입력한 숫자 5개 저장됨 == (int NUM=0;NUM<nums.length;NUM++)
		 * System.out.print(NUM+" "); 출력 결과: 입력숫자 입력숫자 입력숫자 입력숫자 입력숫자
		 */
	}// end of arr02()

	void arr03() {
		// 5명의 이름과 나이를 입력
		// 이름 나이
		// =======
		// 한라산 33
		// 백두산 25
		String NAME[] = new String[5];
		int ages[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " 번째 이름을 입력하세요.");
			NAME[i] = sc.nextLine();
			System.out.print((i + 1) + " 번째 나이를 입력하세요.");
			ages[i] = sc2.nextInt();
		}
		for (int t = 0; t < 5; t++) {
			System.out.print("이름  나이 \n");
			System.out.println("========================");
			System.out.print(NAME[t] + "  " + ages[t] + "\n");
		}
	}

	void arr04() {
		// 키보드로 입력시 짝수만 입력받아 5개만 입력받아 출력
		int num[] = new int[5];
		int NUM[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("수를 입력하세요: ");
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0)
				NUM[i] = num[i];
		}
		System.out.println("\n[입력결과]");
		for (int t = 0; t < 5; t++) {
			if (NUM[t] % 2 == 0 && NUM[t] > 0)
				System.out.println(NUM[t]);
		}
	}

	void arr05() {
		// 5명의 학생 성적 결과를 만들기
		// 이름, 국어, 영어, 수학 >> 총점, 평균, 학점 출력
		// 평균은 소수점 이하 2자리까지
		// 총점이 나오면 해당 점수로 석차를 구하기
		String names[] = new String[5]; // sc
		int rank[] = new int[5];
		int kor[] = new int[5], eng[] = new int[5], math[] = new int[5]; // sc2
		int count = 0;
		double scoreSum[] = new double[5];
		double average[] = new double[5];
		char grade[] = new char[5];
		String endPoint = "";
		int ascendRank[] = new int[5];
		String ascendName[] = new String[5];
		double ascendTotal[] = new double[5];
		double ascendAvrg[] = new double[5];
		char ascendGrade[] = new char[5];

		while (true) {
			if (count > 0) {
				System.out.println("계속하시겠습니까?");
				System.out.print("Y / N: ");
				endPoint = ctnu.nextLine();
			}
			if (endPoint.equals("N") || endPoint.equals("n") || endPoint.equals("NO")
					|| endPoint.equals("No") || endPoint.equals("no")) {
				System.out.println("\n종료되었습니다.");
				return;
			} else {
				for (int i = 0; i < names.length; i++) {
					System.out.print("학생의 이름을 입력해주세요: ");
					names[i] = sc.nextLine();
					System.out.print("국어 점수를 입력해주세요: ");
					kor[i] = sc2.nextInt();
					scoreSum[i] += (double) kor[i];
					System.out.print("영어 점수를 입력해주세요: ");
					eng[i] = sc2.nextInt();
					scoreSum[i] += (double) eng[i];
					System.out.print("수학 점수를 입력해주세요: ");
					math[i] = sc2.nextInt();
					scoreSum[i] += (double) math[i];
				}

				for (int t = 0; t < names.length; t++) {
					if (kor[t] > 100 || eng[t] > 100 || math[t] > 100) {
						System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					} else if (kor[t] < 0 || eng[t] < 0 || math[t] < 0) {
						System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
						break;
					} else {
						average[t] = scoreSum[t] / 3;
						if (average[t] >= 90.00)
							grade[t] = 'A';
						else if (average[t] >= 80)
							grade[t] = 'B';
						else if (average[t] >= 70)
							grade[t] = 'C';
						else if (average[t] >= 60)
							grade[t] = 'D';
						else
							grade[t] = 'F';
					}
				}
				// RANK
				// 0~4번째 인덱스를 매번 돌때마다 1로 설정
				// 이중 반복문으로 총점을 첫번째(현재) 반복문의 배열(1개)과 두번째 반복문의 배열들(5개)을 비교해서
				// 자기 값보다 큰 값이 있으면 +1, 없으면 더하기 안함.
				// 가장 작은 값은 가장 많이 더해지며, 가장 큰 값은 안더해짐.
				// 최종적으로 인덱스 0~4번째에 1 2 3 4 라는 값이 각각 저장됨
				for (int r1 = 0; r1 < names.length; r1++) {
					rank[r1] = 0; // 0, 1, 2, 3, 4 >> 출력시 +1 해주는 것.
					for (int r2 = 0; r2 < names.length; r2++) {
						if (scoreSum[r1] < scoreSum[r2])
							rank[r1]++;
					}
				}
				for (int r3 = 0; r3 < 5; r3++) {
					for (int r4 = 0; r4 < 5; r4++) {
						if (rank[r4] == r3) {
							ascendRank[r3] = rank[r4];
							ascendName[r3] = names[r4];
							ascendTotal[r3] = scoreSum[r4];
							ascendAvrg[r3] = average[r4];
							ascendGrade[r3] = grade[r4];
						}
					}
				}
				System.out.println("=======================================");
				System.out.println("\n[입력결과]\n");
				System.out.println("순위\t이름\t총점\t평점\t학점");
				System.out.println("=======================================");
				for (int j = 0; j < names.length; j++) {
					System.out.printf("%d\t%s\t%.0f\t%.2f\t%c\n", (ascendRank[j] + 1), ascendName[j], ascendTotal[j],
							ascendAvrg[j], ascendGrade[j]);
				}
				System.out.println("=======================================");
			}
			count++;
		}

	}

	void tdArr01() {
		String tdArray01[][] = new String[5][5];
		tdArray01 = new String[][] {
				{ "aaa", "bbb", "ccc", "ddd", "eee" }, { "aaa", "bbb", "ccc", "ddd", "eee" },
				{ "aaa", "bbb", "ccc", "ddd", "eee" },
				{ "aaa", "bbb", "ccc", "ddd", "eee" }, { "aaa", "bbb", "ccc", "ddd", "eee" }
		};
		// 2d Array: X, Y
		// 2차원 배열: 아파트 1개(층, 호)
		int tdArray02[][] = {
				{ 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 },
				{ 1000, 2000, 3000, 4000, 5000 },
				{ 10000, 20000, 30000, 40000, 50000 }
		};
		// 2D Array
		// [5][5]
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		// ------------
		// [2][5]
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		// ------------
		// [3][7]
		/*
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 * 1 2 3
		 */
		// 3D Array
		/*
		 * [3][3][3]
		 * 
		 * 1 2 3 | 1 2 3 | 1 2 3
		 * 1 2 3 | 1 2 3 | 1 2 3
		 * 1 2 3 | 1 2 3 | 1 2 3
		 */

		// 3d Array: {X, Y}, {X, Y}, {X, Y} >> Arrays*3
		// 3차원 배열: 아파트 여러개 (층, 호), (층, 호), (층, 호)
		int trdArray[][][] = {
				{
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 },
						{ 100, 200, 300, 400, 500 },
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 }
				},
				{
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 },
						{ 100, 200, 300, 400, 500 },
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 }
				},
				{
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 },
						{ 100, 200, 300, 400, 500 },
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 }
				},
				{
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 },
						{ 100, 200, 300, 400, 500 },
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 }
				},
				{
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 },
						{ 100, 200, 300, 400, 500 },
						{ 1, 2, 3, 4, 5 },
						{ 10, 20, 30, 40, 50 }
				}
		};
		// Printing two dimensional array
		System.out.println("2-Dimensional Array #01"); // 5 x 5 length
		for (int i1 = 0; i1 < tdArray01.length; i1++) {
			for (int i2 = 0; i2 < tdArray01.length; i2++)
				System.out.print(tdArray01[i1][i2] + " ");
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("2-Dimensional Array #02"); // 5 x 5 length
		for (int i = 0; i < tdArray02.length; i++) {
			for (int j = 0; j < tdArray02.length; j++)
				System.out.print(tdArray02[i][j] + " ");
			System.out.println();
		}
		System.out.println("--------------------------------");
		// Printing three dimensional array
		System.out.println("3-Dimensional Array"); // (5 x 5) x 5 length (=125)
		for (int t1 = 0; t1 < trdArray.length; t1++) {
			for (int t2 = 0; t2 < trdArray.length; t2++) {
				for (int t3 = 0; t3 < trdArray.length; t3++)
					System.out.print(trdArray[t1][t2][t3] + " ");
				System.out.println();
			}
			System.out.println();
		}

	}
}// end of class ClassD06
