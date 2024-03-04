with F as(
    select sum(code) from SKILLCODES  where category = 'Front End'
),
P as(
    select code from SKILLCODES  where name = 'Python'
),
C as(
    select code from SKILLCODES  where name = 'C#'
),
result as(
select
    Case
        when SKILL_CODE & (select * from F) != 0 and SKILL_CODE & (select * from P) != 0 then 'A'
        when SKILL_CODE & (select * from C) != 0 then 'B'
        when SKILL_CODE & (select * from F) != 0 then 'C'
    end as GRADE,
    ID,
    EMAIL
from DEVELOPERS
order by GRADE,id)

select * from result where grade is not null;