import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import PlaneModelList from './components/PlaneModelList';
import PilotList from './components/PilotList';
import AddressList from './components/AddressList';
import FlightDescriptionList from './components/FlightDescriptionList';
import FlightList from './components/FlightList';
import PlaneList from './components/PlaneList';
import CertificateList from './components/CertificateList';
import AirportList from './components/AirportList';



class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
        <PlaneModelList/>
        <PilotList/>
        <AddressList/>
        <FlightDescriptionList/>
        <FlightList/>
        <PlaneList/>
        <CertificateList/>
        <AirportList/>
      </div>
    );
  }
}


export default App;


