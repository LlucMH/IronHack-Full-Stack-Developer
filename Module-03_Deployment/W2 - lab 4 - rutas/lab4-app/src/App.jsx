import { Routes, Route, NavLink, Navigate } from 'react-router-dom'
import Home from './components/Home'
import Canciones from './components/Canciones'
import NotFound from './components/NotFound'

export default function App() {
  return (
    <>
      <nav style={{ marginBottom: 16 }}>
        <NavLink to="/home">Home</NavLink>{' | '}
        <NavLink to="/canciones">Canciones</NavLink>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/home" element={<Home />} />
        <Route path="/canciones" element={<Canciones />} />
        <Route path="/inicio" element={<Navigate to="/home" replace />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </>
  )
}
