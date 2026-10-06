# Write your MySQL query statement below
SELECT e.name FROM Employee AS e
JOIN (
    SELECT managerId FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId 
    HAVING COUNT(*)>=5

) AS m ON e.id=m.managerId
