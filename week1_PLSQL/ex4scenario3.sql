CREATE OR REPLACE FUNCTION HasSufficientBalance(

    p_account NUMBER,
    p_amount NUMBER

)
RETURN BOOLEAN
IS

    v_balance NUMBER;

BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID=p_account;

    RETURN v_balance>=p_amount;

END;
/