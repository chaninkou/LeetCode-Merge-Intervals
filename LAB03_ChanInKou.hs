-- 1. Create three functions of your choice starting with a type declaration

removeLowercase :: [Char] -> [Char]
removeLowercase st = [ c | c <- st, c `elem` ['A'..'Z']] 

removeUppercase :: [Char] -> [Char]
removeUppercase st = [ c | c <- st, c `elem` ['a'..'z']] 

factorial :: Integer -> Integer
factorial n = product [1 .. n]


-- 2. Create a function that takes in a typeclass of Num and returns a typeclass of Num (include type declaration) that adds the two numbers together

addTwo2 :: (Num a) => a -> a -> a
addTwo2 x y = x + y

-- 3. Create a function (with type declaration) that takes a String representation of a floating point number (e.g., "3.455") and adds it to a Float (e.g., 3.4). 

stringToFloat :: String -> Float -> Float
stringToFloat x y = (read x) + y


-- 4. Create a function (with type declaration) that takes Ints, and if the number is 1,2, or 3 output the strings "Once", "Twice", "Thrice"; if it is greater than 3, print "Don't know how to say that in English."

typeNumber :: (Integral a) => a -> String  
typeNumber 1 = "Once!"  
typeNumber 2 = "Twice!"  
typeNumber 3 = "Thrice!"  
typeNumber x = "Don't know how to say that in English" 

-- 5. Create 4 functions (with type declaration) that take quadruples of any type. The first function returns the first element, the second the second element, and so on. 
first :: (a, b, c, d) -> a 
first (x, _, _, _) = x

second :: (a, b, c, d) -> b 
second (_, x, _, _) = x

third :: (a, b, c, d) -> c 
third (_, _, x, _) = x

fourth :: (a, b, c, d) -> d  
fourth (_, _, _, x) = x


-- 6. Create a recursive function with type declaration that takes in an Int and an exponent (also Int) and returns the first number raised to the second.


power :: Int -> Int -> Int
power x 0 = 1
power x 1 = x
power x y = x * (power x (y-1))




-- 7. Using list pattern matching, create a function that multiplies the first three elements of a list of Ints (or all the elements, if the list has 3 or less elements, 0 if the list is empty) and returns the result. Include type declaration.  

matching :: [Integer]  -> Integer
matching [] = 0 
matching (a:[]) = a
matching (a:b:[]) = a * b  
matching (a:b:c:_) = a * b * c  








