
-- 1
SELECT MAX(datetime) as 시간
FROM animal_ins;

-- 2
SELECT MIN(datetime) as 시간
FROM animal_ins;

-- 3
SELECT COUNT(*)
FROM animal_ins;

-- 4
SELECT COUNT(DISTINCT(name))
FROM animal_ins;