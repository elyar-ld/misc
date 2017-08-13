## Sierpinski Triangle Generator

This script generates a [Sierpinski Carpet](https://en.wikipedia.org/wiki/Sierpinski_carpet) .png image recursively.

To call this script a parameter ``` size ``` must be provided:

```
SierpinskiTriangle 6
```
This will generate a square image of 3^6 size each side.

Currently a maximum of ``` size = 8 ``` is supported, because of Java heap space out of memory :/.
