# About the design of our Drinks-Project

Welcome to our Drinks-Project - the first project in which we have used maven as a build management system, as part of software configuration management

___

### Why the ICashRegister interface?

After having a pronounced discussion of how to meet the requirements of last exercise we
decided on solving the problem with an interface, because as Drinks implements an
abstract class and any real drink has to consist of one or more concrete liquids,
we thought that an interface would do the best job, by acting as a kind of contract 
between all "real" drinks classes e.g. *HotDrink, Cocktail, FreshJuice* and so on, as
to implement the functionality of being sold, and the value of that transaction
being stored in a cash register.

Anyway, since the interface only consists of one method signature, the same implementation 
in the drinks class would have done that job as well. Though somehow redundant we 
decided to leave both possibilities in for demonstration reasons ;)


