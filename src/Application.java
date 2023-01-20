import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Character ch = new Character();
		Character girlch = new GirlCharacter();
		Character boych = new BoyCharacter();
		boolean work;
		int b = (int)( Math.random()*2)+1;
		System.out.println("독심술 게임 : 1또는 2를 골라서 맞춰야만 수당을 얻어 게임을 진행할 수 있습니다.");
		int c = sc.nextInt();
		if(b==c) { 
			work=true;
			System.out.println(b+"을 맞춰 토큰을 얻어 게임 진행합니다.");}
		else { 
			work= false;
			System.out.println("맞추지 못해 수당을 얻지 못해 이번판은 게임을 즐길 수 없습니다.");
		}

		while(work==true) {
			System.out.println("====남녀 캐릭터를 골라주세요.====");
			System.out.println("1. 성별무관");
			System.out.println("2. 여자캐릭터");
			System.out.println("3. 남자캐릭터");
			System.out.println("4. 랜덤으로 정하기");
			System.out.println("9. 프로그램종료");
			int a = sc.nextInt();
			if(a==4) { a=(int) (Math.random()*3) +1;
			System.out.println(a+"(이)가 선택되셨습니다.");}

			if(a==1) {
				while(true) {
					System.out.println("========캐릭터 꾸미기============");
					System.out.println("1. 머리 손질하기");
					System.out.println("2. 화장하기");
					System.out.println("3. 옷 꾸미기");
					System.out.println("4. 다이어트하기");
					System.out.println("5. 머리손질 그만하기");
					System.out.println("6. 화장지우기");
					System.out.println("7. 옷 벗기");
					System.out.println("8. 외출하기");
					System.out.println("9. 프로그램 종료");
					System.out.print("번호 입력 : ");
					int no = sc.nextInt();

					switch(no) {
					case 1 : ch.hairMakeup();break;
					case 2 : ch.makeup();break;
					case 3 : ch.dress();break;
					case 4 : ch.deit();break;
					case 5 : ch.stopHairMakeup();break;
					case 6 : ch.stopMakeup();break;
					case 7 : ch.undress();break;
					case 8 : ch.goOut();break;
					case 9 : System.out.println("프로그램을 종료합니다.");return;
					default : System.out.println("번호를 잘못 입력하셨습니다.");break;
					}
				}
			} else if(a==2) { 
				while(true) {
					System.out.println("========캐릭터 꾸미기============");
					System.out.println("1. 머리 손질하기");
					System.out.println("2. 화장하기");
					System.out.println("3. 옷 꾸미기");
					System.out.println("4. 다이어트하기");
					System.out.println("5. 머리손질 그만하기");
					System.out.println("6. 화장지우기");
					System.out.println("7. 옷 벗기");
					System.out.println("8. 외출하기");
					System.out.println("9. 프로그램 종료");
					System.out.print("번호 입력 : ");
					int no = sc.nextInt();

					switch(no) {
					case 1 : girlch.hairMakeup();
					break;
					case 2 : girlch.makeup();
					break;
					case 3 : girlch.dress();
					break;
					case 4 : girlch.deit();break;
					case 5 : girlch.stopHairMakeup();break;
					case 6 : girlch.stopMakeup();break;
					case 7 : girlch.undress();break;
					case 8 : girlch.goOut();break;
					case 9 : System.out.println("프로그램을 종료합니다.");return;
					default : System.out.println("번호를 잘못 입력하셨습니다.");break;
					}
				}
			}
			else if(a==3) {while(true) {
				System.out.println("========캐릭터 꾸미기============");
				System.out.println("1. 머리 손질하기");
				System.out.println("2. 화장하기");
				System.out.println("3. 옷 꾸미기");
				System.out.println("4. 다이어트하기");
				System.out.println("5. 머리손질 그만하기");
				System.out.println("6. 화장지우기");
				System.out.println("7. 옷 벗기");
				System.out.println("8. 외출하기");
				System.out.println("9. 프로그램 종료");
				System.out.print("번호 입력 : ");
				int no = sc.nextInt();

				switch(no) {
				case 1 : boych.hairMakeup();break;
				case 2 : boych.makeup();break;
				case 3 : boych.dress();break;
				case 4 : boych.deit();break;
				case 5 : boych.stopHairMakeup();break;
				case 6 : boych.stopMakeup();break;
				case 7 : boych.undress();break;
				case 8 : boych.goOut();break;
				case 9 : System.out.println("프로그램을 종료합니다.");return;
				default : System.out.println("번호를 잘못 입력하셨습니다.");break;
				}
			}}
			else if (a==9) {
				System.out.println("프로그램을 종료합니다.");
				return;}
			else {
				System.out.println("번호를 잘못 입력하셨습니다.");break;
			}
		}

	}


}
