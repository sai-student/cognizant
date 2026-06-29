DECLARE

CURSOR GenerateMonthlyStatements IS

SELECT
c.Name,
t.TransactionID,
t.Amount,
t.TransactionDate

FROM Customers c
JOIN Accounts a
ON c.CustomerID=a.CustomerID
JOIN Transactions t
ON a.AccountID=t.AccountID

WHERE TO_CHAR(
t.TransactionDate,
'MMYYYY'
)=TO_CHAR(
SYSDATE,
'MMYYYY');

BEGIN

FOR rec IN GenerateMonthlyStatements LOOP

DBMS_OUTPUT.PUT_LINE(
rec.Name||
' Transaction: '||
rec.TransactionID||
' Amount: '||
rec.Amount
);

END LOOP;

END;
/


DECLARE

CURSOR ApplyAnnualFee IS
SELECT AccountID
FROM Accounts;

BEGIN

FOR rec IN ApplyAnnualFee LOOP

UPDATE Accounts
SET Balance=Balance-100
WHERE AccountID=rec.AccountID;

END LOOP;

COMMIT;

DBMS_OUTPUT.PUT_LINE(
'Annual Fee Applied');

END;
/


DECLARE

CURSOR UpdateLoanInterestRates IS
SELECT LoanID,
InterestRate
FROM Loans;

BEGIN

FOR rec IN UpdateLoanInterestRates LOOP

UPDATE Loans
SET InterestRate=rec.InterestRate+0.5
WHERE LoanID=rec.LoanID;

END LOOP;

COMMIT;

DBMS_OUTPUT.PUT_LINE(
'Loan Interest Rates Updated');

END;
/