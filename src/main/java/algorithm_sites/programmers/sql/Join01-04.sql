--1
SELECT outs.animal_id
     , outs.name
FROM animal_outs as outs
    LEFT OUTER JOIN animal_ins as ins
    ON outs.animal_id = ins.animal_id
WHERE ins.animal_id IS NULL
ORDER BY outs.animal_id;

--2
SELECT outs.animal_id
     , outs.name
FROM animal_outs as outs
    INNER JOIN animal_ins as ins
    ON outs.animal_id = ins.animal_id
WHERE ins.datetime > outs.datetime
ORDER BY ins.datetime;

--3
SELECT ins.name
     , ins.datetime
FROM animal_ins as ins
    LEFT OUTER JOIN animal_outs as outs
    ON ins.animal_id = outs.animal_id
WHERE outs.datetime IS NULL
ORDER BY ins.datetime
LIMIT 3;

--4
SELECT ins.animal_id
     , ins.animal_type
     , ins.name
FROM animal_ins as ins
         INNER JOIN animal_outs as outs
                    ON ins.animal_id = outs.animal_id
WHERE ins.sex_upon_intake in ('Intact Male', 'Intact Female')
  AND ins.sex_upon_intake <> outs.sex_upon_outcome
ORDER BY ins.animal_id;