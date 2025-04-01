async function loadProjectDetail() {
  try {
    const res = await fetch(
      "https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects"
    );
    const projects = await res.json();

    console.log("Projects from API:", projects);

    const container = document.querySelector(".project-details");
    if (!container) {
      console.error(".project-details container not found");
      return;
    }

    const selectedProject = projects.find((project) => project.uuid === "1");

    if (!selectedProject) {
      console.error("Project with UUID 1 not found");
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

loadProjectDetail();
