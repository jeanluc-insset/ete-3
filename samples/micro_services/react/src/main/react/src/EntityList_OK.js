import React, { Component } from 'react';

import EntityName from './EntityName';


export default class EntityList extends Component {

    state = {
        selected : undefined
    }
    
    renderEntity(entityName) {
        return (
            <EntityName name={entityName}
                onClick = {(entity) => this.select(entity)}
            />
        );
    }

    select(entityName) {
        alert("Coucou from : " + entityName.props.name);
    }
        
    render() { 
        return (
          <div className="EntityList">
          {this.renderEntity("Change my name")}
          {this.renderEntity("And mine too")}
          {this.renderEntity("And this one as well")}
          {this.renderEntity("And this one")}
          {this.renderEntity("And one more")}
          </div>
          )
    }

}




