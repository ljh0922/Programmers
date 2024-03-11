-- 코드를 작성해주세요

select 
    ROUTE,
    concat(Round(sum(D_BETWEEN_DIST),1),'km') TOTAL_DISTANCE,
    concat(ROUND(avg(D_BETWEEN_DIST),2),'km') AVERAGE_DISTANCE
from SUBWAY_DISTANCE
group by ROUTE
order by Round(sum(D_BETWEEN_DIST),1) desc;
-- 
-- 정렬에서 문자열인 TOTAL_DISTANCE를 기준으로하면 문자열 비교를 하게 되므로 올바른 결과x

