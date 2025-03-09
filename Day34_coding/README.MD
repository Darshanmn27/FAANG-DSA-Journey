# 📁 File Handling in Java

File Handling in Java allows us to read, write, and manipulate files stored on our system. Java provides several classes and methods to handle files such as reading, writing, creating, and deleting files.

---

## 📌 Why File Handling is Important?
- **Data Persistence:** Allows storing data permanently.
- **Reading Files:** You can read data from files (like configuration, input files, etc.).
- **Writing Files:** You can create, modify, or update files.
- **Serialization:** Converting objects into a file format for future use.
- **Real-World Usage:** Used in projects like **log files, reports, data storage, file processing, etc.**

---

## 📊 File Handling Classes in Java

### 1. **File Class (java.io.File)**
The `File` class is used to represent files and directories in Java. It provides methods to perform operations like creating, deleting, checking existence, etc.

### ✅ Example - Creating a File
```java
import java.io.File;

public class FileCreation {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### Methods of File Class:
| Method  | Description  |
|---------|-------------|
| `createNewFile()` | Creates a new file.  |
| `delete()` | Deletes the file. |
| `exists()` | Checks if the file exists. |
| `getName()` | Returns the name of the file. |
| `getAbsolutePath()` | Returns the absolute path of the file. |

---

## 📖 FileReader & FileWriter

### ✅ FileReader (java.io.FileReader)
The `FileReader` class is used to read the contents of a file character by character.

### ✅ Example - Reading a File
```java
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### ✅ FileWriter (java.io.FileWriter)
The `FileWriter` class is used to write character data into a file.

### ✅ Example - Writing to a File
```java
import java.io.FileWriter;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello CodeWarrior! This is File Handling.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📂 BufferedReader & BufferedWriter

### ✅ BufferedReader (java.io.BufferedReader)
- Efficient for reading text files.
- Can read entire lines at once.

### ✅ Example - Reading with BufferedReader
```java
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### ✅ BufferedWriter (java.io.BufferedWriter)
- Efficient for writing large amounts of text.

### ✅ Example - Writing with BufferedWriter
```java
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello from BufferedWriter.");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📜 ObjectOutputStream & ObjectInputStream

### ✅ Serialization: Convert Object → File
```java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("object.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(new String("Hello Serialization!"));
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### ✅ Deserialization: Convert File → Object
```java
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("object.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            String data = (String) in.readObject();
            System.out.println(data);
            in.close();
            fileIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## 💡 Real-World Applications

| Scenario  | Usage  |
|------------|-------|
| Logging   | Write logs into a file. |
| Data Storage | Save user data, transactions, etc. |
| Configuration Files | Store app settings. |
| Serialization | Store objects into files. |

---

## ✅ Best Practices for File Handling
1. Always close files after reading/writing.
2. Use **try-with-resources** to avoid memory leaks.
3. Handle exceptions properly.
4. Use **BufferedReader/Writer** for large data.

---

