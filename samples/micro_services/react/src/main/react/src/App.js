import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Details from './Details';
import EntityList from './EntityList';

class App extends Component {
  render() {
    return (
      <div>
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <h1 className="App-title">Welcome to ETE</h1>
          </header>
        </div>
        <div className="row">
        <div className="leftcolumn">
            <EntityList select={(entityName)=>this.changeEntity(entityName)}/>
        </div>
        <div className="rightcolumn">
            <Details/>
        </div>
        </div>
      </div>
    );
  }
  
  changeEntity(entityName) {
      fetch("http://localhost:8080/")
      alert("In change entity : " + entityName);
  }

}       // class App

export default App;
