console.log("event404.js loaded ✅");

function event404(event) {
  event.preventDefault();
  console.log("Redirecting to custom 404 page...");
  window.location.href = "/pages/bonus/404.html";
}
