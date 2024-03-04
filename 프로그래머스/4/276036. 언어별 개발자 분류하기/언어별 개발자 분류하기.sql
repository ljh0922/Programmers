-- 코드를 작성해주세요
# A_DEVELOPERS 
with A_DEVELOPERS as(
    select * 
    from DEVELOPERS d
    where 
        (select sum(CODE & d.SKILL_CODE) from SKILLCODES where CATEGORY = 'Front End' ) != 0 and
        (select code & d.skill_code from skillcodes where name = 'Python') != 0
),
# B_DEVELOPERS
B_DEVELOPERS as(
    select * 
    from DEVELOPERS d
    where 
        (select code & d.skill_code from skillcodes where name = 'C#') !=0 and
        ID not in (select id from A_DEVELOPERS)
),

# C_DEVELOPERS
C_DEVELOPERS as(
    select * 
    from  DEVELOPERS d
    where
        (select sum(CODE & d.SKILL_CODE) from SKILLCODES where CATEGORY = 'Front End' ) != 0 and
        ID not in (select id from A_DEVELOPERS) and
        ID not in (select id from B_DEVELOPERS)
)

select 
    'A' GRADE,
    ID,
    EMAIL
from A_DEVELOPERS 
union
select 
    'B' GRADE,
    ID,
    EMAIL
from B_DEVELOPERS
union
select 
    'C' GRADE,
    ID,
    EMAIL
from C_DEVELOPERS
order by GRADE, ID;