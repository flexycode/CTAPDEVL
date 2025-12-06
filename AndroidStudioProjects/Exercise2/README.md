# 📱 Hello User App

<p align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Material_Design-757575?style=for-the-badge&logo=material-design&logoColor=white" alt="Material Design"/>
  <img src="https://img.shields.io/badge/API_21+-brightgreen?style=for-the-badge" alt="API 21+"/>
</p>

<p align="center">
  A simple Android application that greets users by name using Material Design components.
</p>

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🎨 **Material Design** | Modern UI using Material TextInputLayout |
| 📝 **Name Input** | Clean text field with outlined style |
| 👋 **Personalized Greeting** | Dynamic "Hello, [Name]!" message |
| 📱 **Responsive** | Works on Android 5.0 (API 21) and above |

---

## 🚀 Getting Started

### Prerequisites

- ☕ **Java 11** or higher
- 📦 **Android Studio** (latest version recommended)
- 📱 **Android SDK** with API 21+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/HelloUserApp.git
   ```

2. **Open in Android Studio**
   ```
   File → Open → Select HelloUserApp folder
   ```

3. **Sync Gradle**
   ```
   Click "Sync Project with Gradle Files" 🔄
   ```

4. **Run the app**
   ```
   Click ▶️ Run or press Shift + F10
   ```

---

## 🎯 How to Use

| Step | Action | Result |
|------|--------|--------|
| 1️⃣ | Launch the app | See the main screen |
| 2️⃣ | Enter your name in the text field | Type any name |
| 3️⃣ | Tap the **"Greet"** button | See personalized greeting! |

**Example Output:**
```
Hello, Jay Arre! Welcome to Android Development.
```

---

## 📁 Project Structure

```
HelloUserApp/
├── 📁 app/
│   ├── 📁 src/main/
│   │   ├── 📁 java/com/example/hellouserapp/
│   │   │   └── 📄 MainActivity.java      # Main logic
│   │   ├── 📁 res/
│   │   │   ├── 📁 layout/
│   │   │   │   └── 📄 activity_main.xml  # UI layout
│   │   │   └── 📁 values/
│   │   │       ├── 📄 strings.xml        # String resources
│   │   │       ├── 📄 colors.xml         # Color palette
│   │   │       └── 📄 themes.xml         # App theme
│   │   └── 📄 AndroidManifest.xml        # App config
│   └── 📄 build.gradle.kts               # Module dependencies
├── 📄 build.gradle.kts                   # Project config
├── 📄 settings.gradle.kts                # Project settings
└── 📄 README.md                          # This file
```

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) | Primary language |
| ![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white) | Platform |
| ![Material](https://img.shields.io/badge/Material-757575?style=flat-square&logo=material-design&logoColor=white) | UI Components |
| ![Gradle](https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white) | Build system |

---

## 📋 Requirements

| Requirement | Minimum | Target |
|-------------|---------|--------|
| Android API | 21 (Lollipop) | 36 |
| Java | 11 | 11 |
| Gradle | 8.x | 8.13.1 |

---

## 🎨 UI Components Used

- **TextInputLayout** - Material outlined text field container
- **TextInputEditText** - Enhanced EditText for name input
- **Button** - Material button for submission
- **TextView** - Display greeting message
- **LinearLayout** - Vertical layout container

---

## 📝 Code Highlights

### MainActivity.java
```java
// Get user input
String name = etName.getText().toString().trim();

// Display personalized greeting
if (!name.isEmpty()) {
    String message = "Hello, " + name + "! Welcome to Android Development.";
    tvGreeting.setText(message);
}
```

---

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch
3. 💾 Commit your changes
4. 📤 Push to the branch
5. 🔃 Open a Pull Request

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👤 Author

**Jay Arre Talosig**

- 🐙 GitHub: [@flexycode](https://github.com/flexycode)

---

<p align="center">
  Made with ❤️ for Android Development
</p>
