# Collections and Stream API in Java

This repository contains an overview of the basic Java Collection Framework interfaces (`List`, `Set`, `Map`) and the `Stream API`, which is a powerful tool for working with sequences of data.

---

## Table of Contents

- [List](#list)
- [Set](#set)
- [Map](#map)
- [Stream API](#stream-api)
- - [Hierarchy of Collection Framework](#hierarchy-of-collection-framework)


---

## List

The `List` interface represents an **ordered collection** (also known as a sequence). It allows **duplicate elements** and provides indexed access to elements.

Key features:
- Elements are ordered by insertion.
- Allows duplicate elements.
- Provides methods for positional access, insertion, and removal of elements.
- Common implementations:
  - `ArrayList`: Resizable array implementation.
  - `LinkedList`: Doubly-linked list implementation.

---

## Set

The `Set` interface represents a **collection** that contains **no duplicate elements**. It models the mathematical set abstraction.

Key features:
- Does **not allow duplicates**.
- The elements are **not ordered** (in most implementations).
- Provides basic methods for adding, removing, and checking for elements.
- Common implementations:
  - `HashSet`: Stores elements in a hash table.
  - `TreeSet`: Orders elements using a red-black tree (sorted set).
  - `LinkedHashSet`: Maintains insertion order using a linked list.

---

## Map

The `Map` interface represents a **collection of key-value pairs**, where each key is **unique**.

Key features:
- Maps **keys to values**.
- **No duplicate keys** are allowed.
- Values can be duplicated.
- Provides methods to retrieve, add, or remove key-value pairs.
- Common implementations:
  - `HashMap`: Hash table-based implementation.
  - `TreeMap`: Sorted map based on a red-black tree.
  - `LinkedHashMap`: Maintains insertion order.

---

## Stream API

The `Stream API` is used to process collections of objects in a **functional style**. Streams provide a powerful way to work with sequences of data using **declarative** methods.

Key features:
- Supports **sequential** and **parallel operations** on collections.
- Allows **filtering, mapping, reducing**, and more.
- **Lazy evaluation**: Intermediate operations are not executed until a terminal operation is invoked.
- **Non-interfering**: Streams do not modify the source.
- **Stateless**: Intermediate operations don’t have state beyond their inputs.

Stream operations are divided into:
- **Intermediate operations** (e.g., `filter`, `map`) that return a new stream and are lazily evaluated.
- **Terminal operations** (e.g., `collect`, `forEach`) that produce a result or a side-effect and terminate the stream pipeline.

---

## Hierarchy of Collection Framework

Here is an illustration of the Java Collection Framework hierarchy:

![Hierarchy of Collection Framework](assets/collection-hierarchy.png)

The diagram shows the structure of key interfaces and classes in the Collection Framework, including `List`, `Set`, `Queue`, `Map`, and their implementations.

