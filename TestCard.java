package OopsAssignment;
abstract class PrepaidCard{
	int CardNo;
	double availableBalance,swipeLimit;
	abstract void swipeCard();
	int amount;
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ ", amount=" + amount + "]";
	}
	void rechargeCard()
	{
		System.out.println("amount is");
	}
		
	}

public class TestCard {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
