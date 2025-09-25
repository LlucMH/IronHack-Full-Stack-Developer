import { useState } from 'react';
import './Contacto.css';

export default function Contacto() {
  const [enviado, setEnviado] = useState(false);

  const onSubmit = (e) => {
    e.preventDefault();
    setEnviado(true);
    e.currentTarget.reset();
  };

  return (
    <section className="contacto">
      <h2>Formulario de contacto</h2>

      {enviado && (
        <p className="ok">✅ ¡Gracias por tu mensaje! Te responderé pronto.</p>
      )}

      <form className="contacto-form" onSubmit={onSubmit}>
        <label>
          Nombre:
          <input type="text" name="nombre" placeholder="Tu nombre" required />
        </label>

        <label>
          Email:
          <input type="email" name="email" placeholder="tu@email.com" required />
        </label>

        <label>
          Mensaje:
          <textarea name="mensaje" placeholder="Escribe tu mensaje..." rows="5" required />
        </label>

        <button type="submit">Enviar</button>
      </form>
    </section>
  );
}
