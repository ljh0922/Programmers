-- 코드를 작성해주세요
## 종류별 최대길이
with max_length as(
select 
    FISH_TYPE,
    max(LENGTH) LENGTH 
from FISH_INFO
group by FISH_TYPE)

select
    fi.ID,
    fni.FISH_NAME,
    fi.LENGTH
from
    FISH_INFO fi join FISH_NAME_INFO fni on fi.FISH_TYPE = fni.FISH_TYPE
where (fi.FISH_TYPE,fi.LENGTH) in (select * from max_length)
order by ID;