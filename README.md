Training my devloper-brain
==========================

Due to some personal circumstances I'm currently not developing on a professional basis. Nevertheless, I want to keep my brain trained with solving some algorithmic problems. A friend told me about this nice challenge for software developers called "advent of code". In this repo I am publishing my implementation for these brain-twisters. I had fun while solving the challenges of the "advent for code". You may want to try them first, before looking at my implementation.
Here is the link: https://adventofcode.com/2017

Currently I solved the folling days:
* Day 1
* Day 2
* Day 3


Algorithm for day 3
-------------------

For the algorithm of day 2 I first calculated the circle the number is in. If you take a closer look at the matrix you can see that each circle ends with the square of an odd number (1 => 1, 3 => 9, 5 => 25, 7 => 49 and so on).

| 37 | 36 | 35 | 34 | 33 | 32 | 31 |
| 38 | 17 | 16 | 15 | 14 | 13 | 30 |

39  18   5   4   3  12  29
40  19   6   1   2  11  28
41  20   7   8   9  10  27
42  21  22  23  24  25  26
43  44  45  46  47  48  49 ...

For each number we need at least the number of circles minus 1 steps (minus 1 because we are counting the steps, not the fields).
Furthermore, we need to calculate the number of steps in the right direction. Therefore, I splitted the matrix into 4 quadrants. If you start at the starting point (number 1) and look to the right you find the numbers 2, 11, 28, ... this numeric row is the result of the highest number of the inner circle plus the number of the current cirlce. This can similar applied to the other directions. For example, if you start at the starting point (number 1) and you go up, this row results the highest number of the inner circle plus the number of the current cirlce times 2.
In the end the number of steps is the number of circles (either up, down, left or right) plus the number of steps in the right direction which is the difference between the number of the quadrant and the input number.
