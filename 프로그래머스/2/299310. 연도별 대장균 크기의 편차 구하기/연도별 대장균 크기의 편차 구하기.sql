-- 코드를 작성해주세요
SELECT
    YEAR(DIFFERENTIATION_DATE) YEAR
    , (M.MAX_SIZE-ED.SIZE_OF_COLONY) YEAR_DEV
    , ID
FROM ECOLI_DATA  ED JOIN
    (SELECT
        YEAR
        , MAX(SIZE_OF_COLONY) MAX_SIZE
    FROM
        (SELECT
            ID
            , SIZE_OF_COLONY
            , YEAR(DIFFERENTIATION_DATE) YEAR
        FROM ECOLI_DATA) MM
    GROUP BY YEAR) M
    ON M.YEAR = YEAR(ED.DIFFERENTIATION_DATE)
    ORDER BY YEAR, YEAR_DEV;
    ;
