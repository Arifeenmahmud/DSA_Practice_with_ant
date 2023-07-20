In here We have used Set Interface to solve this problem. 
```java
Set is and Interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
Set has various methods to add, remove clear, size, etc to enhance the usage of this interface.

Set Interface Methods:
1. add() method: It is used to add an element to the Set.
2. remove() method: It is used to remove an element from the Set.
3. clear() method: It is used to remove all the elements from the Set.
4. contains() method: It is used to check whether an element is available in the Set or not. It returns True if the element is available and returns False if the element is not available.
5. size() method: It is used to get the size of the Set. The size of the Set is the number of elements present in the Set.
6. isEmpty() method: It is used to check whether the Set is empty or not. It returns True if the Set is empty and returns False if the Set is not empty.
7. iterator() method: It returns an iterator object which is used to iterate over the elements of the Set.
8. toArray() method: It returns an array containing all the elements of the Set.
9. addAll() method: It is used to add all the elements of a collection to the Set.

in containsDuplicate method we have used add() method of Set Interface to add all the elements of the array to the Set.
If the Set already contains the element, the add() method returns False and we return True from the method.
