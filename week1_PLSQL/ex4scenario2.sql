CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(

    p_loan NUMBER,
    p_rate NUMBER,
    p_years NUMBER

)
RETURN NUMBER
IS

    v_total NUMBER;
    v_monthly NUMBER;

BEGIN

    v_total := p_loan + (p_loan * p_rate * p_years /100);

    v_monthly := v_total/(p_years*12);

    RETURN ROUND(v_monthly,2);

END;
/