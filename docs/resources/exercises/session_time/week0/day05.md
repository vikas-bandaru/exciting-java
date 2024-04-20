---
layout: default
title: Practice Session
parent: Day 5
grand_parent: Week 1
has_children: true
nav_order: 2
---

# Module 1: Java Foundations
{: .no_toc }
## Day 5: Introduction to Java through BlueJ
{: .no_toc }
## Practice Session
{: .no_toc }

<details open markdown="block">
  <summary>
    Table of contents
  </summary>
  {: .text-delta }
1. [Download and Extract BlueJ Standalone](#download-and-extract-bluej-standalone)
   {:toc}
2. [Download Week 1 BlueJ projects](#download-week-1-bluej-projects)
   {:toc}
3. [Exercises on _figures_ project](#exercises-on-figures-project)
   {:toc}
</details>

### Download and Extract BlueJ Standalone
   - [Instructions](../../../instructions/software-needed#installing-bluej)
   - Extract using WinRAR to a safe location
   - Send a shortcut of the file (bluej) to Desktop
   - Rename the short on Desktop to a meaningful name, "BlueJ Standalone 5.3"

### Download Week 1 BlueJ projects
   1. [**figures**](../../../projects/bluej/part01/figures.zip)
   2. [**house**](../../../projects/bluej/part01/house.zip)
   3. [**lab-classes**](../../../projects/bluej/part01/lab-classes.zip)

### Exercises on _figures_ project
1. Start BlueJ and open the project named _figures_.
   Right-click on one of the circle objects (not the class!), Choose `makeVisible` from the menu. Observe what happens…  
   Try:  
   - `moveRight`
   - `moveDown`
   - `makeInvisible`
   - `makeVisible`
2. _Experiment:_ What happens if you call `moveDown` twice? Or three times? What happens if you call `makeInvisible` twice?
3. Invoke the `moveHorizontal` method. You will see a dialog appear that prompts you for some input. Type in 50 and click OK. Observe what happens…  
**Discuss:** How is it different from `moveRight` or `moveLeft` ?
4. Try invoking the `moveVertical`, `slowMoveVertical`, and `changeSize` methods before you move on.
5. **Challenge:** Find out how you can use `moveHorizontal` to move the circle 70 pixels to the left.
6. Try invoking the `changeColor` method and see what happens when you specify a color that is not known.
7. Invoke the `changeColor` method, and write the color into the parameter field without the quotes. What happens?
8. Create several circle objects on the object bench. You can do so by selecting `new Circle()` from the pop-up menu of the `Circle` class. Make them visible, then move them around on the screen using the "move" methods. Make one big and yellow; make another one small and green. Try the other shapes too: create a few triangles, squares, and persons. Change their positions, sizes, and colors.  
**Discuss:** Does changing an attribute of one object affect another object?
9. **Experiment:** Make sure you have several objects on the object bench, and then inspect each of them in turn. Try changing the state of an object (for example, by calling the moveLeft method) while the object inspector is open. You should see the values in the object inspector change.