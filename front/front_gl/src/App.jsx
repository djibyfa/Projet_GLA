import './App.css';
import Navbar from './components/Navbar';
import { BrowserRouter } from 'react-router-dom';
import { useState } from 'react';

/**
 * Import Components
 */
import { Header } from './components/Header';
import { Imprint } from './components/Imprint';
import { Main } from './components/Main';
import { Footer } from './components/Footer';

/**
 * Import Styles
 */
import "./assets/styles/index.css";


function App() {
  const [showImprint, setShowImprint] = useState(false);

  const handleClick = (newValue) => {
    setShowImprint(newValue);
  }

  return (
    <BrowserRouter>
      <Navbar />
      <Header activeLink={showImprint} onClickCallback={handleClick}></Header>
      {showImprint && <Imprint />}
      {!showImprint && <Main />}
      <Footer />
      </BrowserRouter>
  );
}

export default App;
