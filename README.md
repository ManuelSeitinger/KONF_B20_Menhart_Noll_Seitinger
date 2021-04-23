# Drinks Sample 

## Authors 
- *Simon Noll* : HotDrink.java
- *Manuel Seitinger* : Cocktails.java
- *Helmut Menhart* : FreshJuice.java
------

## Log
- Getting familiar with git(hub); First pulls, commits, pushes, merges ...
- Added class Cocktail
- Implemented methods in class Cocktail
- Added some comments to Cocktail
- Added class FreshJuice.
- Pimped README.md; Tried out some **markdown** features from [Markdown tutorial](https://www.youtube.com/watch?v=6A5EpqqDOdk "Click for watching ;)")
- Added class HotDrink
- Added class Powder
- Implemented methods to HotDrink
- Implemented methods to Powder
- Added comments to HotDrink
- Added comments to Powder
- Added dependencies to pom.xml
- Deleted second README
---------
- **Start of exercise 04**
- Versioned repository --> v1.0
- Created extended (java) .gitignore
- Created branch test_menhart and startig to implement tests...
- Creating FreshJuiceTest and SimpleDrinkTest
- @ test_menhart: Tests implemented successfully - method and line coverage 100%
- Merged test_menhart into main
- Added java doc comments to HotDrink and Powder
- Changed return value of method makeHotDrink to string for testing purpose
- Created branch test_noll
- Created class HotDrinkTest
- Created branch test_seitinger
- Created new test class CocktailTest
- Added comments to HotDrinkTest
- Created and implemented class PowderTest
- Merged test_noll to main
- Created and implemented new test class LiquidTest
- Merged test_seitinger into main
- Added documentation to class Cocktail.java
- Merged changes from test_seitinger into main
- Change directory structure (hopefully) according to maven  

-------

## *@Testing*

- Actual junit coverage: 

	1. 87% (7/8) class

	2. 93% (31/33) method

	3. 72% (80/110) line

--> The 100% code coverage problem...

### p.e.
- Some getter/setter methods are not used - makes no sense to implement just
to strive for 100%
- Use of testing objects constructed in main?
- Code coverage != quality of tests
- ...

Consider:

![](https://github.com/ManuelSeitinger/KONF_B20_Menhart_Noll_Seitinger/blob/main/pics/effortvalue.png)

For more read this: [click me](https://jeroenmols.com/blog/2017/11/28/coveragproblem/ "your way to interesting article")

---------

# javadoc crash course

Comments marked with ...

`
/** ... */ #delimiters
`

... are processed by the javadoc tool to generate the API docs

javadoc = The JDK tool that generates API documentation from documentation comments.

## p.e.:
A doc comment is written in HTML and must precede a class, field, constructor or method declaration. It is made up of two parts -- a description followed by block tags.

Order of Tags

Include tags in the following order:

    • @author (classes and interfaces only, required) 
    • @version (classes and interfaces only, required. See footnote 1) 
    • @param (methods and constructors only) 
    • @return (methods only) 
    • @exception (@throws is a synonym added in Javadoc 1.2) 
    • @see 
    • @since 
    • @serial (or @serialField or @serialData) 
    • @deprecated

**Sources:**

- [oracle / javadoc](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)
- [markdown](https://www.markdownguide.org/cheat-sheet)
- [markdown (video)](https://www.youtube.com/watch?v=6A5EpqqDOdk)
