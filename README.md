# 🧠 AI Assistant (Java-Based Desktop App)

A simple yet powerful Java-based AI Desktop Assistant that responds to your commands like:
---

- Opening applications
- Browsing websites
- Searching Google
- Showing weather updates
- Displaying date and time

This project showcases the practical implementation of Java with modern APIs and system-level interaction, built using OOP principles.

## 🚀 Features
- ✅ Open default web browser
- ✅ Launch YouTube
- ✅ Open Calculator
- ✅ Launch Notepad
- ✅ Open Spotify
- ✅ Show current Date
- ✅ Show current Time
- ✅ Google Search using natural input
- ✅ Get Real-Time Weather for any city using OpenWeatherMap API

---

## 🛠️ Technologies Used

- **Java 17+**
- **Java HTTP Client (java.net.http)**
- **OJava ProcessBuilder**
- **org.json library for JSON parsing**
- **OpenWeatherMap API**

---

## 📁 Project Structure 
``` 
src/
├── main/
│   ├── AssistantApp.java
│   ├── core/
│   │   └── CommandProcessor.java
│   └── actions/
│       ├── OpenBrowser.java
│       ├── OpenYoutube.java
│       ├── OpenNotePad.java
│       ├── OpenCalculator.java
│       ├── OpenSpotify.java
│       ├── ShowDate.java
│       ├── ShowTime.java
│       ├── SearchGoogle.java
│       └── GetWeather.java
 ```

---

## 🧑‍💻 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/kunallad0007/AI-Assistant.git
   cd AI-Assistant

2. Open in IntelliJ IDEA or your favorite Java IDE.
3. Add the json-20250107.jar library to your project (This is required for parsing weather API responses)
4. Run the AssistantApp.java main class

---

## 🔑 Weather API Setup
### To enable weather functionality:

- Sign up at [OpenWeatherMap](https://home.openweathermap.org/)
- Get your API key
- Paste it inside `GetWeather.java` in this line:
```bash
   String apiKey = "your_api_key_here";
```
---
## 🧠 Example Commands

- open browser
- what is the time
- open notepad
- open youtube
- what's the weather in (City Name)
- search google how to learn java

---

## 📦 Future Scope

- 🗣️ Voice recognition input
- 🗨️ Text-to-speech responses
- 🌦️ Weather integration via API
- 🧠 NLP-based smart understanding
- 🖥️ JavaFX-based GUI interface

---

## ✨ Author
[Kunal Lad]
💼 Aspiring Software Engineer | AI Enthusiast   
🔗 [LinkedIn](https://www.linkedin.com/in/kunallad0007/) | 📧 kunal0007@gmail.com

---

## 📜 License
### This project is open-source under the [MIT License](https://opensource.org/license/mit).


---

Let me know:
- Your **name / LinkedIn / GitHub** links and I’ll customize it
- Or if you want to include screenshots or demo GIFs later





