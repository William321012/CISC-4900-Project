import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Navbar from './components/Navbar/Navbar'
import Footer from './components/Footer/Footer'
import Home from './pages/Home';
import About from './pages/About'
import Brands from './pages/Brands';

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/about' element={<About />} />
          <Route path='/brands' element={<Brands />} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
