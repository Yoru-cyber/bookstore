import './index.css'
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './pages/home';
import About from './pages/about';
import NavBar from './components/navbar';
import Books from './pages/books';
function App() {

  return (
    <>
      <NavBar />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />}></Route>
          <Route path="/about" element={<About />}></Route>
          <Route path="/books" element={<Books />}></Route>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App
