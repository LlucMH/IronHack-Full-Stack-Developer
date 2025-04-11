const toggleButton = document.querySelector(".header-toggle");
const nav = document.querySelector(".header-menu");

if (toggleButton && nav) {
  toggleButton.addEventListener("click", () => {
    nav.classList.toggle("open");

    const isOpen = nav.classList.contains("open");
    toggleButton.textContent = isOpen ? "✕" : "☰";
  });
}
