import { Routes, Route, NavLink, Navigate } from 'react-router-dom';
import Home from './components/Home';
import Canciones from './components/Canciones';
import Contacto from './components/Contacto';
import NotFound from './components/NotFound';

export default function App() {
  return (
    <>
      <nav style={{ padding: 16, display: 'flex', gap: 12, borderBottom: '1px solid #ddd' }}>
        <NavLink to="/home">Home</NavLink>
        <NavLink to="/canciones">Canciones</NavLink>
        <NavLink to="/contacto">Contacto</NavLink>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/home" element={<Home />} />
        <Route path="/canciones" element={<Canciones />} />
        <Route path="/contacto" element={<Contacto />} />
        <Route path="/inicio" element={<Navigate to="/home" replace />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </>
  );
}
