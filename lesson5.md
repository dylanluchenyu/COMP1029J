# Lesson 5 - using Greenfoot

## lesson 5.1 - Using Greenfoot

1.What is Greenfoor

Greenfoor is a free interactive development environment for java, specically designed fo edcuational purpose.

2.Installing Greenfoot

[Download Greenfoot](http://www.greenfoot.org/)

3.Starting to Use Greenfoot

This is what you should see when you first start Greenfoot

![1752470205662](image/lesson5/1752470205662.png)

You can create a new scenario (i.e. project), and you will be asked to provide a location for it. However, it would be better to create a new folder for your new scenario. After you create the scenario you will see the Greenfoot window as shown below:

![1752470386707](image/lesson5/1752470386707.png)

As you can see from the title of the window, the new scenario we have created is called *HelloWorld*. All you need to do is to create a subclasss for the **World** Class and some subclasses for the **Actor** class.

4.The World Class

*The World class* is the base class of the 'world' of your Greenfoot program. For example, if we want to create a game about space we can create a space world like this:

![1752470706236](image/lesson5/1752470706236.png)

5.The Actor Class

The **Actor** class is the base class of 'actors' that you want to put into your world. The **Actor** class also provides many useful properties and methods that you can use to program with your actors.

For example, we can put a space ship into the space world we have created above:

![1752473508483](image/lesson5/1752473508483.png)

In the next two parts of this lesson, we will discuss how to create and program a new world and some actors in a Greenfoot scenario.

6.Creating a New World

If you want to create your own world, you will need to remove this class and create a subclass of the **World** class.To create a subclass of the **World** class, you can right-click on the **World** class, like this:

![1752473697107](image/lesson5/1752473697107.png)

After doing that you can see two options in the popup menu. If you click on the first option *Open Documentation*, it will open a webpage containing the documentation of the **World** class. The second option *New subclass* is the one we want to use here. After clicking the second option:

![1752473860341](image/lesson5/1752473860341.png)

Let's select a space background by going to *Image Categories > backgrounds > space.jpg* . In this window, you also need to give a proper class name for this subclass. Let's call this subclass **Space**.

![1752473990287](image/lesson5/1752473990287.png)

Once you have added the subclass you cannot really see the space world inside the Greenfoot window. You need to create a new instance of the world in the main window to get the new class working, like this:

![1752474029659](image/lesson5/1752474029659.png)

If you want to take a look at the code of your new subclass you can right-click on your new class and select *Open editor*.

```java
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Space extends World
{
    /**
     * Constructor for objects of class Space.
     */
    public Space() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    }
}
```

There is essentially one line of useful code in the class, i.e.:

```java
super(600,400,1);
```

The **super** method is the constructor of the base class, i.e. the **World** class. The overall size of the world is then specified by how many cells in the x direction (number of columns), how many cells in the y direction (number of rows) and the size of the square, like this:

![1752474315215](image/lesson5/1752474315215.png)

You can change the parameters so that there are 300 cells in the horizontal direction, 200 cells in the vertical direction and the cell size remains as 1, like this:

```java
super(300, 200, 1);
```

The above line of code will create the world as shown below:

![1752474475878](image/lesson5/1752474475878.png)

7.Creating a New Actor

You have the world ready from the previous part of the lesson. Let's add some actors into the world. To create a subclass of the **Actor** class you go to the right hand side of the Greenfoot window and right-click on the **Actor** class, like this:

![1752474705592](image/lesson5/1752474705592.png)

![1752475691847](image/lesson5/1752475691847.png)

![1752475767397](image/lesson5/1752475767397.png)

After creating a new instance of the **Spaceship** class, you can drag and put the **spaceship** object anywhere inside the world. For instance, you can put the spaceship near the top left hand corner of the world.

Here is an expample where three different actors are created and put on the space world:

![1752475966790](image/lesson5/1752475966790.png)

## lesson 5.2 -  Creating a Spaceship in a Game

1.Adding a Spaceship in the World

In the rest of this leesson we will discuss how to make a spaceship game. As the first step, we will make a spaceship.

Here is how the spaceship works. The player can control the spaceship to move using a combination of the left, right and up arrow keys. The movement control of the spaceship is shown below:

![1752476392850](image/lesson5/1752476392850.png)

We will use the space world and the spaceship we have created in the previous part of lesson to make the game. After initializing the size of the game world let's add our spaceship here. When you manually
create your spaceship you need to create an instance of the spaceship by right-clicking on the **Spaceship** class. Equivalently we can create an instance of a spaceship using one line of code:

```java
Spaceship spaceship = new Spaceship();
```

At this stage, the spaceship is in the memory only. It is not anywhere in the display of the world. Greenfoot provides a handy method for us to put any actor in the world. The method is called **addObject**, which is a method of the **World** class (which means the method is inherited by all its subclasses).

```java
addObject(spaceship, 300, 200);
```

The above line of code means that we put the newly created spaceship object in the world at the location (300, 200).

2.Making the Player Move

We have put the spaceship in the space world. However, it cannot move. To make any actor move we have to write the corresponding code in the actor's class. Before we write the code, let's look at the use of the **act** method. If you look at the Greenfoot window you can see there are a few buttons at the bottom, as shown below:

![1752477041283](image/lesson5/1752477041283.png)

If you press the *Act* button, the **act** methods of all current objects in the scenario, i.e. the world and all the actors inside the scenario, will be run. Instead of pressing the *Act* button continuously you can press the *Run* button. If you do that the **act** methods will be automatically run continuously. How fast the methods are going to be run can be controlled by the *Speed* slider. You can choose to run them fast or slow.

Let's change the **act** method of the spaceship into this:

```java
public void act()
{
    move(4);
}
```

The above code means the spaceship moves four cells in one unit of time. (The **move** method is inherited from the base class Actor)

3.Turning the Player Using the Keyboard

Instead of using the **move** method, we can use the **turn** method to turn, i.e. rotate, the spaceship. You need to give one parameter to the **turn** method. The parameter determines the angle (in degrees) you want to turn the actor.

> A positive angle means turning to the right and a negative angle means turning to the left.

```java
public void act()
{
    turn(3);
}
```

If you run the scenario, you will see your spaceship turning continuously to the right, like this:

![1752477757573](image/lesson5/1752477757573.png)![1752477765482](image/lesson5/1752477765482.png)![1752477771884](image/lesson5/1752477771884.png)![1752477776390](image/lesson5/1752477776390.png)![1752477779651](image/lesson5/1752477779651.png)

However, we don't really want the spaceship to turn by itself! We want the player to control it using the left and right arrow keys. Greenfoot provides a useful method from the **Greenfoot** class called **isKeyDown**.

```java
if (Greenfoot.isKeyDown("left")) {
    ...
}
```

We simply run the **turn** method only if the left arrow key has been pressed, like this:

```java
public void act()
{
    if (Greenfoot.isKeyDown("left")) {
        turn(-3);
    }
}
```

4.Finishing the Player Control

Now, we can combine what we have before to finish the player control.

Here is the code of the act method for controlling the spaceship:

```java
public void act()
{
    // Rotate the spaceship based on the key pressed
    if (Greenfoot.isKeyDown("left")) {
        turn(-3);
    }
    else if (Greenfoot.isKeyDown("right")) {
        turn(3);
    }

    // Move the spaceship based on the key pressed
    if (Greenfoot.isKeyDown("up")) {
        move(4);
    }
}
```

## lesson 5.3 - Creating an Enemy in the Game

1.Creating a Rock Actor

Just having a spaceship is not a playable game. Let's add some enemies to the game.

In this part of the lesson we will add some rocks to the game. Let's create a new subclass called **Rock** and then use an image from *Image Categories > nature > rock.png* in the new class window, as shown below:

![1752478643894](image/lesson5/1752478643894.png)![1752479006469](image/lesson5/1752479006469.png)

2.Moving the Rock Randomly

The rock is the enemy in the game. It would be great if the rock randomly os that the player has to control the spaceship ot stay away from the rock. To do that, first we will learn to use a method called **getRandomNUmber** from the **Greenfoot** class.

The **getRandomNumber** method takes a single parameter and then returns a random number from 0 up to but excluding the input parameter. Here is an example:

```java
int number - Greenfoot.getRandomNumber(10);
```

The above code generates a random number and puts the number into the **number** variable.

Since we want to turn the rock at the very start we can put the code in the constructor of the **Rock** class. At the moment, the constructor is not in the code of the class so we have to manually create it like this:

```java
public Rock()
{
    super();

    // Randomly turn the rock
    turn(Greenfoot.getRandomNumber(360));
}
```

Therefore, the above code turns the rock in a random direction.

![1752479633763](image/lesson5/1752479633763.png)

3.Automatically Removing the Rocks

The rocks stay there after hitting the border of the world because the **World** class, by default, does not allow any actor to move outside of the world, so you will find that the rocks stay on the border of the world, like the display shown below:

![1752479965917](image/lesson5/1752479965917.png)

Because of this, we need to slightly amend the **Space** class. Here is the constructor of the **Space** class:

```java
public Space()
{
    super(600, 400, 1);

    Spaceship spaceship = new Spaceship();
    addObject(spaceship, 300, 200);
}
```

We need to modify this line of code:

```java
super(600, 400, 1);
```

into this line of code:

```java
super(600, 400, 1, false);
```

The added parameter means that the world will now let every actor move out of the world without staying on the border.

If we do this we will introduce a new problem. The problem is that when a rock moves out of the display of the world it is not part of the game and therefore it should be removed. Greenfoot does not automatically do this. We need to write our own code to remove any actor which has moved out of the world. To do this, we simply add some code in the **act** method, like this:

```java
public void act()
{
    // Move the rock in a unit of time
    move(4);

    // Remove the rock if it is out of the world
    World world = getWorld();
    if (getX() < 0 || getX() >= world.getWidth() ||
        getY() < 0 || getY() >= world.getHeight()) {
        world.removeObject(this);
    }
}
```

The keyword **this** here means the rock object itself. In general, whenever you want to refer to the instance of a class inside the class method, you use the keyword  **this**.

4.Adding Rocks to the World Randomly

Up to now, we have to manually add our rocks to the world. Similar to what we have done for the spaceship, we should add the rocks to the game automatically. However, this time, we will not add our rocks from the constructor of the **Space** class. This is because we need to add rocks to the game continuously, instead of just at the start of the game.

To do that, we will make use of the **act** method of the **Space** class:

```java
public void act()
{
    // Add a rock anywhere along the border of the game
    Rock rock = new Rock();
    switch (Greenfoot.getRandomNumber(4)) {
        case 0:
            // Add the rock on the top border
            addObject(rock, Greenfoot.getRandomNumber(getWidth()), 0);
            break;
        case 1:
            // Add the rock on the bottom border
            addObject(rock, Greenfoot.getRandomNumber(getWidth()), getHeight() - 1);
            break;
        case 2:
            // Add the rock on the left border
            addObject(rock, 0, Greenfoot.getRandomNumber(getHeight()));
            break;
        case 3:
            // Add the rock on the right border
            addObject(rock, getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
            break;
    }
}
```

![1752481129792](image/lesson5/1752481129792.png)

To control the amount of rocks added to the game we will choose the timing carefully. The way that we do it is to add a rock based on a certain probability. Let's say we will add a rock in one unit of time with a probability of 0.1.

Here is what we do in the **act** method:

```java
public void act()
{
    // Add a rock anywhere along the border of the game
    // with a probability of 0.1
    if (Greenfoot.getRandomNumber(100) < 10) {
        ...add a rock on the border of the game...
    }
}
```

## lesson 5.4 - Finishing the Game

1.Collision between the Spaceship and a Rock

If any of the rocks is too close to the spaceship, the spaceship will be destroyed by the rock and the game will be over.

![1752482458324](image/lesson5/1752482458324.png)

In this final part of the lesson, we will finish the game by checking this game over situation. Since the spaceship and the rocks are moving continuously we need to check for this situation each time they have been moved.

A useful method from the **Actor** class we can use here is called  **getObjectsInRange**. The method finds the objects that collide with the current actor within a given distance.

> The first parameter is the distance between the current actor and the objects that you want to search for. The second parameter is the class of objects that you are looking for. The method returns a **java.util.List** object, which stores the list of objects that is the given distance or smaller away from the actor.

Here is how we use the method in the **Spaceship** class:

```java
if (!getObjectsInRange(60, Rock.class).isEmpty()) {
    ...at least one rock collides with the spaceship...
}
```

We will give a brief description of the list object, i.e. a **java.util.List** object, in the next part of the lesson.

2.Using the List Object

To use the **List** class you need to import the class using this line of code at the top of your file:

```java
import java.util.List;
```

Let's briefly look at what we can do with the list.

The first thing is the **isEmpty** method, which you have seen already. You can use this method to check if the list is empty, like this:

```java
List list = getObjectsInRange(60, Rock.class);
if (list.isEmpty()) {
   ...the list is empty, do something...
}
```

You can also use the **size** method to get the exact amount of items in the list. For example, you can use **list.size()** to get back how many rocks are colliding with the spaceship now.

If you know that the list is not empty, you can get back the first rock from the list like this:

```java
Rock rock = (Rock) list.get(0);
```

This method gives the list of a class of objects currently in the world in the scenario. For example, you can use the following code inside the spaceship to get **all** rocks currently in the game:

```java
List list = getWorld().getObjects(Rock.class);
```

3.Stopping the Game When the Game is over

You know how to stop the scenario by pressing the *Pause* button. However, can we do that in code? What we need to do in the **act** method of the **Spaceship** class is to stop the game when a rock is too close to the spaceship. The code is shown below:

```java
public void act()
{
    // Rotate the spaceship based on the key pressed
    if (Greenfoot.isKeyDown("left")) {
        turn(-3);
    }
    else if (Greenfoot.isKeyDown("right")) {
        turn(3);
    }

    // Move the spaceship based on the key pressed
    if (Greenfoot.isKeyDown("up")) {
        move(4);
    }

    // Check if a rock hits the spaceship
    if (!getObjectsInRange(60, Rock.class).isEmpty()) {
        // Stop the game
        Greenfoot.stop();
    }
}
```

4.Showing an Explosion

We want to show the explosion of the spaceship by adding an explosion image.

The first step is to create an actor using the explosion image as shown below:

![1752484202634](image/lesson5/1752484202634.png)

We will use the following settings to create the actor:

![1752483744695](image/lesson5/1752483744695.png)

Note that we use our own image this time. Here is the code we used in the previous example to stop the game when it is over:

```java
// Check if a rock hits the spaceship
if (!getObjectsInRange(60, Rock.class).isEmpty()) {
    // Stop the game
    Greenfoot.stop();
}
```

Let's insert some explosion code before we stop the game. First, we will show the explosion, i.e. an explosion actor, at the same location of the spaceship, using the code:

```java
Explosion explosion = new Explosion();
getWorld().addObject(explosion, getX(), getY());
```

By doing this, the explosion will now be displayed above the spaceship, like this:

![1752483925065](image/lesson5/1752483925065.png)

Since the spaceship has been exploded we will remove the spaceship altogether before we stop the game. So let's add one more line of code to remove the spaceship from the world. Here is the line of code:

```java
getWorld().removeObject(this);
```

Here is an example of our improved game over screen:

![1752483998810](image/lesson5/1752483998810.png)
