
public class Character {

	private boolean isHairMakeup;
	private boolean isMakeup;
	private boolean isDressed;
	private int charm;
	
	public void hairMakeup() {
		isHairMakeup = true;
		if(isHairMakeup) {
			System.out.println("머리손질을 합니다. 매력도 +10");
			charm +=10;
			System.out.println("매력도는"+this.charm +"입니다.");
		}
	}
	public void makeup() {
		isMakeup = true;
		if(isMakeup) {
			System.out.println("메이크업을 합니다. 매력도 + 15");
			charm +=15;
			System.out.println("매력도는"+this.charm+"입니다.");
		}
	}
	public void dress() {
		isDressed = true;
		if(!isHairMakeup) {
			System.out.println("옷을 꾸며서 입습니다. 매력도 + 20");
			charm += 20;
			System.out.println("매력도는"+this.charm+"입니다.");
		}else if(isMakeup) {
			System.out.println("화장품이 묻습니다. 화장을 지우고 옷을 입어주세요.");
		}else if(isHairMakeup) {
			System.out.println("머리가 망가집니다. 머리를 정리하고 옷을 입어주세요.");
		}
	}
	public void deit() {
		if(!isHairMakeup&&!isMakeup&&!isDressed) {
			System.out.println("다이어트를 합니다 매력도 +30");
			charm +=30;
			System.out.println("매력도는"+this.charm+"입니다.");
		}else {
			System.out.println("다른일을 하면서 다이어트를 할 수 없습니다. 다른일을 모두 멈추세요.");
		}
	}
	
	public void stopHairMakeup() {
		if(isHairMakeup ) {
		isHairMakeup = false;	
			
		System.out.println("머리손질을 멈춥니다.");
	}else {
		System.out.println("머리손질을 멈출일이 없습니다.");
	}
		}
	public void stopMakeup() {
		if(isMakeup) {
		isMakeup = false;
		System.out.println("메이크업을 지웁니다.");
	} else {
		System.out.println("메이크업을 지울일이 없습니다.");
	}
	
	}
	public void undress() {
		if(isDressed) {
			isDressed = false;
			System.out.println("옷을 벗습니다.");
		} else {
			System.out.println("옷을 벗을일이 없습니다.");
		}
	}
	public void goOut() {
		
		if(charm==0) {
			System.out.println("너무 안꾸미시는 거 아닌가요?");
		}
		else if(charm>=0&&charm<100) {
			System.out.println("매력지수 100미만 동메달");
		} else if(charm >= 100 && charm<300) {
			System.out.println("매력지수 300미만 은메달");
		} else if(charm>=300 && charm <500) {
			System.out.println("매력지수 300미만 금메달");
		} else { System.out.println("매력지수 충만 패션스타완성");
		}
	}
	
}
