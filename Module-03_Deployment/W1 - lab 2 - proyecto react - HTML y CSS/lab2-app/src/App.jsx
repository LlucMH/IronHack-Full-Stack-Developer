import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  return (
    <div>
      <h1>Lluc</h1>
      <h2>Mata</h2>

      <h3>Mis aficiones:</h3>
      <ul>
        <li>Esgrima histórica</li>
        <li>Programar</li>
        <li>Pintar</li>
      </ul>

      <img 
        src=".\public\luffy.jpg" 
        alt="Luffy" 
      />

      <p>
        Visita <a href="https://github.com/LlucMH" target="_blank">Mi GitHub</a>
      </p>
    </div>
  );
}

export default App
