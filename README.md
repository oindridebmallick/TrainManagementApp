# Train Consist Management App

A console-based Java application that simulates how a railway system manages a **train's consist** — a collection of bogies (coaches/cars) attached to an engine.

## 📖 About the Project

This project progressively teaches Java **Collections Framework** concepts through 7 use cases, each building on the previous one using a realistic railway scenario.

## 🛤️ Use Cases

| UC  | Title | Java Concept |
|-----|-------|--------------|
| UC1 | Initialize Train and Display Consist Summary | `ArrayList`, `List` Interface, `main()` |
| UC2 | Add Passenger Bogies to Train | `ArrayList` CRUD: `add()`, `remove()`, `contains()` |
| UC3 | Track Unique Bogie IDs | `HashSet`, `Set` Interface, deduplication |
| UC4 | Maintain Ordered Bogie IDs | `LinkedList`, `addFirst()`, `addLast()`, positional `add()`/`remove()` |
| UC5 | Preserve Insertion Order of Bogies | `LinkedHashSet` — uniqueness + insertion order |
| UC6 | Map Bogie to Capacity | `HashMap`, `Map` Interface, `put()`, `entrySet()` |
| UC7 | Sort Bogies by Capacity | `Comparator`, `comparingInt()`, lambda expressions |

## 📁 Project Structure

```
TrainManagementApp/
├── src/
│   ├── Bogie.java                    # Model class used in UC7
│   ├── UC1_InitializeTrain.java      # UC1 – ArrayList initialization
│   ├── UC2_AddPassengerBogies.java   # UC2 – ArrayList CRUD
│   ├── UC3_TrackUniqueBogieIDs.java  # UC3 – HashSet deduplication
│   ├── UC4_MaintainOrderedBogies.java# UC4 – LinkedList ordering
│   ├── UC5_PreserveInsertionOrder.java # UC5 – LinkedHashSet
│   ├── UC6_MapBogieCapacity.java     # UC6 – HashMap key-value
│   ├── UC7_SortBogiesByCapacity.java # UC7 – Comparator sorting
│   └── MainApp.java                  # Runs all UC1–UC7 together
└── README.md
```

## 🚀 How to Compile and Run

### Compile all files from project root:
```bash
cd src
javac Bogie.java UC1_InitializeTrain.java UC2_AddPassengerBogies.java UC3_TrackUniqueBogieIDs.java UC4_MaintainOrderedBogies.java UC5_PreserveInsertionOrder.java UC6_MapBogieCapacity.java UC7_SortBogiesByCapacity.java MainApp.java
```

### Run individual use cases:
```bash
java UC1_InitializeTrain
java UC2_AddPassengerBogies
java UC3_TrackUniqueBogieIDs
java UC4_MaintainOrderedBogies
java UC5_PreserveInsertionOrder
java UC6_MapBogieCapacity
java UC7_SortBogiesByCapacity
```

### Run all use cases together:
```bash
java MainApp
```

## 🧠 Key Learning Outcomes

- **UC1**: Application startup, `List` interface, dynamic initialization
- **UC2**: CRUD on collections — insert, delete, search with `ArrayList`
- **UC3**: `HashSet` enforces **uniqueness** without manual checks
- **UC4**: `LinkedList` preserves **order** and supports efficient head/tail operations
- **UC5**: `LinkedHashSet` = uniqueness **AND** insertion order in one structure
- **UC6**: `HashMap` maps bogies to their operational attributes (key–value pairs)
- **UC7**: `Comparator` + lambda = **custom sorting** of objects by business rules

## 📦 Domain Concepts

- **Bogie**: A coach/car unit attached to the train engine
- **Consist**: The complete ordered set of bogies forming the train
- **Passenger Bogies**: Sleeper, AC Chair, First Class, Second Class, AC 3-Tier
- **Capacity**: Number of seats in a passenger bogie

## 👤 Author

**RA2411056010017** — SRM Institute of Science and Technology
