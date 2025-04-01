console.log("✅ projectDetailsBonus.js cargado");

import { getSelectedUUIDBonus } from "/js/components/utilsBonus.js";

async function loadProjectDetailBonus() {
  console.log("📦 Ejecutando loadProjectDetailBonus()");

  try {
    const res = await fetch(
      "https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects"
    );
    const projects = await res.json();

    const selectedUUID = getSelectedUUIDBonus();
    const selectedProject = projects.find(
      (project) => project.uuid === selectedUUID
    );

    console.log("🎯 Proyecto seleccionado:", selectedProject);

    if (!selectedProject) {
      console.error(`Project with UUID ${selectedUUID} not found`);
      return;
    }

    const container = document.querySelector(".project-details-bonus");
    if (!container) {
      console.error(".project-details-bonus container not found");
      return;
    }

    const card = document.createElement("div");
    card.innerHTML = `
      <div class="project-details-container">
        <h1 class="project-name">${selectedProject.name}</h1>
        <div class="project-details-subtitle">
          <p class="project-description body-medium">${selectedProject.description}</p>
          <p class="project-completed_on body-regular">Completed on ${selectedProject.completed_on}</p>
        </div>
        <img class="project-image" src="${selectedProject.image}" alt="Project image">
        <p class="project-content body-regular">${selectedProject.content}</p>
      </div>
    `;
    container.appendChild(card);
  } catch (error) {
    console.error("Error loading project detail:", error);
  }
}

loadProjectDetailBonus();
