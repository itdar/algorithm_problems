--1
SELECT animal_type as ANIMAL_TYPE
     , COUNT(animal_id) as count
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type;

--2
SELECT name as NAME
     , COUNT(animal_id) as COUNT
FROM animal_ins
GROUP BY name
HAVING COUNT(name) > 1
ORDER BY name;

--3
SELECT HOUR(datetime) as HOUR
        , COUNT(datetime) as COUNT
FROM animal_outs
WHERE HOUR(datetime) BETWEEN 9 AND 19
GROUP BY HOUR(datetime)
ORDER BY HOUR(datetime);

--4
SET @hour := -1;

SELECT (@hour := @hour + 1) AS HOUR
    , (SELECT COUNT(*)
        FROM animal_outs
        WHERE @hour = HOUR(datetime)
      ) as COUNT
FROM animal_outs
WHERE @hour < 23;

