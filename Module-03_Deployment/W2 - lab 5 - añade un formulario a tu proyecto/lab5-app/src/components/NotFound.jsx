import { NavLink } from 'react-router-dom';

export default function NotFound() {
  return (
    <section style={{ padding: 24 }}>
      <h2>404 - Página no encontrada</h2>
      <NavLink to="/home">Volver al inicio</NavLink>
    </section>
  );
}
