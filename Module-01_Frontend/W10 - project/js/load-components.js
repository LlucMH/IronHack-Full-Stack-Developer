const components = document.querySelectorAll("[data-component]");

components.forEach(async (item) => {
  const name = item.dataset.component;
  const res = await fetch(`./components/${name}.html`);
  const html = await res.text();
  item.innerHTML = html;

  if (name === "component-header") import(`./components/header.js`);
});
