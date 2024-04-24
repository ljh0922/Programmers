WITH RECURSIVE GEN AS (
    SELECT
        ID
        , PARENT_ID
        , 1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    UNION ALL
    SELECT
        DATA.ID
        , DATA.PARENT_ID
        , GENERATION+1
    FROM ECOLI_DATA DATA
    JOIN GEN ON GEN.ID = DATA.PARENT_ID
)

SELECT
    COUNT(*) COUNT
    , GENERATION
FROM GEN
WHERE ID NOT IN (SELECT PARENT_ID FROM ECOLI_DATA WHERE PARENT_ID IS NOT NULL)
GROUP BY GENERATION
ORDER BY GENERATION;