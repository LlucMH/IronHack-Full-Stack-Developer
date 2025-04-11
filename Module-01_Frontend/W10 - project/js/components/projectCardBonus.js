import { getSelectedUUIDBonus } from "/js/components/utilsBonus.js";

async function loadOtherProjectsBonus() {
  try {
    const res = await fetch(
      "https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects"
    );
    const projects = await res.json();

    const container = document.querySelector(".project-card-container-bonus");
    if (!container) {
      console.error(".project-card-container-bonus no encontrada");
      return;
    }

    const currentUUID = getSelectedUUIDBonus();
    const filteredProjects = projects.filter((p) => p.uuid !== currentUUID);
    const selectedProjects = filteredProjects.slice(0, 3);

    selectedProjects.forEach((project) => {
      const card = document.createElement("div");
      card.classList.add("project-card");

      card.innerHTML = `
        <div class="project-card-icon-container">
          <img class="project-card-icon" src="${project.image}" alt="Project image" />
        </div>
        <div class="project-card-text-container">
          <h4 class="project-card-title">${project.name}</h4>
          <p class="project-card-text body-regular">${project.description}</p>
        </div>
        <p class="project-card-anchor headline-regular">Learn more</p>
      `;

      card.style.cursor = "pointer";
      card.addEventListener("click", () => {
        window.location.href = `/pages/bonus/projects.html?uuid=${project.uuid}`;
      });

      container.appendChild(card);
    });

  } catch (error) {
    console.error("Error loading other projects:", error);
  }
}

loadOtherProjectsBonus();
