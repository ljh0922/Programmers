-- 코드를 작성해주세요

select 
    ROUTE,
    concat(Round(sum(D_BETWEEN_DIST),1),'km') TOTAL_DISTANCE,
    concat(ROUND(avg(D_BETWEEN_DIST),2),'km') AVERAGE_DISTANCE
from SUBWAY_DISTANCE
group by ROUTE
order by Round(sum(D_BETWEEN_DIST),1) desc;