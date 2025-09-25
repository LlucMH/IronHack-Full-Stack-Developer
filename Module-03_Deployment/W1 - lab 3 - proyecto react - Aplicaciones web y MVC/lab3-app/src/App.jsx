import "./index.css";
import SongList from "./components/SongList";
import Hobbies from "./components/Hobbies";

export default function App() {
  return (
    <main className="container">
      <header>
        <h1>Lluc</h1>
        <h2>Mata</h2>
      </header>

      <Hobbies />
      <SongList />

      <footer>
        <p>
          Enlace útil:{" "}
          <a href="https://www.google.com" target="_blank" rel="noreferrer">
            Google
          </a>
        </p>
      </footer>
    </main>
  );
}
