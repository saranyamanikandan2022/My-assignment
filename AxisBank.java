package Org.system;
 public class AxisBank extends BankInfo{
	public void deposit(){
	System.out.println("deposit");
	}
public static void main(String[] args) {
	AxisBank bank = new AxisBank();
    bank.saving();
    bank.fixed();
    bank.deposit();
    System.out.println(AxisBank.equal(deposit));
}

	}

}
