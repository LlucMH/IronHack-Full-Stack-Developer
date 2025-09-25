export default function Hobbies() {
  const hobbies = ["Esgrima histórica", "Programar", "Fotografía artística", "Visitar museos"];
  return (
    <section className="card">
      <h2>Mis aficiones</h2>
      <ul className="hobbies">
        {hobbies.map((h) => (
          <li key={h}>{h}</li>
        ))}
      </ul>
    </section>
  );
}
