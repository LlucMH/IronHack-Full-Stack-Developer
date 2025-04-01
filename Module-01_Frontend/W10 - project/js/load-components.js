const components = document.querySelectorAll("[data-component]");

components.forEach(async (item) => {
  const name = item.dataset.component;
  try {
    const res = await fetch(`/components/${name}.html`);
    if (!res.ok) throw new Error(`404: ${name}.html no encontrado`);
    const html = await res.text();
    item.innerHTML = html;

    if (name === "component-header") {
      const currentPage = window.location.pathname;
      const isHome = currentPage === "/" || currentPage.endsWith("index.html");

      const headerScript = isHome
        ? "./components/header.js"
        : "/js/components/header.js";

      import(headerScript);
    }
  } catch (err) {
    console.error(`Error cargando componente ${name}:`, err);
    item.innerHTML = `<p style="color:red;">Error cargando componente: ${name}</p>`;
  }
});
