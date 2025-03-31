console.log("header.js loaded ✅");

const toggleButton = document.querySelector(".header-toggle");
const nav = document.querySelector(".header-menu");

if (toggleButton && nav) {
  toggleButton.addEventListener("click", () => {
    console.log("toggle clicked ✅");
    nav.classList.toggle("open");

    const isOpen = nav.classList.contains("open");
    toggleButton.textContent = isOpen ? "✕" : "☰";
  });
}
