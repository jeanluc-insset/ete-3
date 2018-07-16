import React, { Component } from 'react';



import EntityName from './EntityName';
import AndMineTooComponent from './AndMineTooComponent';
import ChangeMyNameComponent from './ChangeMyNameComponent';


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
          {this.renderEntity("AndMineToo")}
          {this.renderEntity("ChangeMyName")}
          </div>
          )
    }

}





