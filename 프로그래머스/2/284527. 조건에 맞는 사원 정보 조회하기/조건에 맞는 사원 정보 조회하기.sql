select 
    sum(hg.score) SCORE,
    he.EMP_NO,
    he.EMP_NAME,
    he.POSITION,
    he.EMAIL
from hr_grade hg join hr_employees he on hg.emp_no = he.emp_no
group by hg.emp_no
order by SCORE desc
limit 1;