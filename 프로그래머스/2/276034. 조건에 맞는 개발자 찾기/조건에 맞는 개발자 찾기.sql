-- 코드를 작성해주세요
select 
    ID,	
    EMAIL,
    FIRST_NAME,
    LAST_NAME 
from DEVELOPERS 
where 
    (select code from skillcodes where name = 'Python') & SKILL_CODE != 0 
    or 
    (select code from skillcodes where name = 'C#') & SKILL_CODE != 0
order by ID;