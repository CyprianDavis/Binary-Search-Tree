# Binary-Search-Tree
Binary Search Tree  
      Algorithm 
1. Create Node Structure
   Create Tree Class
   Insert to tree
         Check if tree is empty, if so , add there
         If not empty, check value compared to current node, if less recursively add to left, if greater, recursively add to right
         return the current tree (or recursive call)
    2. Find value
         Check value against root node, if root is null, return false
         If equal, return true, if less recursively search left, if greater recursively search right and return
