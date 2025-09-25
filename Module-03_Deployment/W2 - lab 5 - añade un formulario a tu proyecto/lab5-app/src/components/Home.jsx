export default function Home() {
  return (
    <section>
      <h1>Bienvenid@ a MiMusic</h1>
      <p>
        Esta es una pequeña app para practicar <strong>React Router</strong>.
        Navega al apartado de <strong>Canciones</strong> o usa el formulario de <strong>Contacto</strong>.
      </p>
      <ul>
        <li><code>/</code> y <code>/home</code> → Home</li>
        <li><code>/canciones</code> → Lista de canciones</li>
        <li><code>/contacto</code> → Formulario de contacto</li>
        <li>Rutas no encontradas → Página 404</li>
      </ul>
    </section>
  )
}
