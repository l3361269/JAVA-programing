package Exception;
public class Ex09 {
	public static void main(String[] args) {
		//表示驗證是否通過
		boolean verify = true;
		try {
			checkMemberID("1234545545");
		} catch (IDException e) {
			System.out.println("錯誤訊息 : " + e.getMessage());
			e.contactWith(); // 執行自訂方法
			verify = false;//表示驗證不通過
		}
		//如果驗證通過
		if (verify) {
			System.out.println("會員證號驗證成功 !");
		} else {
			System.out.println("會員證號驗證失敗 !");
		}
	}
	//判斷驗證的方式
	public static void checkMemberID(String mID) throws IDException {
		if (mID.length() != 5) {
			throw new IDException(mID);
		}
	}
}
//自訂例外類別
class IDException extends Exception {
	public IDException(String mID) {
		super("會員證號 " + mID + " 驗證失敗 !");
	}
	public void contactWith() {
		System.out.println("請連絡服務人員=> Tel:02-2222-3333");
	}
}