with recursive EG as(
    select 
        ID,
        PARENT_ID,
        1 as GENERATION
    from ECOLI_DATA
    where PARENT_ID IS NULL
    union all
    select 
        ED.ID,
        ED.PARENT_ID,
        EG.GENERATION+1
    from ECOLI_DATA ED join EG on ED.PARENT_ID = EG.ID
)

select 
    COUNT(*) as 'COUNT',
    GENERATION
from EG
where ID NOT IN (select PARENT_ID from EG where PARENT_ID is not null)
group by GENERATION
ORDER BY GENERATION;