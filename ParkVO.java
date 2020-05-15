package miniProject;
//��ü������ 5��Ģ
// SOLID
// S: Single Responsibility Principle
// 		���� å�ӿ�Ģ
// 		�ϳ��� Ŭ������ �ϳ��� å�Ӹ� �����Ѵ�.

// MVC ����
// Model - View - Controller
// ��: �����͸� ��� Ʋ. ����ڰ� �信�� ��û�ϸ� ��Ʈ�ѷ��� �����ͺ��̽����� �����͸� �𵨿� ��Ƽ� �ٽ� ��� �����ش�.
// 		���� �ַ� VO�� DTO��� ���̻簡 �ٴ´�.
//		VO�� Value Object, DTO�� Data Transfer Object ��� ���̴�.

// ��: ����ڰ� �����ִ� ȭ�鿡 ��µǴ� UI�̴�.
//		���� �츮�� �� ������Ʈ�� �ϰ� �ȴٸ� ��� html, jsp ������ �ǰ� 
//		������ ����ڰ� �ܼ�ȭ���� ���� ������ �ܼ� ȭ�鿡 �ߴ� println���� �𿩼� �ϳ��� �䰡 �ȴ�.

// ��Ʈ�ѷ�: ����ڰ� ��û�ϴ� data�� �𵨿� ��Ƽ� �信 �����ְų� ����ڰ� ���� ���� �����ͺ��̽��� �����ִ� ������ �Ѵ�.


// �Ʒ� 4������ ���� ����ǵ�

// O: Open -Closed Principle
// L: Liskov Substitution Principle
// I: Interface principle
// D: Dependency Principle
public class ParkVO {

	//�ʿ��� �ʵ�: ���� ��ȣ�� ���� �ð�
	private String number;
	private int inTime;
	//�𵨿��� �ʵ�, getter/setter, equals(), toString() � ����.
	public String getNumber() { 		//�Ķ���� �ʿ���� , �ڽŸ� ���� ���� ��Ÿ���� �ȴ�.
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
