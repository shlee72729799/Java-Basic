package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}


//**private**
//`balance` : 데이터 필드는 외부에 직접 노출하지 않는다. `BankAccount` 가 제공하는 메서드를 통해서만 접근할수 있다.
//`isAmountValid()` : 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다. 따라서 `private` 을 사용했다.

//**public**
//`deposit()` : 입금
//`withdraw` (): 출금
//`getBalance()` : 잔고

//만약 `isAmountValid()` 를 외부에 노출하면 어떻게 될까? `BankAccount` 를 사용하는 개발자 입장에서는 사용할
//수 있는 메서드가 하나 더 늘었다. 여러분이 `BankAccount` 를 사용하는 개발자라면 어떤 생각을 할까? 아마도 입금과
//출금 전에 본인이 먼저 `isAmountValid()` 를 사용해서 검증을 해야 하나? 라고 의문을 가질 것이다.
//만약 `balance` 필드를 외부에 노출하면 어떻게 될까? `BankAccount` 를 사용하는 개발자 입장에서는 이 필드를 직접
//사용해도 된다고 생각할 수 있다. 왜냐하면 외부에 공개하는 것은 그것을 외부에서 사용해도 된다는 뜻이기 때문이다.
//결국 모든 검증과 캡슐화가 깨지고 잔고를 무한정 늘리고 출금하는 심각한 문제가 발생할 수 있다.
//접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고, `BankAccount` 를 사용하는 개발자 입장에
//서 해당 기능을 사용하는 복잡도도 낮출 수 있다.