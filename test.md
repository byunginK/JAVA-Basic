# Test (평균구하기)

## 백준사이트 단계 실습 1 (평균구하기)

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			score = sc.nextInt();
			if(score < 40 && score >=0) {
				score = 40;
			}
			sum = sum + score;
		}
		 
		System.out.println(sum/5);
		
		
		sc.close();
	}

}


```

__*test 파일로 앞으로 가능한 하루에 하나씩 문제를 풀고 업로드 진행
소스코드를 올리고 아래에는 간략한 풀이 기재*__

### 풀이
 for문을 통해 인원수 (5명)만큼 점수를 입력 받고 40점 미만은 40점으로 계산한다.(조건)

  합계를 구한 후 인원수 만큼 나눠주어 평균 값을 구한다.
