import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import './App.css';
import Navbar from './component/Navbar';
import Home from './component/Home';
import Register from "./component/Register";
import Login from "./component/Login";


function App() {

  return (
    <>
    
    <Navbar/>
     <Router>
      <Routes>
        
          <Route path="/" element={<Home/>} exact/>
          <Route path="/register" element={<Register/>} exact/>
          <Route path="/login" element={<Login/>} exact/>
          

        
      </Routes>
    </Router> 

    </>
  );
}

export default App;
