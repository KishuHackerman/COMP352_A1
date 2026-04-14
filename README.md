# Tetranacci Performance Analyzer

A Java program that computes Tetranacci numbers using two recursive approaches and compares their execution times.

## Features
- Computes Tetranacci numbers using a multiple recursive method
- Computes Tetranacci numbers using a linear recursive method
- Measures execution time for both approaches
- Writes results to a text file for comparison

## Tech Stack
- Java

## Concepts Used
- Recursion
- Time complexity analysis
- Performance benchmarking
- File output handling

## Methods
- `multipleRecursion(int n)` - computes Tetranacci numbers using exponential recursion
- `linearRecursion(int n, long a, long b, long c, long d)` - computes Tetranacci numbers using linear recursion
- `main(String[] args)` - runs performance comparisons for selected input values and writes results to `TetraOut.txt`

## How to Run
1. Compile the program:
   ```bash
   javac Tetranacci.java

2. Run the program
   ```bash
   java Tetranacci

The program writes performance results to a file named TetraOut.txt.
