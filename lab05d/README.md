**(d) **The ratio of the circumference of a circle to its diameter is commonly known as the constant ***pi*** (often written using the Greek letter, **π** ). Its value can be approximated in numerous ways, one of which is the following infinite series (which gives increasingly accurate values the more terms are included):

![PI using infinite series](http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab05/pi_series1.svg "Series expansion of PI")

**Design** and implement a little program that will output the value of ***pi*** by computing it in three different ways:

1.  using the Java constant, Math.PI
2.  using the formula above, ask the user to enter the number of terms of the series to compute, and then compute and report ***pi*** to the desired number of terms. For example, if the user entered 3, it should compute the value of ***pi*** using just the first 3 terms, i.e.  4/1 - 4/3 + 4/5.
3.  using the formula above, compute the series to a user specified accuracy, e.g. error < 0.01