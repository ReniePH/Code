Reading and writing of a basic shop items list to and from .txt file
====================================================================
###The program has a problem which no matter how much i tried, i wasn't able to solve it. i don't have the option to get a line down can you help?
###I even tried a different kind of writer but then it just didn't write a thing.
### please explain to me what FileInputStream, DataInputStream, and BufferedReader have in common and why we have to wrap them on top of each other 

### Shop
* Represents the shop item properties which are set to "name" and "price".
* Holds the different actions that can be implied to the shop item.

### ShopItemList
* Represents the entire shop item collection data as an Arraylist.
* Holds the different actions that can be implied to the shop item list, which are necessary for this program.

### FileReadingAndRewriting
* base of actions on files
* Reads the file and insert the different values into the ShopItemList list.
* In case of a missing file is able to create one with the basic value of null and alert the user about it.
* returns the list with the values that were in the shop.txt file 
* Receives the list Containing all the shop items values and changes it according to the users actions.


###ActionsOnShopItems
*is able to: 
*add an item to the list(through FileReadingAndRewriting methods) 
*remove an item according to its index(through ShopItemList methods 
*print the items.


### Main
* Unify the ReadFile and RewriteFile to a program that is capable of reading and writing from a .txt file.