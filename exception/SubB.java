package Exception;
//Override-->子改父方法的規則
//存取權限:子>=父
//遇到聲明例外時:子<=父
//-->若是RuntimeException:不管上一行註解寫的規則
//-->若是Exception:一定要管上上一行註解寫的規則

class X {
	public void foo() {
		System.out.print("X ");
	}
}

public class SubB extends X {
	public void foo() throws RuntimeException {//子類的throw聲明層級一定要<=父類的
		super.foo();//跑回去執行父類的
		if (true)
			{
			throw new RuntimeException();
			}
		System.out.print("B ");
	}

	public static void main(String[] args) {
		new SubB().foo();
	}
}

