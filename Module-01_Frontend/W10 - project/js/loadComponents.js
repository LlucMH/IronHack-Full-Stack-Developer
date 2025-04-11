const components = document.querySelectorAll("[data-component]");

components.forEach(async (item) => {
  const name = item.dataset.component;

  try {
    const res = await fetch(`/components/${name}.html`);
    if (!res.ok) throw new Error(`404: ${name}.html not found`);

    const html = await res.text();
    item.innerHTML = html;

    if (name === "component-header") {
      const currentPage = window.location.pathname;
      const isHome = currentPage === "/" || currentPage.endsWith("index.html");

      const headerScript = isHome
        ? "./components/header.js"
        : "/js/components/header.js";

      await import(headerScript);
    }

    if (name === "component-project-details") {
      await import("/js/components/projectDetails.js");
      await import("/js/components/event404.js");
    }

    if (name === "component-other-projects") {
      await import("/js/components/projectCard.js");
    }

    if (name === "component-project-details-bonus") {
      await import("/js/components/utilsBonus.js");
      await import("/js/components/projectDetailsBonus.js");
    }

    if (name === "component-other-projects-bonus") {
      await import("/js/components/utilsBonus.js");
      await import("/js/components/projectCardBonus.js");
    }

  } catch (err) {
    console.error(`Error loading component ${name}:`, err);
    item.innerHTML = `<p style="color:red;">Error loading component: ${name}</p>`;
  }
});
