package com.neoteric.exception;

public class AtmService {
public ApiResponse<Amount> getMoney(CardDetails cardDetails) throws Exception{
    ApiResponse<Amount> apiResponse=null;
    try {
        LoginService loginService = new LoginService();
        Account dbAccount = loginService.login(cardDetails);
        Account userEnteredAccount = new Account();
        userEnteredAccount.setAccNo(dbAccount.getAccNo());
        userEnteredAccount.setBalance(cardDetails.getAccount().getBalance());

        AccountService accountService = new AccountService();
        Amount amount=accountService.withdraw(userEnteredAccount);
        apiResponse=new ApiResponse<>();
        apiResponse.setData(amount);
    }catch (LoginFailedException e){
        apiResponse=new ApiResponse<>();
        apiResponse.setMessage(e.getMessage());
        System.out.println("LoginFailedException");
    } catch (InsufficientBalanceException e) {
        apiResponse = new ApiResponse<>();
        apiResponse.setMessage(e.getMessage());
        System.out.println("InsufficientBalanceException");
    }catch (Exception ee) {
        apiResponse=new ApiResponse<>();
        apiResponse.setMessage(ee.getMessage());
        System.out.println("General Exception");
    }
    return apiResponse;
}
}
