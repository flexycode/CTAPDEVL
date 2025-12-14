# 📱 SimpleCV Android App

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

**SimpleCV** is a native Android application designed to collect and submit Curriculum Vitae (CV) information. It features a clean, professional user interface and demonstrates core Android concepts like form handling, dialogs, and resource management.

---

## 🚀 Features

*   **📝 Comprehensive Form**: Collects personal details including Name, Address, City, Birthdate, Degree, and Position.
*   **📅 Interactive Date Picker**: Easy-to-use calendar dialog for selecting birthdates.
*   **🔽 Dynamic Spinner**: Dropdown selection for personal prefixes (Mr., Ms., Mrs.).
*   **🎨 Professional UI**: Styled with a modern "Blue Slate" color theme for a polished look.
*   **✅ Submission Feedback**: Instant visual confirmation via a popup dialog upon form submission.

---

## 🛠️ Tech Stack

*   **Language**: Java
*   **UI Layout**: XML (ScrollView, LinearLayout)
*   **Build System**: Gradle (Kotlin DSL)
*   **Min SDK**: 24
*   **Target SDK**: 36

---

## 💻 How to Run in Android Studio

Follow these steps to get the app running on your local machine:

### 1. Prerequisites
*   **Android Studio**: Ensure you have the latest version installed (Ladybug or newer recommended).
*   **JDK**: Java Development Kit 11 or higher.

### 2. Open the Project
1.  Launch **Android Studio**.
2.  Select **Open** and navigate to the project execution directory:
    ```
    c:\Users\flexycode\AndroidStudioProjects\simpleCV
    ```
3.  Click **OK** to open.

### 3. Sync Gradle
*   Android Studio should automatically start syncing.
*   If not, go to **File > Sync Project with Gradle Files** or click the **Elephant Icon** 🐘 in the toolbar.
*   Wait for the sync to complete successfully.

### 4. Run the App
1.  Connect an **Android Device** via USB (with USB Debugging enabled) or start an **Android Emulator** (AVD).
2.  Click the **Run** button ▶️ (green triangle) in the toolbar.
3.  Select your device if prompted.

---

## 📱 Navigation & Usage

Once the app is launched on your device/emulator:

1.  **Prefix**: Tap the dropdown menu to select your title (Mr, Ms, Mrs).
2.  **Personal Info**: Tap on the text fields ("Last Name, First Name", "Address", etc.) to type your details.
3.  **Birthdate**: Tap the **Birthdate** field to open the calendar. Select your date and click "OK".
4.  **Submit**:
    *   Review your information.
    *   Tap the blue **Submit** button at the bottom.
5.  **Confirmation**: A dialog will appear confirming your application for the specified position. Click **OK** to dismiss.

---

## 📁 Project Structure

```
simpleCV/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/simpleCV/  # Source Code (MainActivity)
│   │   │   ├── res/layout/                 # UI Layouts (activity_main.xml)
│   │   │   └── AndroidManifest.xml         # App Manifest
│   │   └── test/                           # Unit Tests
│   └── build.gradle.kts                    # App-level build config
└── settings.gradle.kts                     # Project settings
```


---

<div align="center">
  <h3>Thank you for visiting!</h3>
  <img src="https://media.giphy.com/media/3oEjHWXddcIYf6stb2/giphy.gif" width="400" alt="Thank You GIF">
</div>

