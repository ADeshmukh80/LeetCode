# Write your MySQL query statement below
SELECT s.name FROM SalesPerson s
WHERE NOT EXISTS(
    SELECT s.name
    FROM Orders o
    LEFT JOIN Company c ON o.com_id = c.com_id
    WHERE s.sales_id = o.sales_id AND c.name = 'RED'
)