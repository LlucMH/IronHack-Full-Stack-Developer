import { canciones } from '../data/canciones';

export default function Canciones() {
  return (
    <section style={{ padding: 24 }}>
      <h2>Lista de canciones</h2>
      <ul>
        {canciones.map(c => (
          <li key={c.id}>{c.titulo} — {c.artista} ({c.anio})</li>
        ))}
      </ul>
    </section>
  );
}
