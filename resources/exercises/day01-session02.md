---
layout: default
title: Day01:Session 2
nav_order: 4
---
<!-- [Back to Home](../../index.md) ==> not working -->
# Session Exercises

## Day 1: Session 2

### Exercises on *figures* project

1. Start BlueJ and open the example named *figures*.
   Right-click on one of the circle objects (not the class!), Choose `makeVisible` from the menu. Observe what happens…

   Try:
   - `moveRight`
   - `moveDown`
   - `makeInvisible`
   - `makeVisible`
2. *Experiment:* What happens if you call `moveDown` twice? Or three times? What happens if you call `makeInvisible` twice?
3. Invoke the `moveHorizontal` method. You will see a dialog appear that prompts you for some input. Type in 50 and click OK. Observe what happens… How is it different from `moveRight` or `moveLeft` ?
4. Try invoking the `moveVertical`, `slowMoveVertical`, and `changeSize` methods before you move on.
5. **Challenge:** Find out how you can use `moveHorizontal` to move the circle 70 pixels to the left.
6. Try invoking the `changeColor` method and see what happens when you specify a color that is not known.
7. Invoke the `changeColor` method, and write the color into the parameter field without the quotes. What happens?
8. Create several circle objects on the object bench. You can do so by selecting `new Circle()` from the pop-up menu of the `Circle` class. Make them visible, then move them around on the screen using the "move" methods. Make one big and yellow; make another one small and green. Try the other shapes too: create a few triangles, squares, and persons. Change their positions, sizes, and colors.
9. Does changing an attribute of one object affect another object?
10. **Experiment:** Make sure you have several objects on the object bench, and then inspect each of them in turn. Try changing the state of an object (for example, by calling the moveLeft method) while the object inspector is open. You should see the values in the object inspector change.
11. **Challenges:**
    Choose one of these images and recreate it using the shapes from the *figures* project. While you are doing this, write down what you have to do to achieve this. Could it be done in different ways?
    ![House Challenge](images\session01-challenge01.png "A House with Sun")
    ![Couple](images\session01-challenge02.png "A Couple seeing Sunset")

### Exercises on *house* project

1. Open the *house* project. Create an instance of class `Picture` and invoke its `draw` method. Also, try out the `setBlackAndWhite` and `setColor` methods. How do you think the `Picture` class draws the picture?