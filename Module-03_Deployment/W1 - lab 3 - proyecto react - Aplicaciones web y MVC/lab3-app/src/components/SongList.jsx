import songs from "../data/songs.json";

function secondsToMMSS(s) {
  const m = Math.floor(s / 60);
  const sec = String(s % 60).padStart(2, "0");
  return `${m}:${sec}`;
}

export default function SongList() {
  return (
    <section className="card">
      <h2>Mis canciones</h2>
      <ul className="songs">
        {songs.map((song, idx) => (
          <li key={idx} className="song">
            <img src={song.imagenAlbum} alt={`Portada ${song.album}`} />
            <div className="info">
              <h3>{song.titulo}</h3>
              <p>Álbum: {song.album}</p>
              <p>Duración: {secondsToMMSS(song.duracion)}</p>
              <p>Valoración: {"★".repeat(song.valoracion)}{"☆".repeat(5 - song.valoracion)}</p>
            </div>
          </li>
        ))}
      </ul>
    </section>
  );
}
