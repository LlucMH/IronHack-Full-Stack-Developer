fetch("movies.json")
  .then((res) => res.json())
  .then((movies) => {
    const container = document.getElementById("movie-container");
    movies.forEach((movie) => {
      container.appendChild(MovieCard(movie));
    });
  });

function MovieCard({ title, year, genre, synopsis }) {
  const card = document.createElement("div");
  card.className = "movie-card";

  const h2 = document.createElement("h2");
  h2.textContent = title;

  const meta = document.createElement("small");
  meta.textContent = `${year} | ${genre}`;

  const desc = document.createElement("p");
  desc.textContent = synopsis;

  card.appendChild(h2);
  card.appendChild(meta);
  card.appendChild(desc);

  return card;
}
