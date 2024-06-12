# Data Structures Project

This project implements several fundamental data structures in Java, including Queue, Stack, Tree, and Binary Search Tree (BST).

## Overview

The aim of this project is to provide a clear and concise implementation of several key data structures. Each data structure is implemented in its own module, with methods that illustrate typical operations associated with that structure.

## Data Structures

### Queue

A Queue is a linear data structure that follows the First In First Out (FIFO) principle. It supports the following operations:
- `enqueue(item)`: Add an item to the end of the queue.
- `dequeue()`: Remove and return the item at the front of the queue.
- `is_empty()`: Check if the queue is empty.

### Stack

A Stack is a linear data structure that follows the Last In First Out (LIFO) principle. It supports the following operations:
- `push(item)`: Add an item to the top of the stack.
- `pop()`: Remove and return the item at the top of the stack.
- `is_empty()`: Check if the stack is empty.

### Tree

A Tree is a hierarchical data structure consisting of nodes, with a single node acting as the root of the tree. Each node may have zero or more child nodes. Typical operations include:
- `insert(value)`: Add a child node to the current node.
- `traverse()`: Traverse the tree (e.g., in-order, pre-order, post-order).

### Binary Search Tree (BST)

A Binary Search Tree is a special kind of tree where each node has at most two children, referred to as the left and right child. It supports the following operations:
- `insert(value)`: Insert a new value into the BST.
- `inorder_traversal()`: Perform an in-order traversal of the BST.