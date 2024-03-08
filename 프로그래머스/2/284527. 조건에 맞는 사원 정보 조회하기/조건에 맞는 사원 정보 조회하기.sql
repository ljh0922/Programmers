-- 코드를 작성해주세요
with emp_total_score as(
    select emp_no, sum(score) total_score
    from hr_grade
    group by emp_no)
    
select 
    ET.total_score SCORE,
    HE.EMP_NO,
    HE.EMP_NAME,
    HE.POSITION,
    HE.EMAIL
from HR_EMPLOYEES HE join emp_total_score ET on HE.emp_no = ET.emp_no
where ET.total_score = (select max(total_score) from emp_total_score);

