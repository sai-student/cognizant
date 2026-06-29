CREATE OR REPLACE PROCEDURE UpdateSalary(

    p_empid NUMBER,
    p_percent NUMBER

)
IS

BEGIN

    UPDATE Employees
    SET Salary=Salary+(Salary*p_percent/100)
    WHERE EmployeeID=p_empid;

    IF SQL%ROWCOUNT=0 THEN
        RAISE_APPLICATION_ERROR(-20002,'Employee Not Found');
    END IF;

    COMMIT;

EXCEPTION

    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);

END;
/