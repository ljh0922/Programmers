-- 코드를 작성해주세요

select
    s.EMP_NO	
    , e.EMP_NAME	
    , case
        when s.SCORE >= 96 then 'S'
        WHEN s.SCORE >= 90 then 'A'
        WHEN s.SCORE >= 80 then 'B'
        else 'C'
    end AS GRADE	
    , case
        when s.SCORE >= 96 then 0.2*e.SAL
        WHEN s.SCORE >= 90 then 0.15*e.SAL
        WHEN s.SCORE >= 80 then 0.1*e.SAL
        else 0
    end AS BONUS
from
(select 
    EMP_NO
    , AVG(SCORE) AS `SCORE`
from HR_GRADE
GROUP BY
    EMP_NO) s join HR_EMPLOYEES e  
    on s.EMP_NO = e.EMP_NO
    ;
