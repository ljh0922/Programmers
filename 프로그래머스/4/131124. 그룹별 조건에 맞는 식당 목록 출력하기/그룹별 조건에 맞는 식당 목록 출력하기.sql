-- 코드를 입력하세요
with review_cnt as(
select MEMBER_ID, count(*)  cnt_review from rest_review group by MEMBER_ID)
, max_cnt as (
select max(cnt_review) from review_cnt),
max_reviewer as(
select MEMBER_ID from review_cnt where cnt_review = (select * from max_cnt) 
)


select 
    MEMBER_NAME,
    REVIEW_TEXT,
    date_format(review_date,'%Y-%m-%d')
from 
    member_profile mp join rest_review rr on mp.member_id = rr.member_id
where
    rr.MEMBER_ID in (select * from max_reviewer)
order by REVIEW_DATE, REVIEW_TEXT;

