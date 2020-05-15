package miniProject;
//객체지향의 5원칙
// SOLID
// S: Single Responsibility Principle
// 		단일 책임원칙
// 		하나의 클래스는 하나의 책임만 져야한다.

// MVC 패턴
// Model - View - Controller
// 모델: 데이터를 담는 틀. 사용자가 뷰에서 요청하면 컨트롤러가 데이터베이스에서 데이터를 모델에 담아서 다시 뷰로 보내준다.
// 		모델은 주로 VO나 DTO라는 접미사가 붙는다.
//		VO는 Value Object, DTO는 Data Transfer Object 라는 뜻이다.

// 뷰: 사용자가 보고있는 화면에 출력되는 UI이다.
//		만약 우리가 웹 프로젝트를 하게 된다면 뷰는 html, jsp 파일이 되고 
//		지금은 사용자가 콘솔화면을 보기 때문에 콘솔 화면에 뜨는 println등이 모여서 하나의 뷰가 된다.

// 컨트롤러: 사용자가 요청하는 data를 모델에 담아서 뷰에 보내주거나 사용자가 보낸 모델을 데이터베이스로 보내주는 역할을 한다.


// 아래 4가지는 아직 몰라되됨

// O: Open -Closed Principle
// L: Liskov Substitution Principle
// I: Interface principle
// D: Dependency Principle
public class ParkVO {

	//필요한 필드: 차량 번호와 들어온 시간
	private String number;
	private int inTime;
	//모델에는 필드, getter/setter, equals(), toString() 등만 들어간다.
	public String getNumber() { 		//파라미터 필요없음 , 자신만 가진 값만 나타내면 된다.
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	
	public boolean equals(Object o) {
		if(o instanceof ParkVO) {
			ParkVO p = (ParkVO)o;
			if(number.equals(p.number)) {
				return true;
			}
		}
		return false;
	}
}
