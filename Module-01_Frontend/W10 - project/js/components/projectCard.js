async function loadOtherProjects() {
  try {
    const res = await fetch(
      "https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects"
    );

    const projects = await res.json();

    const container = document.querySelector(".project-card-container");

    if (!container) {
      console.warn("'.project-card-container' not found in the DOM");
      return;
    }

    const selectedProjects = projects.slice(1, 4);

    selectedProjects.forEach((project, index) => {
      const card = document.createElement("div");
      card.classList.add("project-card");

      card.innerHTML = `
        <div class="project-card-icon-container">
          <img
            class="project-card-icon"
            src=${project.image}
            alt="Project image"
          />
        </div>
        <div class="project-card-text-container">
          <h4 class="project-card-title">${project.name}</h4>
          <p class="project-card-text body-regular">${project.description}</p>
        </div>
        <a class="project-card-anchor headline-regular" href="/pages/bonus/404.html">
          Learn more
        </a>
      `;

      container.appendChild(card);
    });

  } catch (error) {
    console.error("Error loading projects", error);
  }
}

loadOtherProjects();
