# Binary-Search-Tree
Binary Search Tree  
      Algorithm 
1. Create Node Structure
    2. Create Tree Class
    3. Insert to tree
        1. Check if tree is empty, if so , add there
        2. If not empty, check value compared to current node, if less recursively add to left, if greater, recursively add to right
        3. return the current tree (or recursive call)
    4. Find value
        1. Check value against root node, if root is null, return false
        2. If equal, return true, if less recursively search left, if greater recursively search right and return
