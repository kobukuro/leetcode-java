# LeetCode Java Solutions

A collection of LeetCode problem solutions implemented in Java with detailed complexity analysis and test coverage.

## Migration Status

🔄 **Currently migrating from old structure to new directory structure**

This project is being reorganized.

- ✅ Migrated problems in `src/main/java/com/leetcode/` directory
- ⏳ Legacy problems still being migrated

## Project Structure

```
leetcode-java/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── leetcode/
│   │               ├── easy/           # Easy difficulty problems
│   │               ├── medium/         # Medium difficulty problems
│   │               ├── hard/           # Hard difficulty problems
│   │               └── datastructure/  # Data structure implementations
│   └── test/
│       └── java/
│           └── com/
│               └── leetcode/
│                   ├── easy/           # Test cases for easy problems
│                   ├── medium/         # Test cases for medium problems
│                   └── hard/           # Test cases for hard problems
├── docs/                  # Detailed problem lists by difficulty
├── pom.xml               # Maven configuration
└── README.md             # This file
```

Each problem follows this structure:
```
{difficulty}/{ProblemName}{Number}.java          # Solution implementation
{difficulty}/{ProblemName}{Number}Test.java     # Test cases
```

## Solutions

📊 **Statistics**: 51 problems solved (migrated to new structure)

| Difficulty | Count |
|------------|-------|
| Easy       | 35    |
| Medium     | 15    |
| Hard       | 1     |

### Browse by Difficulty

- 📗 [Easy Problems](docs/EASY.md)
- 📘 [Medium Problems](docs/MEDIUM.md)
- 📕 [Hard Problems](docs/HARD.md)

## Author

[Peter Chen](https://github.com/kobukuro)
