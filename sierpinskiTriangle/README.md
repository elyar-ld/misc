## Sierpinski Triangle Generator

This script generates a [Sierpinski Triangle](https://en.wikipedia.org/wiki/Sierpinski_triangle) .png image recursively.

To call this script a parameter ``` size ``` must be provided:

```
SierpinskiTriangle 10
```
This will generate a square image of 2^10 size each side.

Currently a maximum of ``` size = 13 ``` is supported, because of Java heap space out of memory :/.
