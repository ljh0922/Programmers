-- 코드를 작성해주세요
## 종류별 최대길이
with max_length as(
select 
    fi.FISH_TYPE,
    fni.FISH_NAME,
    max(LENGTH) LENGTH 
from FISH_INFO fi join FISH_NAME_INFO fni on fi.FISH_TYPE = fni.FISH_TYPE
group by fi.FISH_TYPE,fni.FISH_NAME)

select
    fi.ID,
    ml.FISH_NAME,
    ml.LENGTH
from
    FISH_INFO fi join  max_length ml 
    on fi.FISH_TYPE = ml.FISH_TYPE and fi.LENGTH = ml.LENGTH;