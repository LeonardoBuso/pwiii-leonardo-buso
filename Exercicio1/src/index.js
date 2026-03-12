import { StrictMode } from "react"; // react
import { createRoot } from "react-dom/client"; // Biblioteca do React para comunicação com navegadores web (React DOM)  
import "./styles.css";

import App from "./App";

const root = createRoot(document.getElementById("root"));
root.render(
  <StrictMode>
    <App />
  </StrictMode>
);