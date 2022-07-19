## LCA  (Lowest-Common-Ancestor) In-Binary-Search-Tree
####  Description
* The lowest common ancestor (LCA) of two nodes x and y in the BST is the lowest (i.e., deepest) node that has both x and y as descendants, where each node can be a descendant of itself (so if x is reachable from w, w is the LCA). In other words, the LCA of x and y is the shared ancestor of x and y that is located farthest from the root.

>> Basic Structure
 ```` 
        n1
       /   \
      /     \
     n2     n3
    / \     / \
   /   \   /   \
  n4    n5 n6   n7
````

* A simple solution would be to store the path from root to x and the path from the root to y in two auxiliary arrays. Then traverse both arrays simultaneously till the values in the arrays match. The last matched value will be the LCA. If the end of one array is reached, then the last seen value is LCA. The time complexity of this solution is O(n) for a binary search tree with n nodes. However, it requires O(n) auxiliary space for storing two arrays.
*
* using BST properties, we can find LCA in O(h) time when h is the height of the tree.

#### Clone the application
``````
git clone https://github.com/Lowest-Common-Ancestor-In-Binary-Search-Tree.git
``````

### *  Build and run the app using maven

>> cd Lowest-Common-Ancestor-In-Binary-Search-Tree
> 
````
mvn package
````


##### Alternatively, you can run the app without packaging it using -
````
mvn clean
mvn compile
mvn run
````