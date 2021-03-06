import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
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
            <EntityList/>
        </div>
        <div className="rightcolumn">Flex Body
        </div>
        </div>
      </div>
    );
  }
}

export default App;
