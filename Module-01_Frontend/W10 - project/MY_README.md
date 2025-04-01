# Circle Agency – Responsive Website

**Circle Agency** is a fully responsive website built exclusively with **HTML**, **CSS**, and **JavaScript**, without the use of any frameworks. This project demonstrates a modular architecture with dynamic component loading and a clean, scalable approach to frontend development.

## 🌐 Demo

[🔗 Live Demo on Netlify](https://your-site.netlify.app) _(replace with your deployed URL)_

## 🧩 Key Features

- ✅ Component-based architecture (modular HTML + JS).
- 🎯 Fully responsive design using custom CSS.
- 📁 Scalable structure: separation of styles, utilities, and logic.
- 📦 Dynamic loading of HTML and scripts based on page content.
- 💬 Clean, commented code with no external dependencies.

## 🛠️ Technologies Used

- **HTML5**
- **CSS3** (Flexbox, media queries, modular structure)
- **JavaScript (ES6+)** – dynamic `import()`, error handling, DOM manipulation
- **Git + Netlify** for deployment

## 📁 Project Structure

```
├── index.html
├── components/
│   └── component-header.html, ...
├── js/
│   ├── loadComponents.js
│   └── components/ ...
├── css/
│   ├── style.css
│   ├── _colors.css
│   ├── components/ ...
├── assets/
│   └── images/ ...
```

## 🚀 Running the Project Locally

1. Clone the repository:

   ```bash
   git clone --filter=blob:none --no-checkout https://github.com/LlucMH/IronHack-Full-Stack-Developer.git
   cd IronHack-Full-Stack-Developer
   git sparse-checkout init --cone
   git sparse-checkout set "Module-01_Frontend/W10 - project"
   ```

2. Open `index.html` directly in your browser, or use a local server like **Live Server** (VSCode) for better compatibility with relative paths.

## 🌍 Deploying on Netlify

This project is set up to be easily deployed on [Netlify](https://www.netlify.com/):

1. Connect your Git repository.
2. Set the build command: (none).
3. Set the output directory: / (project root).
4. Done!

## 🙌 Credits

Base design provided as an educational reference. Full code implementation and architecture by [LlucMH](https://github.com/LlucMH).

## 📌 Note

This project was intentionally built without using any frameworks to demonstrate strong command of modern web development fundamentals using only native technologies.
